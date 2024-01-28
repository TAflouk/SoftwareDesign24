# --IMPORTS --
import enchant  # install pyenchant to your system
import os
import json
import time

# --CONSTANTS/GLOBALS--

   
# --CUSTOM FUNCTIONS/CLASSES--

def cls():
    if os.name == 'posix':
        os.system('clear')
    else:
        os.system('cls')  # Windows

def check_word_exists(w, lang='en_UK'):
    '''
    (str)->bool
    Checks if a word exists in the English (British) dictionary
    >>> check_word_exist('Hello')
    True
    >>> check_word_exist('lkjhg')
    False
    '''
    valid = enchant.Dict(lang)
    return valid.check(w)


class Menu:
    '''
    Creates an instance of a menu for command line programs
    '''
    delay = 1.5  # class var accessible to all instances
    def __init__(self,ttl,opts):
        '''
        (str, list of str)-> Menu obj
        Creates a menu
        '''
        self.title = ttl
        self.options = opts
        self.decorator = "*"
        self.width = 80
        self.points = 0
        self.points_spaces = self.width-(14+len(str(self.points))) - 2

    def display(self):
        '''
        (None) -> int
        Centers the title on the screen
        Creates a menu from the list items and returns the index of 
        the item chosen by the user
        '''
        spaces = (self.width // 2) - (len(self.title) // 2)
        while True:
            cls()  # clear the screen
            print(f"{self.decorator * self.width}")
            print(f"\n{' ' * spaces}{self.title}")
            print(f'{" " * self.points_spaces} Points:{self.points}')
            print(f"{self.decorator * self.width}\n")
            for i in range(len(self.options)):
                print("\t" + str(i+1)+") "+str(self.options[i]))
            selected = input("\nEnter your selection: ")
            try:
                selected = int(selected)
                if selected in range (1, len(self.options) + 1):
                    return selected - 1
                else:
                    print("Value entered was not in the menu: ")
                    time.sleep(self.delay)
            except:
                print("Non-numerical value entered: Please try again")
                time.sleep(self.delay)
        
if __name__ == '__main__':
    pass