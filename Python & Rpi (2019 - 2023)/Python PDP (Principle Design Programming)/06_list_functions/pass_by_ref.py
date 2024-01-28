# simple demo function for list
rand_list = ["Noob",
             True,
             2,
             3.1987,
             (1, 2),
             ['a', 'b']
             ]

def mod(a_list):
    """
    (list of obj)
    removes the last obj in the list
    Note this modifies the list in
    the global namespace, since the list is
    passed by reference to the original,
    and not a copy (by value)
    """
    a_list.pop()
    print("Done")


if __name__ == "__main__":
    print(f"List is {rand_list}")
    mod(rand_list)
    print(f"List is {rand_list}")
    mod(rand_list)
    print(f"List is {rand_list}")
    mod(rand_list)
    print(f"List is {rand_list}")
