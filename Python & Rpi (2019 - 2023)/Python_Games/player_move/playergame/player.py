

class Player(arcade.Sprite):
    def __init__(self, img=player_img):
        super().__init__(img, SPRITE_SCALING)
        self.center_x = 50
        self.center_y = 50
        self.change_x = 0
        self.change_y = 0
        # keys are in order of L, U, R, D
        self.keys = [arcade.key.LEFT,
                     arcade.key.UP,
                     arcade.key.RIGHT,
                     arcade.key.DOWN]
        self.left_pressed = False
        self.right_pressed = False
        self.up_pressed = False
        self.down_pressed = False
        
    def __repr__(self):
        
        return f"x position {self.center_x} with y position {self.center_y} change_x {self.change_x} change y{self.change_y}"
        
    def key_handler(self, key, pressed):
        """called if a key belongs to theplayer instance if the key was pressed, the pressed var is True but if released the pressed var is False

        Args:
            key (int): an int corresponding to a keyboard key pressed
            pressed (bool): True for pressed, False for unpressed 
        """
        if key == self.keys[0]:
            self.left_pressed = pressed
        elif key == self.keys[1]:
            self.up_pressed = pressed
        elif key == self.keys[2]:
            self.right_pressed = pressed
        elif key == self.keys[3]:
            self.down_pressed = pressed
            
    def set_keys(self,key_pressed):
        """[summary]
        Args:
            keys (list of four ints): each int maps to a keyboard
            >>> player2 = Player()
            >>> player.set_keys([
                arcade.key.A,
                arcade.key.W,
                arcade.key.D,
                arcade.key.S,)
            ]
        """
        self.keys = key_pressed
        
        
    def set_position(self,x, y):
        self.center_x = x
        self.center_y = y

    def update(self):
        """ Move the player
        Monitors the status of key_pressed (left, right, up, down)
        and adjust position accordingly"""     
        # Move player.
        self.center_x += self.change_x
        self.center_y += self.change_y
        self.change_x = 0
        self.change_y = 0

        
        if self.up_pressed and not self.down_pressed:
            self.change_y = MOVEMENT_SPEED
        elif self.down_pressed and not self.up_pressed:
            self.change_y = -MOVEMENT_SPEED
        if self.left_pressed and not self.right_pressed:
            self.change_x = -MOVEMENT_SPEED
        elif self.right_pressed and not self.left_pressed:
            self.change_x = MOVEMENT_SPEED
            
        # Check for out-of-bounds of screen
        if self.left < 0:
            self.left = 0
        elif self.right > SCREEN_WIDTH - 1:
            self.right = SCREEN_WIDTH - 1
        if self.bottom < 0:
            self.bottom = 0
        elif self.top > SCREEN_HEIGHT - 1:
            self.top = SCREEN_HEIGHT - 1
            
