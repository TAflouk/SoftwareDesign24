# @Author:Aflouk
# @Date:2021/01/20 --:--:20
# @LastModifiedBy:Aflouk
# @Last Modified time:2021-01-31 07:00:00

#----IMPORTS----
import math
import random as r
import doctest
import arcade


# -- GLOBALS/CONSTANTS --
RED = (255, 0, 0)
GREEN = (0, 255, 0),
BLUE = (0, 0, 255)
COLORS = [RED, GREEN, BLUE]



# -- HELPER FUNCTIONS --

# -- Function to check the radius in Ball class --
def is_positive(num):

    """A function that checks the radius if is greater than 0 and the type

    Args:
        radius (num): number to check 

    Returns:
        number: ckeck the number if 
    """
    if isinstance(num, str) or num < 0:
        print("It Must Be Number!")
        return False
    elif 1 > num > 0:
        return 1
    elif num != float(num) and num != int(num):
        return False
    else:
        return num


# -- Function  to create a random(Tuple) --
def rand_nums(lo, hi, num = 2):
    """A function that creates a tuple of int 

    Args:
        lo (int): num int 
        hi (int): num int
        num (int, optional): [description]. Defaults to 2.

    Returns:
        [type]: [description]
    """
    list_of_random_nums = []
    for i in range(num):
        list_of_random_nums.append(r.randint(lo,hi))
    return tuple(list_of_random_nums)


# -- Function to calculate the radius from the Volume  --
def calc_radius(volume):
    """Function to calculate the radius from the volume 

    Args:
        volume (num): takes numbers (Volume of the sphere)

    Returns:
        num: returns the radius 
    """
    first_bit  = (4/3) * math.pi  
    total = volume / first_bit
    last_ans =  math.pow(total,1/3)
    return last_ans


# -- CLASSES --

# -- Ball class that create a Sphere shape  --
class Ball:
    """
    Class to draw Ball
    
    """
    def __init__(self, radius= 1):
        """Constructor

        Args:
            radius (int, optional): The radius of the Ball DataType:Number. Defaults to 1.
            x (int, optional): the X position of the Ball on the Window DataType:Number. Defaults to 100.
            y (int, optional): the Y positin of the Ball on the window DataType:Number. Defaults to 700.
            color (tuple, optional): the Color of the Ball DataType:Tuple. Defaults to (30,255).
        """
        assert radius >= 0 , "radius must be greater than zero"
        if 0 < radius < 1:
            radius = 1
        self.color = rand_nums(30,255,3)
        self.radius = radius
        self.x = rand_nums(100,700)
        self.y = rand_nums(100,700)


    def __repr__(self):
        """Method to show the Ball details

        Returns:
            [str]: returns a string with the details Radius, Color and Positions of the Ball
        """
        return  f"Ball obj: radius {self.radius};colour {self.color}; pos {self.x,self.y}"


#NOTE:Surface Area	= 4 × π × r2
    def area(self):
        """Method calculates the area of a Ball

        Returns:
            num: the area of the Ball
        """
        area = math.pi * 4  * self.radius ** 2
        return area


#NOTE:Volume	= (4/3) × π × r3
    def volume(self):
        """Method calculates the voume of the Ball

        Returns:
            num: volume of the sphere
        """
        volume = math.pi * self.radius **3  * (4/3)
        return volume


    def draw(self):
        """A Method to draw a Ball
        """
        arcade.draw_circle_filled(self.x, self.y,
                                      self.radius, self.color)


    def set_pos(self, x, y):
        """Function to set new postion 

        Args:
            x (num): the position of the X axis
            y (num): the position of the Y axis
        """
        self.x = x
        self.y = y


    def set_color(self,color):
        """A Method to set the color 
        """
        self.color = color


    def __add__(self, other):
        """A Method to add the volume

        Args:
            other (num): number of the volume

        Returns:
            obj: number
        """
        new_volume = self.volume() + other.volume()
        radius = calc_radius(new_volume)
        return Ball(radius)


    def __sub__(self, other):
        """A Method to subtract the volume of 2 Balls

        Args:
            other (num): number of the volume
            
        Returns:
            obj: number
        """
        new_volume = self.volume() - other.volume()
        new_volume = abs(new_volume)
        radius = calc_radius(new_volume)
        return Ball(radius)


    def __mul__(self, num):
        """A Method to multiple the Ball Volume by a number

        Args:
            num (num): num of the volume

        Returns:
            obj: number
        """
        new_volume = self.volume() * num
        radius = calc_radius(new_volume)
        return Ball(radius)


    def __truediv__(self, num):
        """A Method to divide the Ball Volume by a number

        Args:
            num (num): number to divide by number

        Returns:
            num: number  
        """
        new_volume  = self.volume() / num
        radius = calc_radius(new_volume)
        return Ball(radius)


    def __eq__(self, other):
        """A Method to check if 2 volume

        Args:
            other (num): num 

        Returns:
            boolean: True if both equal and False if not 
        """
        return self.volume() == other.volume()


    def __ne__(self, other):
        """A Method to check 2 volume if not equal

        Args:
            other (num): num

        Returns:
            boolean: True if both not equal and False if equal
        """
        return self.volume() != other.volume()


    def __gt__(self, other):
        """A Method to check if graeter than 

        Args:
            other (num): num

        Returns:
            boolean: True if greater or False if not
        """
        return self.volume() > other.volume()


    def __ge__(self, other):
        """A Method to check if greater or equal to 

        Args:
            other (num): num

        Returns:
            boolean: True if greater or equal to  or False if not
        """
        return self.volume() >= other.volume()


    def __lt__(self, other):
        """A Method to check if less than 

        Args:
            other (num): num

        Returns:
            boolean : True if less than  or False if not
        """
        return self.volume() < other.volume()


    def __le__(self, other):
        """A Method to check if less than or equal to

        Args:
            other (num): num 

        Returns:
            boolean: True if less than or equal to or False if not
        """
        return self.volume() <= other.volume()