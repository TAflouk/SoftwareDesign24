# @Author:TAflouk
# @Date:2021-03-08 00:00:00
# @LastModifiedBy:TAflouk
# @Last Modified time:2021-03-08 00:00:00

# -- IMPORTS --
from settings import *
import arcade
import doctest

keysets = [
    [arcade.key.LEFT,
     arcade.key.UP,
     arcade.key.RIGHT]
    ]

img = PLAYER_IMG
#a = arcade.Sprite()


# imgs[Player.player_num]
class Player(arcade.Sprite):
    """
    A Player moves right and left and shoot bullets
    """
    player_num = 0
    def __init__(self):
        """Constractor
        """
        super().__init__(img, PLAYER_SCL)
        self.center_x = 50
        self.center_y = 100
        self.change_x = 0
        self.speed = MOVEMENT_SPEED
        self.score = 0
        self.live = 3
        self.change_x = 0
        self.p_id = self.player_num + 1
        # keys
        self.keys = keysets[0]
        self.left_pressed = False
        self.right_pressed = False
        self.up_pressed = False

    def __repr__(self):
        """method to test the player class

        Returns:
            [str]: str
        """
        x = self.center_x
        y = self.center_y
        keys = self.keys
        idp = self.p_id
        return f"Player with ID {idp}, score:{self.score}, pos x:{x} y:{y}, keys: {self.keys}"

    def set_pos(self,x,y):
        """Method to set the player position

        Args:
            x (float): num
            y (float): num
        """
        self.x = x
        self.y = y

    def key_handler(self,key ,pressed):
        print(f"key {key} is {pressed}")
        """Called if a key belongs to the Player instance
        if the key was pressed, the pressed var is True
        but if released, the pressed var is False
        Args:
            key (int): an int corresponding to a keyboard key
            pressed (bool): True for pressed, False for released
        """
        if key == self.keys[0]:
            self.left_pressed = pressed
        if key == self.keys[1]:
            self.up_pressed = pressed
        if key == self.keys[2]:
            self.right_pressed = pressed

    def set_keys(self,key_list):
        """Set Method for Player Keys

        Args:
            key_list (list): list of ints
        """
        self.keys = key_list

    def update(self):
        """ Move the player
        Monitors the status of key_pressed (left, right, up, down)
        and adjusts position accordingly
        """
        # Move player.
        self.change_x = 0
        if self.up_pressed :
            self.score += 1 
        if self.left_pressed and not self.right_pressed: #
            self.change_x = -self.speed
        elif self.right_pressed and not self.left_pressed: #  
            self.change_x = self.speed
        self.center_x += self.change_x
        
        # Check for out-of-bounds of screen
        if self.left < 0:
            self.left = 0
        elif self.right > SCREEN_WIDTH - 1:
            self.right = SCREEN_WIDTH - 1
            
    def __str__(self):
        return f"{self.p_id} pos :{self.center_x} {self.center_y} keys: {self.keys}"
            
if __name__=="__main__":
    p1 = Player()
    print(p1)
        