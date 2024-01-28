# Sample code for assignment 1, 5N2927
# Note use of TDD approach to development:
# 1) Write test cases
# 2) Run tests
# 3) Fail tests
# 4) Develop code to pass all test cases

import doctest

def get_rank(main_rank, cup):
    '''
    (int, list of int) -> tuple of int
    Creates the final rank for a cup of dice
    >>> get_rank(5, [5, 3, 4])
    (5, 5)
    >>> get_rank(5, [4, 3, 2])
    (5, 4)
    >>> get_rank(5, [2, 3, 4])
    (5, 4)
    >>> get_rank(4, [2, 2, 2])
    (4, 2)
    >>> get_rank(4, [5, 5, 5])
    (4, 5)
    >>> get_rank(3, [2, 4, 4])
    (3, 4, 2)
    >>> get_rank(2, [2, 5, 4])
    (2, 11, 5, 4, 2)
    '''
    if main_rank == 5:
        return(5, max(cup))
    #elif main_rank == 4:
    #    return (4, etc....
    

def run(cup):
    '''
    (list of int) -> bool
    Determines if a player gets a run of dice
    >>> run([5, 3, 4])
    True
    >>> run([2, 4, 3])
    True
    >>> run([2, 5, 3])
    False
    >>> run([4, 4, 2])
    False
    '''
    cup.sort()
	# based on answer @ http://tiny.cc/2natgz
    compare = list(range(min(cup), max(cup)+1))
    return cup == compare


def trio(cup):
    '''
	'''
	pass
	

def pair(cup):
    '''
	'''
	pass
	

def hi_roll(cup):
    '''
	'''
	pass


# for both player and dealer
#     get initial rank
# This would be in a function >
cup_a = [5, 3, 4]
if run(cup_a):
    rank = get_rank(5, cup_a)
elif trio(cup_a):
    rank = get_rank(4, cup_a)
    
    
if __name__ == "__main__":
    doctest.testmod(verbose=True)