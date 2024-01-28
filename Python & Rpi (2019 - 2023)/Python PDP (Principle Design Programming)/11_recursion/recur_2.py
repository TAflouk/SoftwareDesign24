# @Author:srattigan
# @Date:2021-01-10 22:08:32
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-11 11:25:57


# factorial and fibonacci with memory

fib_dict = {
    0: 0,
    1: 1
}


def fibonacci_recur(n: int):
    """Calculate the fibonacci number recursively

    Args:
        n (int): A number > or = to 0

    Returns:
        [int]: The n th Fibonanacci number
    """
    assert n >= 0, "n must be > or = to 0"
    if n == 0 or n == 1:
        return n
    return fibonacci_recur(n-1) + fibonacci_recur(n-2)


def fibonacci_recur_mem(n: int):
    """Calculate the fibonacci number recursively

    Args:
        n (int): A number > or = to 0

    Returns:
        [int]: The n th Fibonanacci number
    """
    global fib_dict
    assert n >= 0, "n must be > or = to 0"
    if n in fib_dict:
        return fib_dict[n]
    else:
        fib_dict[n] = fibonacci_recur_mem(n-1) + fibonacci_recur_mem(n-2)
        return fib_dict[n]



def fibonacci_iter(n):
    """Calculate the fibonacci number iteratively

    Args:
        n (int): A number > or = to 0

    Returns:
        [int]: The n th Fibonanacci number
    """
    pass