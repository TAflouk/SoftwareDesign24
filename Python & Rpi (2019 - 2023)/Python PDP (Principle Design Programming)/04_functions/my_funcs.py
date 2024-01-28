import time

# helper function
def get_name():
    """
    (None) -> str
    Gets a name from the user
    """
    print("Welcome user program")
    user = input("Enter name: ")
    return user


# print(f"Hello there {get_name()}! You look great :D")

def rectangle_area(length, width):
    """Calculates the area of a rectangle

    Args:
        length (num): the length of the rectangle
        width (num): the width of the rectangle

    Returns:
        num: the area of the rectangle
    """
    return length * width


def rectangle_perimeter(length, width):
    """Calculates the perimeter of a rectangel

    Args:
        length (num): the length of the rectangle
        width (num): the width of the rectangle

    Returns:
        num: the perimeter of the rectangle
    """
    return 2 * (length + width)


def wage_calc(hours: float, rate: float):
    """Calculates wages due

    Args:
        hours (float): number of hours worked
        rate (float): rate of pay per hour

    Returns:
        float: wages due for hours worked
    """
    if hours <= 39:
        return rate * hours
    else:
        o_t_hours = hours - 39
        o_t_pay = rate * 1.5 * o_t_hours
        return rate * 39 + o_t_pay


def wage_helper():
    """Helper function for wages
    """
    hours = input("Enter Hours worked: ")
    hours = float(hours)
    rate = input("Enter Rate of Pay: ")
    rate = float(rate)
    pay = wage_calc(hours, rate)
    print(f"You will be paid €{pay:.2f}")


def title(heading, sym):
    """Generates a nice title for a CL program

    Args:
        heading (str): the heading for the program
        sym (str): a single char used for the line above and below heading
    """
    line = sym * 30
    print(line)
    print(f"\t{heading}")
    print(line)


title("Payroll Program", "=")
while True:
    wage_helper()
    print("\nDo you want to go again?")
    answer = input("Enter [Y] for Yes or any other key to exit: ")
    if answer.upper() == "Y":
        break


def countdown(start=10):
    """A countdown for rockets

    Args:
        start (int, optional): Starts counting from this. Defaults to 10.
    """
    counter = start
    while counter >= 0:
        print(f"\t{counter}")
        time.sleep(1)
        counter -= 1
    print("--Blastoff---")


# title("Final Countdown", "*")
# countdown(5)
# print(type(countdown))


def hill_down(height: int):
    sym = "#"


hill_down(7)
# would return

#
##
###
####
#####
######
#######


