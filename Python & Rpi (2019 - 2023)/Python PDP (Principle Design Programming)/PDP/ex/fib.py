# ------------------------------------------------------------------------------
# Name:        fib.py
# Purpose:     Examine efficiency of different implementations of fibonacci: 
#			   iterative, recursive, recursive with memoryview
# Author:      srattigan
# Created:     19/12/2019
# Revision:    1.00
# ------------------------------------------------------------------------------

# imports
import time


# globals/constants
remember_fib = {}


# functions/classes

def fib_iter(n):
    '''
    (int)->int
    Calculates the nth fibonacci number iteratively
    Will calculate even very large numbers
	>>> fib_iter(4)
	2
    '''
    a, b = 0, 1  # initialise both on one line
    for i in range(0, n):
        a, b = b, a + b
    return a


def fib_recur(n):
    '''
    (int)->int
    Calculates the nth fibonacci number recursively
    Calculating fib(20) takes a few seconds- after that
    prepare to wait
    '''
    if n == 0 or n == 1:
        return n
    return fib_recur(n-1) + fib_recur(n-2)


def fib_recur_mem(n):
    '''
    (int)->int
    Calculates the nth fibonacci number iteratively
    but uses a dict to remember the values- the dict has to
    be in global scope, otherwise each new instance starts off
    again with an empty dict.
    '''
    if n<2:
        return n
    elif n not in remember_fib :
        remember_fib[n]= fib_recur_mem(n-1) + fib_recur_mem(n-2)
    return remember_fib[n]


def test_time_of_funcs(funcs, num):
    '''
    (list of functions, int)->None
    Takes a list of functions and a value to pass to each
    Prints the execution time of each
    '''
    for func in funcs:
        time_start = time.time()  # start timer
        result = func(num)        # get result
        time_end = time.time()  # end time
        time_to_run = time_end - time_start
        print(f"{func} with value {num} calculated {result} in {time_to_run} seconds")


if __name__ == "__main__":
    func_list = [fib_iter, fib_recur_mem]  # removed fib_recur
    test_time_of_funcs(func_list, 600)