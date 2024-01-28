# handy re-usable code

# --- IMPORTS ---
import time

# --- FUNCTIONS ---
def get_int(prompt="Enter number: "):
    '''
    (str) -> int
    Prompts for a number and returns a valid int.
    Code will loop until a valid int is entered by the user.
    This function takes an optional str argument as a prompt.
    '''
    while True:
        num = input(prompt)
        try:
            num = int(num)
            return num
        except:
            print("Invalid number! Please try again")

def title_gen(title, width=80):
    '''
    (str) -> None
    Generates a title for a program centering it with decor
    '''
    spaces = (width - len(title)) // 2
    print("*" * width)
    print(" " * spaces + title)
    print("*" * width + '\n')
      
def menu_gen(menu_items):
    """
    (list of str) -> int
    Takes a list of menu items and returns the index
    of the chosen item
    """
    counter = 1
    for item in menu_items:
        print(f"\t{counter}: {item}")
        counter += 1
    sel = get_int("Enter Selection: ")
    return sel - 1

def dramatic_print(statement, decor=".", rpt=6):
    print(statement, end=decor)
    for dot in range(rpt):
        time.sleep(0.75)
        print('', end=decor)
    print()

# --- MAIN BODY ---
if __name__ == "__main__":
    title_gen("Sample Title")
    menu_gen(['abc', 'bcd', 'cde'])
    dramatic_print("Waiting")
