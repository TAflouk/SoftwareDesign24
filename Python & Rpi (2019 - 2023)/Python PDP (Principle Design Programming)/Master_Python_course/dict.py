import random as r

word = ""
rr= ["a","d","S","e","T","k","j","p","q","e"]
ww = ["z","x","c","v"]
ff = []

num_letters = {
    5:[3,2],
    8:[4,4],
    11:[5,6]
    }

import time

def time_passed(start_time):
    """Function to calculate the time passed
    (float) -> (int)
    """
    total = int(time.time() - start_time)
    return total

print(time_passed(time.time())+120)