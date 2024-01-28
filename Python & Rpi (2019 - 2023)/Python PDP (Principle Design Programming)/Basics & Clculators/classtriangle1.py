# @Author:Taha aflouk
# @Date:2020-01-02 18:08
# @LastModifiedBy:xxx
# @Last Modified time:2020-11-30 01:14:54

import doctest
import math
#the init only requires one parameter side_len, and has a fixed num_sides of 3 and color of (0, 255, 0)
#the perimeter value is simply 3 times the side_len
##the area is the square root of (3 times the side len divided by 2)


class triangle:
    """a class to represent a triangle with one input 

    """
    def __init__(self,side_len):
        """a function that takes lenght for a triangle side 
            side_len (float,int)
        Returns:
            float: any number in float form, entered by the user
        """
        self.side_len = side_len
        self.num_sides = 3
        self.color = (0, 255,0)

    def perimeter(self):
        """a function that calculate the num_sides * side_len
            Returns:
                it returns a perimeter  (num_sides * side_len)= perimeter 
        """
        return self.num_sides* self.side_len



    def area(self):
        """a function that calculates the area 
        Returns:
            float: any number 
        """
        ans = (self.num_sides*self.side_len)/2
        anse = math.sqrt(ans) 
        return anse


    def __str__(self):
        """a function that loops until the user enters a valid number
        Returns:
            str with the the 
        """
        return f"the triangle with {self.side_len}"



t1 = triangle(10) 
print(t1)
print(t1.area())
print(t1.perimeter())
print(isinstance(t1,triangle))




