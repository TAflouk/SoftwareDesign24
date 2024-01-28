from shapes import Shape

import turtle

class ShapeReal(Shape):
    def __init__(self,side):
        super().__init__(side)

    
    def draw(self, fill=False):
        shape = turtle.Turtle()
        shape.screen.colormode(255)
        shape.pencolor(self.color)
        shape.fillcolor(self.color)
        if fill:
            shape.begin_fill()
        for i in range(self.num_sides):
            shap.forward(self.side)
            shape.right(360/self.num_sides)
        if fill:
            shape.end_fill()
        turtle.done()
        

class TriangleReal(ShapeReal):
    def __init__(self,side):
        super().__init__(side)
        self.num_sides = 3
        self.color = (0,255 , 0)
    
    
class SquareReal(ShapeReal):
    def __init__(self, side):
        super().__init__(side)
        self.num_sides = 4
        self.color = (255,0,0)
        

class SsquareReal(ShapeReal):
    def __init__(self, side):
        super().__init__(side)
        self.num_sides = 4
        self.color = ()


tri_1 = SquareReal(200)
print(tri_1)