# @Author:srattigan
# @Date:2021-02-03 13:22:03
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-03 13:28:04


# Pass lists and funcs as args

def doubler(n):
    """takes a num and doubles it

    Args:
        n (num): a real number
    Returns:
        m (num): a real number of 2 x n
    """
    pass


def tripler(n):
    return 3 * n


def sample(num_list, func):
    """take a list of nums and send 
    each elem in series to the func

    Args:
        num_list (list of num): a list of numbers
        func (function): a function that takes a list of nums
    >>> sample([2, 3, 4], doubler)
    [4, 6, 8]
    >>> sample([3, 2, 6], tripler)
    [9, 6, 18]
    """
    # use a loop to process each elem in the list
    # print out each val on the same line, after sent to func
    # collect all the values in a new list, and return
    pass


sample([2, 3, 4], doubler)
sample([2, 3, 4], tripler)
sample(list(range(3, 20, 2)), tripler)
