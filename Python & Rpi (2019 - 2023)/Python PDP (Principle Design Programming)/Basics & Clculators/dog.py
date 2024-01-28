# Dog class
import math
#from math import log
import random
class Dog:
    """a class to represent a dog : Name, Age, Wheight, Height.
    """
    def __init__(self , name, age:float , weight:float , height:float):
        """

        Constructor
        (name , age , weight ,height) --> obj

        """
        self.name = name 
        self.age = age
        self.weight = weight
        self.height= height
        self.eye_color = (120, 51, 12)
    
    def dog_years(self):
        """this function to convert age in years to dog years 

        Returns:
            (None)--> Num: returns the float of the age with 2 decimal places 
        """

        log_age = math.log(self.age) 
        log_age2 = log_age*16 
        age2 = log_age2 +31
        answer = round (age2, 2)
        return answer

    def height_inches(self):
        """ a function that calculate or convert Cm to inches

        Returns:
            (None)--> Num: it returns inches unit in Float with 2 decimal places 
        """
        inches_1 = self.height * 0.3937008
        answer1 = round(inches_1,2)
        return answer1

    def weight_in_lbs(self):
        """ a finction that converts the Kg to Pounds 

        Returns:
           (None)--> Num: it returns the Float of Kg with " decimal places 
        """
        pounds = self.weight /0.45359237
        answer2 = round(pounds, 2)
        return answer2

    def __str__(self):
        name_1 = self.name
        age_1 = self.age
        eyes_colour = self.eye_color
        weight_1 = self.weight
        height_1 = self.height
        return f"{name_1} is {age_1} years old, has {eyes_colour} eyes, weighs {weight_1} Kg and is {height_1} Cm tall"





list_names = ["rax","max","hax","Fax"]
a1 = random.choice(list_names)
a2 = random.randrange(0,100)
a3 = random.randrange(0,100)
a4 = random.randrange(0,50)
bucket = []
for d in range(10):
    puppy  = Dog(a1,a2,a3,a4)
    bucket.append(puppy)



for d in bucket:
    print(f"\n {puppy}") 
    print(f"\n weight in Kg {puppy.weight_in_lbs()}")
    print(f"\n height in inches  {puppy.height_inches()}")
    print(f"\n dog years {puppy.dog_years()}")


































































