import math #to get the value of pi

class square:
    """Models a square object
    """
    def __init__(self,side1,side2):
        """constarctor

        args:
        side1(num): side of the square
        """
        self.side1 = side1
        self.side2 = side2

    def paremeter(self):
        return 2 * (self.side1+self.side2)

    def area(self):
        return self.side1 * self.side2

    def __str__(self):

        return f"the side of the square  {self.side1} and the other side is  {self.side2} "

s1 = square(2,2)
print(s1)
#print(s1.area())
#print(s1.paremeter())
#print(s1.area())


