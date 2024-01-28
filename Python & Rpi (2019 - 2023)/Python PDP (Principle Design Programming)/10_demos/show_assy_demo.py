# @Author:srattigan
# @Date:2020-12-13 21:07:42
# @LastModifiedBy:srattigan
# @Last Modified time:2020-12-13 22:08:18

# When we "execute" a python file, it is compiled to bytecode and
# then "run" through the python interpreter.

# imports
import dis  # disassembler
import types

# -- classes and functions


class BankAccount:
    """Generic Bank Account
    """
    acc_num = 100000

    def __init__(self, name, balance=0):
        self.name = name
        self.balance = balance
        self.account_num = self.acc_num
        BankAccount.acc_num += 1

    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        self.balance -= amount

    def __str__(self):
        rep = f"Bankaccount for {self.name}"
        rep += f"\n\tAcc Num: {self.account_num}"
        rep += f"\n\tBalance: {self.balance}"
        return rep


def simple(n=3.0):
    """Simple demo func

    Args:
        n (float, optional): just a number. Defaults to 3.0.

    Returns:
        num: the arg squared
    """
    return n ** 2


def dict_gen(str_list, num_list):
    """Creates a dict given two lists
    Precondition: Assumes lists are of equal length

    Args:
        str_list (list of str): strs
        num_list (list of num): num

    Returns:
        dict: dict of str: num
    >>> dict_gen(['Ten', 'Twenty', 'Thirty'], [10, 20, 30])
    {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
    """
    assert len(str_list) == len(num_list), "Lists must be same length"
    new_dict = {}  # makes empty dict
    for idx in range(len(str_list)):
        new_dict[str_list[idx]] = num_list[idx]
    return new_dict


def view_internals(objs, func):
    """[summary]

    Args:
        objs (list of objects): may be functions or classes
        func (function): the function to apply to the list of obj
    """
    print("--- PROCESSING OBJECTs ---")
    for obj in objs:
        print(func(obj))
        if isinstance(obj, types.FunctionType):
            print("Here's the code's underlying binary:")
            print(obj.__code__.co_code)
        input("\tPress Enter to proceed...")


if __name__ == "__main__":
    objs = [simple, dict_gen, BankAccount]
    view_internals(objs, dis.dis)
