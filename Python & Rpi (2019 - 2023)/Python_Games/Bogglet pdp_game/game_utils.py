# --------------------------------------------------------------------------
# title           :game_utils.py
# description     :utilities created for assignment
# author          :srattigan
# date            :20210105
# version         :1.0
# notes           :Essential elements for completing the assignment
#                  You do not have to use these, and may use other
#                  methods as you see fit.
# python_version  :3.7
# --------------------------------------------------------------------------

# --IMPORTS --
import enchant  # install pyenchant to your system
import os
try:
    from filefuncs import write_new_score
except:
    print("write_new_score not found- cannot use ask_user_save func")

    def write_new_score(score_file, new_score, user):
        print(f"Cannot write new score {new_score} for {user} to {score_file}")

# --CONSTANTS/GLOBALS--


# --CUSTOM FUNCTIONS/CLASSES--

def cls():
    """Cross-platform function to clear the screen.
    """
    if os.name == 'posix':
        os.system('clear')
    else:
        os.system('cls')


def ask_user_save(game_name, score=3):
    """
    -- Helper function --
    Takes a single arg score which is the 'round' score
      i.e. the score accumulated after playing ONE round of a game

    If this func is called from the file scrambler.py
    we will plug the name of the module
    into a str of the format 'scores/{__name__}.json'

    The user can enter their name to store it.  If they do so,
    the username, scorefile for *that* game and the round score
    are passed to the write_new_score function and then written to file

    Args:
        score (int): the round score. Defaults to 3 for test purposes.
    """
    print("\n\tDo you want to save the round score?")
    choice = input("\tEnter Y to save or any other key to skip: ")
    if choice.lower() == 'y':
        score_file = f'scores/{game_name}.json'
        user = input("\tEnter username to save: ")
        write_new_score(score_file, score, user)
    # returns nothing


def file_to_list(f):
    '''
    (file of str) -> list of str
    Reads a text file and returns the text in the file as a list of words
    Assumes the file contains a word or phrase per line.
    '''
    content = open(f).read()  # open file in read mode
    content = content.split('\n')[:-1]  # split on n and slice empty str @ end
    return content


def check_word_exists(w, lang='en_UK'):
    '''
    (str) -> bool
    Checks if a word exists in the English (British) dictionary
    This is mainly for the bogglette game
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

    def __init__(self, ttl, opts):
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
                if selected in range(1, len(self.options) + 1):
                    return selected - 1
                else:
                    print("Value entered was not in the menu: ")
                    input("Press Enter to continue...")
            except:  # Just leave without specifying ErrorType
                print("Non-numerical value entered: Please try again")
                input("Press Enter to continue...")


if __name__ == '__main__':
    m = Menu("Testing menu",
             ["Opt1", "Opt2", "Opt3"])
    choice = m.display()
    print(f"You picked {m.options[choice]}")

