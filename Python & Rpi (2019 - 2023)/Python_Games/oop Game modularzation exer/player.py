# --- IMPORTS ---
import arcade
from settings import *
from bullet import Bullet


# --- kEYS ---
key_sets = [
    arcade.key.LEFT,
    arcade.key.UP,
    arcade.key.RIGHT,
    # SHOOT KEY 
    ]

img = player_img

class Player(arcade.Sprite):
    player_num = 0
    def __init__(self,img):
        super().__init__(img,SPRITE_SCALING_PLAYER,MOVEMENT_SPEED)
        self.bullet_list = arcade.SpriteList
        self.center_x = 70
        self.center_y = 80
        self.keys = key_sets[self.player_num]
        self.left_pressed = False
        self.up_pressed = False
        self.right_pressed = False
        # score
        #self. _pressed = False shooting 
        self.speed = MOVEMENT_SPEED
        Player.player_num += 1
        
    def __repr__(self):
        """[summary]

        Returns:
            [type]: [description]
        """
        center_x = self.center_x
        center_y = self.center_y
        speed = self.speed
        return f"a player has pos {center_x}, {center_y} {speed}"

    def shout(self):
        self.bullet_list.append(Bullet(self.center_x,self.top))
    
    def update(self):
        self.change_x = 0
        self.change_y = 0
        #if self.up_pressed and not self.down_pressed:
            #self.change_y = MOVEMENT_SPEED
        #elif self.down_pressed and not self.up_pressed:
            #self.change_y = -MOVEMENT_SPEED
        if self.left_pressed and not self.right_pressed:
            self.change_x = -MOVEMENT_SPEED
        elif self.right_pressed and not self.left_pressed:
            self.change_x = MOVEMENT_SPEED
        self.center_x += self.change_x
        self.center_y += self.change_y
        # Check for out-of-bounds of screen
        if self.left < 0:
            self.left = 0
        elif self.right > SCREEN_WIDTH - 1:
            self.right = SCREEN_WIDTH - 1
        if self.bottom < 0:
            self.bottom = 0
        elif self.top > SCREEN_HEIGHT - 1:
            self.top = SCREEN_HEIGHT - 1
    
    def key_handler(self,key,pressed):
        if key == self.keys[0]:
            self.left_pressed = pressed
        if key == self.keys[1]:
            self.up_pressed = pressed
        if key == self.keys[2]:
            self.right_pressed = pressed

    def set_keys(self,key_list):
        self.keys = key_list
        
    def set_pos(self,x,y):
        self.x = x
        self.y = y
        
p = Player("")
print(p)