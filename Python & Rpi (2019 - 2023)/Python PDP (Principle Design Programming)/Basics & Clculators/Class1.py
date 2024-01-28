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


class shape:
    shape_family = {0 : "nothing",
                    1: "dot",
                    2: "line",
                    3: "triangle",
                    4:"square",
                    5:"pentagon",
                    6:"hexagon"}
    def __init__(self,sides):
        self.sides = sides
        self.num = 0
        self.color = (0,0,0)

    def __str__(self):
        shape_type = self.shape_family[self.num]
        return f"a {shape_type} with {self.num} sides of len {self.sides} and color {self.color} "

    def perameter(self):
        return self.sides*self.num

    def area(self):
        raise NotImplementedError("No  implementation")



class square(shape):
    def __init__(self,side ):

        super(),__init__(side)
        self.num = 4
        self.color = (255,0,0)

    def area(self):
        return self.sides **2

    
