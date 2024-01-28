# @Author:srattigan
# @Date:2021-01-20 13:39:48
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-20 14:23:20

import doctest


def indexer(a_list):
    """Processes a list and prints, for each item
       - the index
       - the value
       - the type

    Args:
        a_list (list of obj): [description]
    >>> indexer([7, "a", 3.5, 7])
    index 0, val 7, type <class 'int'>
    index 1, val 'a', type <class 'str'>
    index 2, val 3.5, type <class 'float'>
    index 3, val 7, type <class 'int'>
    """
    pass


indexer([1, 3.5, ['a', 2], 'hello', (23, 67.6)])


def sum_neighbor(num_list):
    """Take a list of nums and sum each neighbor
       adding each to a new list
    Args:
        num_list (list of num): list of numbers

    Returns:
        [list of num]: sum list

    >>> sum_neighbor([1, 2, 3, 4])
    [3, 5, 7]
    >>> sum_neighbor([2, 7, 3, 8, 1])
    [9, 10, 11, 9]
    """
    start = 0
    end = len(num_list) - 2
    new_l = []
    while start <= end:
        total = num_list[start] + num_list[start + 1]  # Y
        new_l.append(total)
        start += 1
    return new_l  # N


if __name__ == "__main__":
    doctest.testmod(verbose=True)
