# ------------------------------------------------------------------------------
# Name:        circ.py
# Purpose:     A Circle class
# Author:      srattigan
# Created:     06/01/2019
# Revision:    1.00
# ------------------------------------------------------------------------------

import doctest
import math  # use math.pi
# from math import pi  # use pi

class Circle:
    '''
    Simulates a circle
    '''
    
    def num_chk(some_num):
        '''
        (obj)->bool
        Checks for a valid number type
        '''
        return type(some_num) == int or type(some_num) == float
        
    
    def __init__(self, rad):
        '''
        (Circle, num) -> Circle
        Constructor for class Circle
        >>> x = Circle(6.5)
        >>> x.radius
        6.5
        >>> x = Circle('ten')
        TypeError: Inappropriate argument for radius- must be a numerical type
        >>> x = Circle(-10)
        ValueError: Inappropriate argument for radius- cannot be negative
        '''
        if not num_chk(rad):
            raise TypeError("Inappropriate argument for radius- must be a numerical type")
        # implement code to ensure a number for rad must be positive
        elif rad < 0:
            raise ValueError('Inappropriate argument for radius- cannot be negative')
        # by the time we get to this line, we know that:
        #  - the value for radius is numeric and
        #  - the value for radius is zero or positive
        else:
            self.radius = rad
    
    def __str__(self):  # str is called by print
        '''
        (Circle) -> str
        A string rep of the Circle used by the print function
        >>> x = Circle(6.5)
        >>> print(x)
        Circle: Rad= 6.5
        '''
        return f"Circle: Rad= {self.radius}"
        
    def __repr__(self):  # repr is str to console when the instance is entered
        '''
        (Circle) -> str
        A string rep of the Circle
        >>> x = Circle(6.5)
        >>> x
        <Circle object> r:6.5;
        '''
        return f"<Circle object> r:{self.radius};"

    def area(self):
        '''
        (Circle) -> float
        Calculates the area of the circle
        '''
        return math.pi * self.radius ** 2

    def circumf(self):
        '''
        (Circle) -> float
        Calculates the circumference of the circle
        '''
        return math.pi * (self.radius * 2)
        
    def area_sector(self, angle):
        '''
        (Circle, num) -> float
        Calculates the area of a sector of the circle
        ref: https://www.mathsisfun.com/geometry/circle-sector-segment.html
        '''
        ang = math.radians(angle)
        return (ang/2) * self.radius ** 2


    def __add__(self, other):
        '''
        (Circle, Circle) -> Circle
        Adds two instances of Circle.
        The returned Circle has the combined area of both 
        Circles being added
        >>> x = Circle(5)
        >>> y = Circle(10.0)
        >>> y + x
        '''
        new_area = self.area() + other.area()
        # area = pi * r * r
        new_rad = math.sqrt(new_area / math.pi)
        return Circle(new_rad)


    def __sub__(self, other):
        pass

    def __mul__(self, multiplier):
        '''
        Multiples a circle by a number (n), with the resultant circle
        having an area n times the area of the original circle.
        >>> x = Circle(10)
        >>> x * 5
        <Circle object> r:22.360679775
        '''
        if num_chk(multiplier):
            new_area = self.area() * multiplier
            new_rad = math.sqrt(new_area / math.pi)
            return Circle(new_rad)
        else:
            raise TypeError("Inappropriate argument for radius- must be a numerical type")
        
        

if __name__ == "__main__":
    # doctest.testmod(verbose=True)
    circ_1 = Circle(5)
    circ_2 = Circle(10.0)
    # print(circ_1)
    # print(circ_2)
    # print(circ_1.area()) # -> the area of circ_1;  78.53981633974483
    # print(circ_2.circumf())  # -> the circumference of circ_2; 62.83185307179586
    print(circ_2.area())
    print(circ_2.area_sector(90))  # -> the area of the sector;
    