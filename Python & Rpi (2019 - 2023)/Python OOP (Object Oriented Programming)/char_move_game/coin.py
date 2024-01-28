
import arcade
from settings import *
import random

default_img =":resources:images/animated_characters/female_person/femalePerson_idle.png"

class Coin(arcade.Sprite):
    """Emulates a coin

    Args:
        arcade (): inherits from arcade.Sprite class
    """
    
    def __init__(self, img = default_img):
        super().__init__(default_img,SPRITE_SCALING_PLAYER)
        self.center_x = random.randrange(SCREEN_WIDTH)
        self.center_y = random.randrange(SCREEN_HEIGHT)
        
    def __repr__(self):
        center_x = self.center_x
        center_y = self.center_y
        return f"  x = {center_x} y = {center_y}"
    
#c1 = Coin(default_img)
#print(c1)

import os

print(os.getcwd())