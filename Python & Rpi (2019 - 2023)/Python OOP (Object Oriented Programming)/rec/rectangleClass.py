# @Author:srattigan
# @Date:2021-01-14 11:33:20
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-31 7:00:00

import arcade
import math

# globals
colors = {
    'red': (255, 0, 0),
    'green': (0, 255, 0)
}

# Constants
RED = (255, 0, 0)
GREEN = (0, 255, 0)


class Rectangle:
    def __init__(self, width, height, color=(0, 255, 0)):
        # make sure valid nums, color
        self.height = height
        self.width = width
        self.color = color

    def __repr__(self):
        return f"Rect: w={self.width}; h={self.height}; col={self.color}"

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return (self.width + self.height) * 2

    def set_color(self, col):
        # MAKE SURE VALID COLOR
        self.color = col

    def draw(self):
        SCREEN_HEIGHT = 800
        SCREEN_WIDTH = 600
        SCREEN_TITLE = "i am rectangle"
        arcade.open_window(SCREEN_WIDTH, SCREEN_HEIGHT, SCREEN_TITLE)
        arcade.draw_rectangle_filled(SCREEN_WIDTH/2, SCREEN_HEIGHT/2,self.width,self.height,arcade.color.RED)
        arcade.finish_render()
        arcade.run()

    def __add__(self, other):
        new_area = self.area() + other.area()
        # square_area = side ** 2
        # side = square_area
        side = math.sqrt(new_area) # given a square with area new_area
        return Rectangle(side, side)

    def __sub__(self, other):
        new_area = self.area() - other.area()  # use absolute
        # r1 side is 4, r2 side is 5, what's r1 - r2?
        side = math.sqrt(new_area)
        return Rectangle(side, side)

    def __mul__(self, num):
        new_area = self.area() * num
        side = math.sqrt(new_area)
        return Rectangle(side, side)

    def __truediv__(self, num):
        new_area = self.area() / num
        side = math.sqrt(new_area)
        return Rectangle(side, side)

    def __eq__(self, other):  # ==
        return self.area() == other.area()

    def __ne__(self, other):  # !=
        return self.area() != other.area()

    def __gt__(self, other):
        return self.area() > other.area()

    def __ge__(self, other):
        return self.area() >= other.area()

    def __lt__(self, other):
        return self.area() < other.area()

    def __le__(self, other):
        return self.area() <= other.area()



    



r1 = Rectangle(300,500)
r2 = Rectangle("dog", "cat")
r3 = Rectangle(33, 22)
r4 = r3 + r2
r1.set_color((240, 34, 56))
print(r1)
#print(r1.draw())
