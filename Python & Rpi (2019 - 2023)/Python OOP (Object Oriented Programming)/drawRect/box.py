import random as r
import arcade as a 

def rand_tuple(lo, hi, num):
    t = []
    for i in range(num):
        t.append(r.randint(lo,hi))
    return t
    
class Box:
    def __init__(self, w= 10, h=10):
        self.width = w
        self.height = h
        self.color = rand_tuple(30,200,3)
        self.x = 0
        self.y= 0 
        
    def __repr__(self):
        return "Box{self.width} {self.height} {self.x}{self.y}"
        
    def draw(self):
        a.draw_rectangle_filled(self.x,
                                self.y,
                                self.width,
                                self.height,
                                self.color)
b1 = Box()
print(b1)