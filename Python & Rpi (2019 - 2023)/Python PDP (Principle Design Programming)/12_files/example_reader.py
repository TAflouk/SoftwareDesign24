# @Author:srattigan
# @Date:2021-01-07 18:20:29
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-14 13:35:39
import os


def file_to_arr(file):
    """read a text file and convert to a list, splitting
    the file on the return character

    Args:
        file (file): a text file
    """
    content = open(file)
    words = content.read()
    array = words.split("\n")
    return array


files = ["animals",
         "films",
         "plants",
         "stuff"
         ]
choice = "stuff"

if __name__ == "__main__":
    word_list = file_to_arr(f'{choice}.txt')
    print(word_list)
