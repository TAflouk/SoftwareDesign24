
def hill_down(height: int):
    """Generates a Hill of '#' symbols going down

    Args:
        height (int): the height of the hill
    """
    sym = "#"
    counter = 1
    while counter <= height:
        print(sym * counter)
        counter = counter + 1  # counter += 1


# hill_down(4)

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
    # counter goes from 1 to 5
    # spaces go from 5 to 1
    # in the loop
    # space_num x space + sym x counter


hill_up(5)
     #  5 spaces + 1 sym
    ##  4 spaces + 2 sym
   ###  3 spaces + 3 sym
  ####  2 spaces + 4 sym
 #####  1 space  + 5 sym