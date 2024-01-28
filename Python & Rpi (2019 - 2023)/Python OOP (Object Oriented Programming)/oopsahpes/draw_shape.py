from shapes import Square , Triangle

class TriangleReal(Triangle):
    
    """A triangle that can be drawn
    """
    
    def __init__(self,side):
        super().__init__(side)
        #self.pos(200,200)
        
new_tri = TriangleReal(100)
print(new_tri)
print(new_tri.area())