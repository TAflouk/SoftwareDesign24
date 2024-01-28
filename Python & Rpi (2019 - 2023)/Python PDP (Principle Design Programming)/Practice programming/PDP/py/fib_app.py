# ------------------------------------------------------------------------------
# Name:        fib_app.py
# Purpose:     Create a gui for fibonacci numbers
# Author:      srattigan
# Created:     19/12/2019
# Revision:    1.00
# ------------------------------------------------------------------------------

# imports
import easygui as eg
import fib


# globals/constants


# functions/classes
def get_fib():
    '''
    (None)->None
    Use a gui to get the nth fibonacci numbers
    '''
    num = eg.integerbox(msg='Enter the fibonacci number that you want', title='Get Fibonacci', image='img/fibonacci.png')
    #print(num)
    # make the fib number appear in a messagebox with a format like:
    # the {n} Fibonacci number is {fib_num}
    fib_num 

# main body

if __name__ == "__main__":
    get_fib()
    return fib_recur(n-1) + fib_recur(n-2)
    
    
    
    
    
