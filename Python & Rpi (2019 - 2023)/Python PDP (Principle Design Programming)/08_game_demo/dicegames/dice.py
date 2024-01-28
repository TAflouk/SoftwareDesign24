# ------------------------------------------------------------------------------
# Name:        dice.py
# Purpose:     Store of useful dice-related code
# Author:      srattigan
# Created:     16/10/2019
# Modified:    16/11/2019
# Revision:    1.02
# ------------------------------------------------------------------------------

# -- IMPORTS --
import random
import doctest

# -- GLOBALS/CONSTANTS --
over = "\u203e"  * 5
under = " _____ "

ONE = [f"{under}", "|     |", "|  O  |", "|     |", " " + over + " "]  # 1
TWO = [f"{under}", "|    O|", "|     |", "|O    |", " " + over + " "]  # 2
THREE = [f"{under}", "|O    |", "|  O  |", "|    O|", " " + over + " "]  # 3
FOUR = [f"{under}", "|O   O|", "|     |", "|O   O|", " " + over + " "]  # 4
FIVE = [f"{under}", "|O   O|", "|  O  |", "|O   O|", " " + over + " "]  # 5
SIX = [f"{under}", "|O   O|", "|O   O|", "|O   O|", " " + over + " "]  # 6
SEVEN = [f"{under}", "|O   O|", "|O O O|", "|O   O|", " " + over + " "]  # 7
EIGHT = [f"{under}", "|O O O|", "|O   O|", "|O O O|", " " + over + " "]  # 8
NINE = [f"{under}", "|O O O|", "|O O O|", "|O O O|", " " + over + " "]  # 9
FACES =[ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]


# -- FUNCTIONS/CLASSES --

def roll(sides=6):
    '''
    (int) -> int
    Simulates a dice roll
    '''
    pass


def show_face(face_num):
    '''
    (int) -> None
    Prints the face of the dice
    >>> show_face(6)
     _____
    |O   O|
    |O   O|
    |O   O|
     ‾‾‾‾‾
    '''
    for sect in (FACES[face_num - 1]):
        print("\t", sect)

def show_faces(cup):
    '''
    (list of int) -> None
    Prints the faces of a number of dice in one line
    >>> show_face([6, 3, 1)
     _____   _____   _____ 
    |O   O| |O    | |     |
    |O   O| |  O  | |  O  |
    |O   O| |    O| |     |
     ‾‾‾‾‾   ‾‾‾‾‾   ‾‾‾‾‾
    '''
    for idx in range(5):  # 0 1 2 3 4
        #print(idx, "is idx")
        for dice in range(len(cup)):
            #print(cup[dice], "is dice in cup")
            print(FACES[cup[dice]-1][idx], end="   ")
        print()



def main():
    """
    The main code for this module
    """
    #for throws in range(30):
    #    print(f"Throw {throws + 1}: {roll()}")
    #for faces in range(1,7):
    #    show_face(faces)
    show_faces([3, 5, 1, 9, 4])

# -- MAIN BODY --

if __name__ == '__main__':
    main()

