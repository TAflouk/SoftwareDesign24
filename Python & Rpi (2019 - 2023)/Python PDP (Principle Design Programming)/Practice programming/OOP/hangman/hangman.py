# ------------------------------------------------------------------------------
# Name:        reusables.py
# Purpose:     Store of useful re-usable code
# Author:      srattigan
# Created:     27/09/2019
# Revision:    1.00
# ------------------------------------------------------------------------------
#--IMPORTS--
import winsound
import random
import reusables as r
import words as w 
from stages import steps
#--GLOBAL--
options = ["simple", "medium", "hard" , "quit"]
#--FUNCTION--
def title_menu():
    """
    show title of game and choice , easy, medium, hard.
    """
    r.title_gen("hangman")
    opt = r.menu_gen(options)
    return opt      
def menu(): 
     if menu == 1:
      print("easy level")
      word = w.easy[random.randint(0,len(w.easy)-1)]
     return word        
    elif menu == 2:
        print("medium level")
        word = w.medium[random.randint(0,len(w.medium)-1)]
        return word 
    elif menu ==3:
     print ("hard level")
     word = w.hard[random.randint(0,len(w.hard)-1]
     return word
def get_initial_blanks(word):
    """
    (str) -> str
    create a "blank" rep of the word
    >>> get_initial_blanks("horse")
    '____'
    >>>get_initial_blanks("the cat")
    '___ ___'
    """
    return "_" * len(word)
def draw_blanks(stage):
    """
    print("\t", end="")
    for word in rep.split():
        for letter in word:
            print("_", end=" ")
        print(" ", end="")
    """
def main():
    '''
    Main game function
    '''
    stage = 0
    pick = title_menu()
    if pick in [0,1,2]:
        print(f"you picked {options[pick]}")
        secret_word = get.word (pick)
        blanks = get_initial_blanks(secret_word)
        draw_gallows(stage)
        draw_blanks(blanks)
    elif pick == 3:
        print("sorry to see you go...bye!")
    else:
        print("not on menu")
def rungame():
   """while turn != maxturns:
   asterix = len(word)
   print("_" * asterix)
   for char in guesses:
       if char in guesses:
               print (char)
       else:
               print("_")
               turn += 1
   if maxturns == turn:
           print("you lost!")
           break"""
   turns = 7
   guesses = ''
   word = menuu()
   x = 0
   print(steps[x])
   while turns > 0:
       failed = 0
       for char in word:      
           if char in guesses:    
               print (char, end=" ")    
           else:
               print ("_", end=" ")     
               failed +=1
       if failed == 0:        
           print("You won")
           print(free[0])
           break              
       print
       guess = input("guess a character:") 
       guesses += guess                    
       if guess not in word:  
           turns -= 1        
           print("Wrong") 
           x +=1
           print(steps[x])
           print("You have", + turns, 'more guesses')
           if turns == 0:           
               print("You Loose") 
 -- MAIN BODY --
if __name__ == '__main__':
    main()
            
   r.title_gen()
   menu = r.get_menu()
   menuu()
   rungame()