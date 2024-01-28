#import
import random
# globals/ constants

#functions/ classes 
class coin():
    """
    simulates a coin class
    """
    def __init__(self, sides=2):
        """
        constructor for coin class
        """
        print("A coin is born")
        self.num_sides = sides 
        self.face_val = 0
    def show(self):
        """
        shows the face val of the coin
        """
        print(self.face_val)
        return self.face_val
    def roll(self):
        """
        rolls the coin
        """
        self.face_val = random.randrange(1,self.num_sides+1)
    # main body
    c1 = coin(7)
    print(c1)
    c1.show()
    print("rolling coin")
    c1.roll()
    c1.show()