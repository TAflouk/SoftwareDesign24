# @Author:srattigan
# @Date:2021-01-10 22:16:23
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-11 17:05:56

def ord_print(s):
    """
    Process a str to print the ordinal values of each char

    Args:
        s (str): any string with any characters
    >>> ord_print('a')
    97
    >>> ord_print("hello")
    104
    101
    108
    108
    111
    """
    # iterate through the string
    # for each char you land on
    # print the ordinal value
    for ch in s:
        print(ord(ch))


def ord_print_recur(s):
    """Recursively print the ordinal values of a string in sequence

    Args:
        s (sre): a string

    Returns:
        [None]: ultimtely
    """
    if len(s) == 1:
        print(ord(s))
    else:
        print(ord(s[0]))
        return ord_print_recur(s[1:])


# ord_print_recur("hello")


def count_evens(nums):
    """Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.

    Args:
        nums (list of int): list of int numbers

    Returns:
        int: a count of the even numbers
    
    >>> count_evens([2, 1, 2, 3, 4])
    3
    >>> count_evens([2, 2, 0])
    3
    >>> count_evens([1, 3, 5])
    0
    """
    count = 0
    for num in nums:
        if num % 2 == 0:
            count += 1
    return count

def count_evens_recur(nums):
    """ Recursively :)
    Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.

    Args:
        nums (list of int): list of int numbers

    Returns:
        int: a count of the even numbers
    
    >>> count_evens_recur([2, 1, 2, 3, 4])
    3
    >>> count_evens_recur([2, 2, 0])
    3
    >>> count_evens_recur([1, 3, 5])
    0
    """
    if len(nums) == 0:  # this is the base case
        return 0
    return  # add the result of the first num being even with a recursive call

