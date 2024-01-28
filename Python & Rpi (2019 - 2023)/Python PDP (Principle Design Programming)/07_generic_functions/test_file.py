# @Author:srattigan
# @Date:2020-11-30 12:56:55
# @LastModifiedBy:xxx
# @Last Modified time:2020-11-30 13:36:16
import handy

# tests for the handy functions


def test_title_gen():
    """Runs several test cases for the menu_gen function
    """
    print("\n\t -- TESTING MENU GEN --")
    print("Test1")
    print(handy.title_gen("My Program"))
    print("Test2")
    print(handy.title_gen("My Game", "~", 50))
    print("Test3")
    print(handy.title_gen("My Application", decorator="#"))
    print("Test4")
    print(handy.title_gen("My App", line_len=40))


def test_get_int():
    """Run two test cases for the get_int function
    """
    print("\n\t -- TESTING GET INT --")
    my_num = handy.get_int()
    print(my_num)
    my_num = handy.get_int("Enter an integer: ")
    print(my_num)


def test_get_num():
    """Run two test cases for the get_num function
    """
    print("\n\t -- TESTING GET NUM --")
    my_num = handy.get_num()
    print(my_num)
    my_num = handy.get_num("Enter a float: ")
    print(my_num)


def test_menu_gen():
    """Run three test cases for the menu_gen function
    """
    list_1 = ['cat', 'rat', 'bat', 'dog']
    list_2 = ["Make Deposit", "Make Withdrawal"]
    list_3 = ["Poker", "Solitaire", "31", "25", "BlackJack", "Snap"]
    print("\n\t -- TESTING MENU GEN --")
    ans = handy.menu_gen(list_1)
    print(f"You picked {list_1[ans]}")
    ans = handy.menu_gen(list_2)
    print(f"You picked {list_2[ans]}")
    ans = handy.menu_gen(list_3)
    print(f"You picked {list_3[ans]}")


if __name__ == '__main__':
    test_title_gen()
    test_get_int()
    test_get_num()
    test_menu_gen()
