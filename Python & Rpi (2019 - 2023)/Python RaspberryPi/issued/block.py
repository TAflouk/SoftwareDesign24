# @Author:TAflouk
# @Date:2021-03-08 00:00:00
# @LastModifiedBy:TAflouk
# @Last Modified time:2021-03-08 00:00:00

# -- IMPORTS -- 
import arcade
from settings import *
import doctest

# -- CLASSES/FUNCTIONS -- 
class Block(arcade.Sprite):
    """A simple 2D block class
    Assumes two textures per instance
    """
    def __init__(self, img_file, x, y, width, height, x_offset, txtrs=2):
        super().__init__()
        self.scale = SCALE_BLOCK
        self.textures = []
        self.points = 10
        self.hits = 0
        for t in range(txtrs):
            img_face = arcade.load_texture(img_file, x, y, width, height)
            self.textures.append(img_face)
            x += x_offset + width
        self.texture = self.textures[0]

    def set_pos(self, x, y):
        self.center_x = x
        self.center_y = y

    def hit(self):
        self.hit += 10

    
    def set_img(self,img):
        self.img = img
        
    def __repr__(self):
        return f"Block class with pos({self.center_x}, {self.center_y}) and dims {self.width} x {self.height}"



if __name__ == "__main__":
    test_block = Block(SPRITESHEET, 19, 16, 171, 58, 19)
    print(test_block)
    print("This module has no environment to view and update the sprite.")
    print("Import the class into a game class of arcade.Window to view animations etc.")

