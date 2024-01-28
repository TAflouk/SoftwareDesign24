import turtle
import shapes 
# quick tutorial on using turtle:
# https://www.tutorialspoint.com/turtle-graphics-using-python
# comprehensive documentation is located at:
# https://docs.python.org/3/library/turtle.html


def draw_star():
    star = turtle.Turtle()
    for i in range(100):
        star.forward(200)
        star.right(144)
    turtle.done()



def draw_square():
    square = turtle.Turtle()
    square.screen.colormode(255)
    square.pencolor((0, 255, 0))
    square.pensize(5)
    # write code to draw square here
    for i in range(4):
        square.forward(100)
        square.right(90)
        #square.left(100)
    turtle.done()



def draw_triangle():
    triangle1 = turtle.Turtle()
    triangle1.screen.colormode(255)
    triangle1.pencolor((0,0,255))
    triangle1.pensize(4)
    for i in range(3):
        triangle1.forward(60)
        triangle1.right(120)

    turtle.done()
#draw_triangle()

def draw_pentagon():
    penta1 = turtle.Turtle()
    penta1.screen.colormode(255)
    penta1.pencolor((0,0,255))
    penta1.pensize(5)
    for i in range(5):
        penta1.forward(72)
        penta1.right(72)

    turtle.done()


def draw_hexagon():
    hexa = turtle.Turtle()
    hexa.screen.colormode(255)
    hexa.pencolor((150,150,100))
    hexa.pensize(4)
    for i in range(6):
        hexa.forward(100)
        hexa.right(60)
    turtle.done()
    
    
def draw_circl():
    circle =turtle.Turtle()
    circle.color('red','magenta')
    circle.screen.colormode(255)
    circle.pencolor((150,150,100))
    circle.pensize(5)
    for i in range(1):
        circle.begin_fill()
        circle.circle(80)
    turtle.done()
    
draw_circl()  

#draw_pentagon()
#draw_hexagon()
#print(shapes.Pentagon.area(10))

#draw_pentagon()

#draw_square()
# draw_square()  # call the func

# create the function for this
# do the same for Triangle


# Note: the degrees to turn as a function of num_sides