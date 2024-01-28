
import arcade
from settings import *



player_img = ":resources:images/animated_characters/female_person/femalePerson_idle.png"



class Player(arcade.Sprite):
    def __init__(self):
        super().__init__(player_img,SPRITE_SCALING_PLAYER)
        self.center_x = 50
        self.center_y = 50
        
    def __repr__(self):
        return f"center_x {self.center_x} center_y {self.center_y}"
p1 = Player()
print(p1)