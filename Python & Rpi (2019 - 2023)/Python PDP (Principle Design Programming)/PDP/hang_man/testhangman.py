# ------------------------------------------------------------------------------
# Name:        reusables.py
# Purpose:     Store of useful re-usable code
# Author:      srattigan
# Created:     27/09/2019
# Revision:    1.00
# ------------------------------------------------------------------------------
import hangman as h 
import time
def test_draw_gallows():
    """
    (none)->None
    Tests the draw_gallows function
    """
    for num in rang(7):
        h.draw_gallows(num)
        time.sleep(1)

    if __name__== "__main__":
        test_draw_gallows()


