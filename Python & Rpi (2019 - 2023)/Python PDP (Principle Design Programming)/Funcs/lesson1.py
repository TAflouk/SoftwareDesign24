def gen_square(side: int):
    symbole = "#"
    counter = 0
    block = ""

    while counter <= side:
        block = block + (side * symbole) +"\n"
        counter +=1
        
    return block[:-1]
taha  = gen_square(10) 
#print(taha)


def hill_down(height: int):
    counter = 1
    while counter < height:
        print(counter * "#")
        counter += 1
        
#hill = hill_down(10)
#print(hill)


def hill_up(height):
    """Generates a Hill of '#' symbols going up
    Args:
        height (int): Height of the hill
    """
    sym = '#'
    space = ' '  # make a visible char to start
    counter_up = 1  # starts counting from one to height
    counter_down = height  # for spaces, starts at height
    while counter_up <= height:
        print(f"{space * counter_down}{sym * counter_up}")
        counter_down -= 1
        counter_up += 1
        
print(hill_up(10))

b = ["banana","tiger","lion"]
temp = b[0]
b[0] = b[-1]
b[-1] = temp
#print(b)
