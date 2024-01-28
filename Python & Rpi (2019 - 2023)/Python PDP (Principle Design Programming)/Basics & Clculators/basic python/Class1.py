class Dog:
    def __init__(self , name, age):
        self.name = name 
        self.age = age
 

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age
        

    def set_age(self,age):
        self.age = age

#d1 = Dog("big",21) # we give it 2 arg that one the name and the age 
#d1.set_age(66) # this method to set the age 

#print(d1.get_age()) 

class square:
    def __init__(self,side,side2):
        """
        constractor

        """
        self.side = side
        self.side2 = side2
    def area(self):
        return self.side * self.side2

    def perameter(self):
        prim = 2 * self.side+self.side2
        return prim

    def __str__(self):
        return f"the side of the square is {self.side} and the other side is {self.side2}"

s1 = square(2,2)
print(s1.area())