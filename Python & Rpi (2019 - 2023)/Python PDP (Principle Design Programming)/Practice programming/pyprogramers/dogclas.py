# Dog class
import math
import random
class Dog:
    """a class to represent a dog
    """
    
def __init__(self , name, age:float , weight:float , height:float):
    """
    Constructor

    """
    self.name = name 
    self.age = age
    self.weight = weight
    self.height= height
    self.eye_color = (120, 51, 12)


def dog_years(self):
    """A function to convert age in years to dog years 

    Returns:
        returns num
    """

    log_age = math.log(self.age) 
    log_age2 = log_age*16 
    age2 = log_age2 +31
    answer = round (age2, 2)
    return answer