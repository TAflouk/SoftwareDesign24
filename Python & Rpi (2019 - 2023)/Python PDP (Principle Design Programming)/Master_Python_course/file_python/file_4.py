# ----------------------
# ---- File Handling ---
# ----------------------
#----------------------------------------------------------

import os


#my_file.truncate(5)
#print(my_file.tell()) # to know the position of the curser
#my_file.write("hello myteam")
#my_file.seek(6)
#os.remove("C:\Users\19TAflouk.avtos\Desktop\file_python\new.txt")

def swap(a_list, swap_1, swap_2):
    """ takes a list, and two indices
    the values at each index will be swapped"""
    a_list[swap_1], a_list[swap_2] = a_list[swap_2], a_list[swap_1]

def sort_my_dict(arr):
    for i in range(len(arr)-1):
        for each in range(len(arr) - i -1):
            if arr[each] < arr[each+1]:
                swap(arr,each,each+1)
    return arr
    #return f"Term {term} not found"


print(sort_my_dict([1, 3, 5, 7, 2, 9]))


