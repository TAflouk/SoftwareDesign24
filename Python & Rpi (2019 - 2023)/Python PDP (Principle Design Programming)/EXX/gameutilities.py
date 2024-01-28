# --------------------------------------------------------------------------
# title           :gameutilities.py
# description     :utilities created for assignment
# author          :srattigan
# date            :20200311
# version         :1.0
# notes           :Essential elements for completing the assignment
#                  You do not have to use these, and may use other
#                  methods as you see fit.
# python_version  :3.7  
# --------------------------------------------------------------------------

# --IMPORTS --
import enchant  # install pyenchant to your system
import os
import json
import time

# --CONSTANTS/GLOBALS--
if os.name == 'posix':
    CLR = 'clear'
else:
    CLR = 'cls'
    
    
# --CUSTOM FUNCTIONS/CLASSES--
def file_to_list(f):
    '''
    (file of str) -> list of str
    Reads a text file and returns the text in the file as a list of words
    Assumes the file contains a word or phrase per line.
    '''
    content = open(f).read()  # open file in read mode
    content = content.split('\n')[:-1]  # split on ret and slice empty str @ end
    return content

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

def read_scores(filename='scores.txt'):
    '''
    (file) -> dict of str:list of str
    Reads a scores file where the key is a str(number) which
    represents a (score) WHICH IS STORED AS A STR in the file
    and the list contains the names of those that achieved
    that scored
    '''
    with open(filename) as json_file:
        data = json.load(json_file)
        fdata = {}
        for score in data:
            fdata[int(score)] = data[score]
        return fdata

def write_scores(filename, scores):
    '''
    (file, dict) -> str
    Writes the updated dict to the scores file
    The reason is that keys must be immutable, so if players get the
    same score, one could overwrite the other.
    Using this format, the list of players can all be saved with the one
    score.
    You can easily check for an existing key and if it exists just append
    the player name to the list.  If the score is not in existence, the key
    and associated player can be added.
    Note that scores are in str format so that the json data format can be used
    to save all scores.
    >>> write_scores('scores.txt' {'99': ['Peter'], '47': ['Mary', 'Paul']}
    Success
    '''
    with open(filename, 'w') as fp:
        json.dump(scores, fp)
        return "Success"
    return "Something went wrong"
    
def get_top_n_scores(scores, n):
    '''
    (dict, int) -> list of int
    Takes a dict of scores in int form and returns the
    top n values- this allows the top score to be used
    or the top n scores by the caller.
    You can get the names of the players from the dict
    using these values, so you can show players in a
    list like in the classic games, or just use the top
    score as in all the old classics.
    It's a roundabout method but simple, and it works.
    '''
    tops = []
    for k in scores:
        tops.append(int(k))
    tops.sort()
    tops.reverse()
    for i in range(0, len(tops)): 
        tops[i] = tops[i]
    return tops[:n]


class Menu:
    '''
    Creates an instance of a menu for command line programs
    '''
    delay = 1.5  # class var accessible to all instances
    def __init__(self,ttl,opts):
        '''
        (str, list of str)-> None
        Creates a menu
        '''
        self.title = ttl
        self.options = opts
        self.decorator = "*"
        self.width = 80
        
    def display(self):
        '''
        (None) -> int
        Centers the title on the screen
        Creates a menu from the list items and returns the index of 
        the item chosen by the user
        '''
        os.system(CLR) # clear the screen
        spaces = (self.width // 2) - (len(self.title) // 2)
        while True:
            print(f"{self.decorator * self.width}")
            print(f"\n{' ' * spaces}{self.title}\n")
            print(f"{self.decorator * self.width}\n")
            for i in range(len(self.options)):
                print("\t" + str(i+1)+") "+str(self.options[i].title()))
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
