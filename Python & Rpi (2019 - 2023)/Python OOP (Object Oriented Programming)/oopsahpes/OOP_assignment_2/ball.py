# @Author:Aflouk
# @Date:2021/01/20 --:--:20
# @LastModifiedBy:Aflouk
# @Last Modified time:2021-01-23 15:33:20

import math
import random as r
import doctest
import arcade
#----GLOBAL----

def random_tuple(lo, hi, num = 2):
    
    list_of_random_nums = []
    for i in range(num):              
        random_num = r.randint(lo,hi)
        list_of_random_nums.append(random_num)
    tuple_of_random_nums = tuple(list_of_random_nums)
    return tuple_of_random_nums

def calc_radius(volume):
    """Function to calculate the radius from the volume 

    Args:
        volume (num): takes numbers (Volume of the sphere)

    Returns:
        num: returns the radius 
    """
    first_bit  =  (4/3) * math.pi  # r**3
    total = volume / first_bit
    return math.pow(total,1/3)


#----CONSTANT----
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)
SCREEN_WIDTH = 500
SCREEN_HEIGHT = 500
SCREEN_TITLE = "Draw Balls"


class Ball:
    """
    Class simulate a Sphere
    
    """
    def __init__(self, radius, color = RED, position = (SCREEN_WIDTH, SCREEN_HEIGHT)):
        assert radius >=0 ,"must be greater than zero"
        if 0 < radius < 1:
            radius = 1        
        self.radius = radius
        self.color = color
        self.position = position
        
    def __repr__(self):
        return f"Sphere with radius {self.radius} and color is {self.color} with position {self.position} "
         
#NOTE:Surface Area	= 4 × π × r2
    def area(self):
        """Function to calculate the area of a sphere

        Returns:
            num: the area of the sphere
        """
        area = math.pi * 4  * self.radius ** 2
        return area

#NOTE:Volume	= (4/3) × π × r3
    def volume(self):
        """Function to calculate the voume of a sphere

        Returns:
            num: volume of the sphere
        """
        volume = math.pi * self.radius **3  * (4/3) 
        return volume
    
    def draw(self):
        arcade.open_window(SCREEN_WIDTH, SCREEN_HEIGHT, SCREEN_TITLE)
        arcade.draw_circle_filled(SCREEN_WIDTH/2, SCREEN_HEIGHT/2,self.radius,self.color)
        arcade.finish_render()
        arcade.run()
        

    def set_position(self, width, height):
        """Function to set the postion 

        Args:
            width (num): the position of the X axis
            height (num): the position of the Y axis
        """
        self.width = width
        self.height = height

    
    def set_color(self, color):
        self.color = color
        
        
    def __add__(self, other):
        new_area = self.area() + other.area()
        rad = math.sqrt(new_area)
        return Ball(rad, rad)
        
    
    def __sub__(self, other):
        new_area = self.area() - other.area()
        rad = math.sqrt(new_area)
        rad = abs(new_area)
        return Ball(rad, rad)
    
    def __mul__(self, num):
        pass
    
    def __truediv__(self, num):
        pass
    
    def __eq__(self, other):
        pass
    
    def __ne__(self, other):
        pass
    
    def __gt__(self, other):
        pass
    
    def __ge__(self, other):
        pass
    
    def __lt__(self, other):
        pass
    
    def __le__(self, other):
        pass
     




if __name__ == "__main__":
    b1 = Ball(10)
    b1+1
    print(b1)
    
    b1.draw()



