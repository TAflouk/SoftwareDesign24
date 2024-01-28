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
    pass


def binary_search(arr, term):
    pass


def search(arr, term, sorted=True):
    if sorted:
        res = binary_search(arr, term)
    else:
        res = linear_search(arr, term)
    return res


def some_sort(arr):
    pass


# may do quick tests here
if __name__ == "__main__":
    x = some_sort([21, 13, 53, 100, 17, 92])
    print(x)
