# ---------------------------------------------------------
# Name:         code_solutions_2019.py
# Purpose:      Sample Answers
# Author:       srattigan
# Created:      13-Jan-2020
# Revision:     1.00
# ---------------------------------------------------------

import math

# Q2b
def vol_sphere(rad):
    '''
    (num) -> float
    Calculates the area of a sphere
    >>> vol_sphere(3.6)
    195.43219579451
    '''
    if rad < 0:  # part iii
        print("Invalid")
        return -1
    return (4 / 3) * math.pi * rad ** 3


def vol_helper():
    '''
    Helper file for volume sphere
    '''
    rad = input("Enter the radius of the sphere: ")
    rad = float(rad)
    vol = vol_sphere(rad)
    print(f"Sphere with radius {rad} has a volume of {vol}")

# Q3b
def get_scores():
    '''
    (None) -> list of num
    Builds a list of numbers until the users enters an empty str
    Note that checking that the user actually enters a number is not
    explicit in the question
    '''
    listnum = []
    # Note 
    while True:
        num = input("Enter a number: ")
        if num != "":
            listnum.append(float(num))
        else:
            return listnum

# Q3c
def num_proc(num_list):
    '''
    (list of num)->None
    Processes a list of numbers
    '''
    print(f"{len(num_list)} numbers found")
    print(f"Total is {sum(num_list)}")
    print(f"Average is {sum(num_list)/len(num_list)}")

# Q3d
num_proc(get_scores())

# Q3e
def welsh_char(s):
    '''
    (str)->None
    Processes a string to check for valid welsh characters
    '''
    not_welsh = 'kvxz'
    for ch in s:
        if ch in not_welsh:
            print(f"{ch} is not Welsh")
        else:
            print(f"{ch} is Welsh")

# Q4b
def vat_calc():
    cost = input("Enter the cost of the good: ")
    cost = float(cost)
    reduced = input("Is the class of good reduced (Y/N): ")
    if reduced[0].lower() == 'y':
        rate = 0.135
    else:
        rate = 0.23
    total = cost + cost * rate
    return total

# Q4ci
num_translator = {1: ['aon', 'uno', 'un'],
                  2: ['do', 'due', 'doh'],
                  3: ['tri', 'tre', 'trois'],
                  4: ['ceathair', 'quattro', 'quatre']
                  }

# Q4cii
num_translator[5] = ['cuig', 'cinque', 'cinq']

# Q4ciii
num_translator[2][-1] = 'deux'

# Q4civ
for entry in num_translator:
    print(f"{entry}, -> {num_translator[entry]}")

     

