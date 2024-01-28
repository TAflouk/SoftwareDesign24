
import math
class Sphere:
    """Models a sphere object
    """
    def __init__(self, rad):
        """Constructor
        Args:
            rad (num): Radius of sphere
        """
        self.radius = rad
        self.color =(255, 0 ,0) #red
    def __str__(self):
        return f"Sphere object with radius {self.radius} and color{self.color}"


    def set_color(self,col):
        """[Sets the color of the sphere 
        
        Args:
        col (tuple of init): an rgb value for color
        """
        self.color = col


    def volume(self):
        return 4/3 *math.pi*self.radius**3
    
    def area(self):
        return 4 * math.pi* self.radius**2


        
s1 = Sphere(5)
print(s1)
print(s1.area())
print(s1.volume())