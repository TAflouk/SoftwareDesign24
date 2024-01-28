# @Author:srattigan
# @Date:2021-02-03 13:13:11
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-03 13:13:11

# Pass numbers and funcs as args

def square_it(n):  # n^2
    return n ** 2


def cube_it(n):  # n^3
    return n ** 3


def process_num(num, func):
    """Takes a num and processes it with the func supplied

    Args:
        num (num): any str
        func (function): a num processor
    """
    new_val = func(num)
    print(new_val)


if __name__ == "__main__":
    process_num(5, square_it)
    process_num(5, cube_it)
