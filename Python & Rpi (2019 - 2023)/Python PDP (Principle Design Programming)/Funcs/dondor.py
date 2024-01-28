# @Author:srattigan
# @Date:2021-01-07 13:18:15
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-07 14:35:59


def countdown(n):
    """A recursive implementation of the Countdown function
    completed earlier with a while loop
    Args:
        n (int]): starting value for countdown
    """
    if n <= 0:
        print("Blastoff")
    else:
        print(n)
        countdown(n-1)


def hello():
    """Example of infinite recursion, like an infinite loop
    """
    print("hello")
    hello()  # a recursive call


def factorial_iter(n: int):
    """Get the factorial of a number
    Precondition: n >= 0
    Args:
        n (int): a number to get the factorial of
    """
    assert n >= 0, "n must be > or = to 0"
    if n == 0 or n == 1:
        return 1
    total = 1
    while n > 0:
        total = total * n
        n -= 1
    return total


def factorial_recur(n: int):
    """Get the factorial of a number
    Precondition: n >= 0
    Args:
        n (int): a number to get the factorial of
    """
    assert n >= 0, "n must be > or = to 0"
    if n == 0 or n == 1:
        return 1
    return n * factorial_recur(n-1)


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


def fibonacci_iter(n):
    """Calculate the fibonacci number iteratively
    Args:
        n (int): A number > or = to 0
    Returns:
        [int]: The n th Fibonanacci number
    """
    assert n >= 0, "must be > or = to 0"
    if n == 0 or n == 1:
        return n
    zero = 0
    counter = 1
    for i in range(2,n+1):
        total = zero + counter
        zero = counter
        counter = total
    return total

      
        


if __name__ == "__main__":
    #pass
    fibo = fibonacci_iter(10)
    fiba = fibonacci_recur(10)
    print(fiba)
    print(fibo)
    #factorial = factorial_recur
    #print(factorial(5))
    # print(factorial(5))
    # print(factorial(1))
    # print(factorial(0))
    # print(factorial(-5))