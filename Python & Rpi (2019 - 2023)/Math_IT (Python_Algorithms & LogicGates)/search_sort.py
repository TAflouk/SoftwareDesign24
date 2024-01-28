# @Author:srattigan
# @Date:2021-02-10 00:50:32
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-10 00:50:32


def linear_search(arr, term):
    """Implements linear search for an unsorted list
    Args:
        arr (list of num): a list to be searched
        term (num): the search term to apply to the list
    Returns:
        str: indication if found or not, and position if found
    """
    idx = 0
    while idx < len(arr):
        if arr[idx] == term:
            return f"Term {term} found at index: {idx}"
        idx += 1
    return f"Term {term} not found"


def swap(arr, s1, s2):  # helper
    arr[s1], arr[s2] = arr[s2], arr[s1]


def binary_search(arr, term):
    start_idx = 0
    end_idx = len(arr) -1
    while start_idx <= end_idx :
        mid_point = start_idx + (end_idx - start_idx) //2
        midpoint_value = arr[mid_point]
        
        if midpoint_value == term:
            return f"{term} found in ({mid_point} index) position "
        
        elif term < midpoint_value:
            end_idx = mid_point - 1
            
        else:
            start_idx = mid_point + 1
    return f"{term} is not in {arr}"

print(binary_search([2,3,4,5,21,323], 5))

def search(arr, term, sorted=True):
    if sorted:
        res = binary_search(arr, term)
    else:
        res = linear_search(arr, term)
    return res


def some_sort(arr):
    counter = 0
    while counter < len(arr)-1:
        count = 0
        while count < len(arr)-counter-1:
            if arr[count] < arr[count+1]:
                swap(arr, count, count + 1)
                print(f"{arr[count+1]} in index {count+1} swaped with {arr[count]}  in index {count}")
                print()
            count +=1
        counter += 1
    return arr
# may do quick tests here
if __name__ == "__main__":
    x = some_sort([21, 13, 53, 100, 17, 92])
    #print(x)