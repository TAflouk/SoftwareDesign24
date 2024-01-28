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

def num_chk(num_ish):
    '''
    (obj)->bool
    Checks for a valid number type
    '''
    return type(num_ish) == int or type(num_ish == float)

class Circle:
    '''
    Simulates a circle
    '''
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
        <Circle object> r:11.180339887498949;
        '''
        new_area = self.area() + other.area()
        new_rad = math.sqrt(new_area / math.pi)
        return Circle(new_rad)


    def __sub__(self, other):
        '''
        (Circle, Circle) -> Circle
        Subtracts an instance of Circle from another.
        The returned Circle has the area of the larger circle minus
        the area of the smaller
        Circles being added
        >>> x = Circle(5)
        >>> y = Circle(10.0)
        >>> y - x
        <Circle object> r:8.660254037844387;
        '''
        new_area = self.area() - other.area()
        new_area = abs(new_area)
        new_rad = math.sqrt(new_area / math.pi)
        return Circle(new_rad)

    def __mul__(self, multiplier):
        '''
        Multiples a circle by a number (n), with the resultant circle
        having an area n times the area of the original circle.
        >>> x = Circle(10)
        >>> x * 5
        <Circle object> r:22.360679774997898;
        '''
        if num_chk(multiplier):
            new_area = self.area() * multiplier
            new_rad = math.sqrt(new_area / math.pi)
            return Circle(new_rad)
        else:
            raise TypeError("Inappropriate argument for radius- must be a numerical type")
        
    def __truediv__(self, divisor):  # /
        '''
        Divides a circle by a number (n), with the resultant circle
        having an area 1/n times the area of the original circle.
        >>> x = Circle(10)
        >>> x / 5
        <Circle object> r:4.47213595499958;
        '''
        if num_chk(divisor):
            new_area = self.area() / divisor
            new_rad = math.sqrt(new_area / math.pi)
            return Circle(new_rad)
        else:
            raise TypeError("Inappropriate argument for radius- must be a numerical type")
        
    def __eq__(self, other):  # ==
        '''
        (Circle, Circle)->bool
        Checks two circles for equality based on area
        >>> x = Circle(10)
        >>> y = Circle(10.0)
        >>> z = Circle(3)
        >>> x == y
        True
        >>> x == z
        False
        '''
        if isinstance(other, Circle):
            return self.area() == other.area()
        else:
            return ValueError("Incorrect type Found")
        
    def __neq__(self, other):  # !=
        '''
        (Circle, Circle)->bool
        Checks two circles for equality based on area
        >>> x = Circle(10)
        >>> y = Circle(10.0)
        >>> z = Circle(3)
        >>> x != y
        False
        >>> x != z
        True
        '''
        if isinstance(other, Circle):
            return not self.area() == other.area()
        else:
            return ValueError("Incorrect type Found")
        
    def __gt__(self, other):  # >
        '''
        (Circle ,Circle) -> bool
        check the circle if it is larger than the other
        >>> x = Circle(10)
        >>> y = Circle(10.0)
        >>> z = Circle(3)
        >>> x > z
        True
        '''
        return self.area() > self.other()
        
        
    def __lt__(self , other):
        '''
        (Circle , Circle) -> bool
        check the Circle if it is less than the other
        >>> x = Circle(10)
        >>> y = Circle(10.0)
        >>> z = Circle(3)
        >>> z < x
        True
        '''
        

if __name__ == "__main__":
    doctest.testmod(verbose=True)
#     circ_1 = Circle(5)
#     circ_2 = Circle(10.0)
#     # print(circ_1)
#     # print(circ_2)
#     # print(circ_1.area()) # -> the area of circ_1;  78.53981633974483
#     # print(circ_2.circumf())  # -> the circumference of circ_2; 62.83185307179586
#     print(circ_2.area())
#     print(circ_2.area_sector(90))  # -> the area of the sector;
    