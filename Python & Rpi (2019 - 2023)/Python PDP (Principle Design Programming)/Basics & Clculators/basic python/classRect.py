class Rectangle:

    """Emulates a rectangle"""

    def __init__(self, length, width):

        """

        Constructor

        """

        self.length = length

        self.width = width

    

    def area(self):

        return self.length * self.width



    def perimeter(self):

        perim = 2 * (self.width + self.length)

        return perim

    

    def __str__(self):

        return f"Rectangle {self.length} long and {self.width} wide"
#r1 = Rectangle(22,22)
#print(r1)

new = []

def list3(a,b):
    #new = []
    for i in a:
        for e in b:
            if i == e:
                #i.remove(a.b)
                #e.remove()
                print(a,b)

    
#print(list3(["a","b","c","d"],["a","f","e","d"]))




new = []
def list3(a,b):
    new = []
    for i in a:
        for e in b:
            if i == e:

                new.append(e)
                new.append(i)
                print(a+b)

    
print(list3(["a","b","c","d"],["a","f","e","d"]))