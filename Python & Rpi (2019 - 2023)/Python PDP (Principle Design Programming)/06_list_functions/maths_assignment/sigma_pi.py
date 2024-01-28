# @Author:srattigan
# @Date:2021-02-09 21:21:58
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-09 21:21:58

def expr_1(n):
    """2n^2 -4n + 9"""
    result = 2 * n ** 2 - (3 * n) + 12
    print(f"{expr_1.__doc__} for n= ({n}) -> {result}")
    return result


def expr_2(n):
    """n^3 -4n + 5"""
    result = n ** 3 - (4 * n) + 5
    print(f"{expr_2.__doc__} for n= ({n}) -> {result}")
    return result


def expr_3(n):
    """5 log(n)"""
    from math import log
    result = 5 * log(n)
    print(f"{expr_3.__doc__} for n= ({n}) -> {result}")
    return result


def sigma(n, k, func):
    pass


def pi(m, n, func):
    pass
    

# some sample testing
if __name__ == "__main__":
    start = 2
    end = 5
    funcs = [expr_1, expr_2, expr_3]
    test_sigpi = [sigma, pi]
    for test in test_sigpi:
        print(f"\n-- Testing {test.__name__} --")
        for func in funcs:
            print(f"\tTesting {func.__name__}")
            print(test(start, end, func))


