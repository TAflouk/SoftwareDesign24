# count up
counter =  0
limit = 11
while counter < limit:
    print(f"\t{counter}")
    counter = counter + 1

# count to limit for user input
counter = 1
limit = 5
while counter <= limit:
    print(counter)
    grade = input("Enter Grade: ")  # not even changing to num
    print(f"Grade is {grade}")
    counter += 1  # eq to counter = counter + 1

print("All fin")

# Print this kind of shape with while
# *****
# *****
# *****
# *****
# *****

len_side = 9
line = "* " * len_side
counter = 0
while counter < len_side:
    print(line)
    counter += 1


# count up something taking advantage of the end argument in print
print("Hello", "There", sep="~")
print("Hello", "There", end="xxxx")
print("Hello", "There")

# an example of incrementing 2 variables in one loop
counter = 0
char = 65
while counter < 30:
    print(chr(char), end="")
    char += 1
    counter += 1
print()

# ----- EXTRA CHALLENGES -----

# this would require nested while loops
# 0 1 2 3 4
# 0 1 2 3 4
# 0 1 2 3 4
# 0 1 2 3 4
# 0 1 2 3 4

# adjust the previous to print:
# 0 0 0 0 0 0 0 0 0 0
# 1 1 1 1 1 1 1 1 1 1
# 2 2 2 2 2 2 2 2 2 2
# 3 3 3 3 3 3 3 3 3 3
# 4 4 4 4 4 4 4 4 4 4
# 5 5 5 5 5 5 5 5 5 5
# 6 6 6 6 6 6 6 6 6 6
# 7 7 7 7 7 7 7 7 7 7
# 8 8 8 8 8 8 8 8 8 8
# 9 9 9 9 9 9 9 9 9 9

# then try
# 0
# 0 1
# 0 1 2
# 0 1 2 3
# 0 1 2 3 4
# 0 1 2 3 4 5
# 0 1 2 3 4 5 6
# 0 1 2 3 4 5 6 7
# 0 1 2 3 4 5 6 7 8
# 0 1 2 3 4 5 6 7 8 9

# HARDER AGAIN
# 0 1 2 3 4 5 6 7 8 9
#   0 1 2 3 4 5 6 7 8
#     0 1 2 3 4 5 6 7
#       0 1 2 3 4 5 6
#         0 1 2 3 4 5
#           0 1 2 3 4
#             0 1 2 3
#               0 1 2
#                 0 1
#                   0

# HARDER THAN CHUCK NORRIS
# 0 1 2 3 4 5 6 7 8 9
# 0 1 2 3 4 5 6 7 8
# 0 1 2 3 4 5 6 7
# 0 1 2 3 4 5 6
# 0 1 2 3 4 5
# 0 1 2 3 4
# 0 1 2 3
# 0 1 2
# 0 1
# 0
