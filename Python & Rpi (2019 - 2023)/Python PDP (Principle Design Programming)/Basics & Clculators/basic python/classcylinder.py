
import math
class cylinder:
    def __init__(self,radius,height):
        """
        constractor
        """
        self.radius = radius
        self.height = height

    def set_color(self,color):
        self.color = color
        

    def area(self):
        return 2* math.pi* self.radius**2 + 2 *math.pi* self.radius* self.height

    
    def volume(self):
        return math.pi*self.radius**2 *self.height

    def __str__(self):
        return f"the height of the cylinder {self.height} and the radius {self.radius}"

#c1 = cylinder(5,10)
#print(c1)
#print(c1.set_color(22))
#print(c1.area())
#print(c1.volume())

string = "abc"

for i in string:
    print(ord(string))