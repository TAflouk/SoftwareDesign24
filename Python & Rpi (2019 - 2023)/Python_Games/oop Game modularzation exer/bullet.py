# create a simple bullet class here

import arcade
from settings import *


class Bullet(arcade.Sprite):
    def __init__(self, center_x, bottom):
        arcade.play_sound(GUN_SOUND)
        super().__init__(BULLET_IMG, SPRITE_SCALING_LASER)
        self.angle = 90
        self.change_y = BULLET_SPEED  # change_y is a property inherited from parent
        self.center_x = center_x  # from origin
        self.bottom = bottom    # from origin

    def update(self):
        if self.bottom > SCREEN_HEIGHT:
            self.kill()
        self.center_y += self.change_y
        

