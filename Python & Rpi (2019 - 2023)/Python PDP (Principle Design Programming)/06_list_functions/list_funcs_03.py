# @Author:xxx
# @Date:2020-11-30 11:16:39
# @LastModifiedBy:xxx
# @Last Modified time:2020-11-30 11:16:52
# medium Codingbat exercises

def big_diff(nums):
    """Given an array length 1 or more of ints,
    return the difference between the largest and
    smallest values in the array.
    Note: the built-in min(v1, v2) and max(v1, v2)
    functions return the smaller or larger of two
    values.

    >>> big_diff([10, 3, 5, 6])
    7
    >>> big_diff([7, 2, 10, 9])
    8
    >>> big_diff([2, 10, 7, 2])
    8

    Args:
        nums (list of int): A list of ints with len >= 1

    Returns:
        int: the difference between the largest and
    smallest values in the array
    """
    return max(nums) - min(nums)

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

