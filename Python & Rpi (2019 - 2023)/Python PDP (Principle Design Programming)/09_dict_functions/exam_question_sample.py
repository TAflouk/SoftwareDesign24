# @Author:srattigan
# @Date:2020-12-21 11:10:26
# @LastModifiedBy:srattigan
# @Last Modified time:2020-12-21 13:32:02

# fib not working
# n1 = 0
# n2 = 1
# total = n1 + n2
# n1 = n2
# n2 = total
# print(total)
# for i in range(10):
#     new = n1 + n2
#     n1 = n2
#     n2 = new
#     total = total + new
#     print(total)

# simple demo code
# my_dict = {}
# my_dict['user'] = "Jim Jones"
# print(my_dict.get('user'))

# Exam question demo
employees = {'EM1': ['Peter Parker', 23, 400.83, False],
             'EM2': ['Tony Stark', 55, 999, True],
             'EM3': ['Reed Richards', 48, 800, True],
             'EM4': ['Ben Grimm', 36, 333.4, False]
             }   # 4 marks for creating and setting initial vals
print(employees)

# 2 marks for adding a new key-value pair
employees['EM8'] = ['Diana Carter', 28, 1000, True]
print(employees)

# 2 marks to edit an existing entry
employees['EM2'][1] = 62
print(employees)

# 5 marks to print all admins in dict (last value- a bool)
print("--- Admin Access Employees ---")
for emp in employees:
    # print(emp)
    if employees[emp][-1]:
        # print(employees[emp][0])
        print(employees[emp])
    

# 6 marks to write a func that takes a dict as above, and searches
# for a first-name.  If found print the ID (key) otherwise "not found"
def search_dict(people, user):
    """Search a dict for a person by first name

    Args:
        people (dict): key (str) value (list) pairs
        user (str): First name of a user

    Returns:
        str: Associated key or "Not Found"
    """
    for emp in people:
        full_name = people[emp][0]  # 'Peter Parker'
        first_name = full_name[:len(user)]  # 'Peter'
        # first_name = full_name.split()[0]
        if first_name == user:
            return emp
    return "Not Found"


print(search_dict(employees, "Peter"))  # EM1
print(search_dict(employees, "Mary"))  # Not Found
