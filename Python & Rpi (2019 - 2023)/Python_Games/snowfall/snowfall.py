
import random
from settings import *
import math
import arcade


#----CLASSES/FUNCTION----
class Snowflake:
    """
    Each instance of this class represents a single snowflake.
    Based on drawing filled-circles.
    """

    def __init__(self):
        speed = random.randrange(20, 40) 
        angle = random.uniform(math.pi, math.pi * 2) 
        size = random.randrange(4) 
        self.x = 0
        self.y = 0
        self.speed = speed
        self.angle = angle
        self.size = size
        
    def set_new_pos(self):
        self.x = random.randrange(self.x, SCREEN_WIDTH*2)
        self.y = random.randrange(self.y, SCREEN_HEIGHT)
        
        
    def draw(self):
        arcade.start_render()
        # Draw the current position of each snowflake
        arcade.draw_circle_filled(self.x, self.y,
                                    self.size, arcade.color.WHITE)

    def update(self, delta_time):
        
        self.y -= self.speed * delta_time
        if self.y < 0:
            self.set_new_pos()
        self.x += self.speed * math.cos(self.angle) * delta_time
        self.angle += 1 * delta_time
    
