# @Author:srattigan
# @Date:2020-12-14 13:22:57
# @LastModifiedBy:srattigan
# @Last Modified time:2020-12-14 18:01:25
from hangman import get_word
# import hangman

test_list = ['chicken', 'dog', 'horse', 'goat']


def test_get_word():
    print("\n\t--Testing get_words--")
    for test in range(len(test_list) + 1):
        x = get_word(test_list)
        print(x)


test_get_word()
