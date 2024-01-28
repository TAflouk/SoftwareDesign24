# count up

def counter_up(counter=0, limit=1):
    while counter < limit:
        print(f"\t{counter}")
        counter += 1
#counter_up(1,100)


# count to limit for user input
def count_limit(counter =1 , limit = 5):
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
def sym_shape(num=5, sym="*"):
    counter = 0
    while counter < num:
        print(num*sym)
        counter +=1
#sym_shape(12,"#")

def len_side_gen(len_side=9):
    line = "* " * len_side
    counter = 0
    while counter < len_side:
        print(line)
        counter += 1


# count up something taking advantage of the end argument in print
def prints():
    print("Hello", "There", sep="~")
    print("Hello", "There", end="xxxx")
    print("Hello", "There")

# an example of incrementing 2 variables in one loop
def counter_char(char = 65):
    counter = 0
    while counter < 30:
        print(chr(char), end="")
        char += 1
        counter += 1
    #print()

# ----- EXTRA CHALLENGES -----

# this would require nested while loops

num = 4

def count_number(num):

    count = 0
    while count < num:
        counter = 0

        while counter <= num:
            print(counter,end=" ")
            counter +=1
        count +=1
        print()
        
#count_number(4)


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

def counter_rec_nums(num):
    count = 0
    while count < num:
        counter = 0
        while counter < num:
            print(count, end=" ")
            counter +=1
        count +=1
        print()




def tri_nums(num):
    pass

counter = 0 
num = 10
while counter <= num: # counter=0  , num=10 ,  loop(10) == TRUE
    count = 0 # set count=0
    while count <= num:  # count is 0 and num is 10 so loop till 10 time 
        print(count, end=" ") # print count which is 0 is in start 
        counter += 1
        count += 1 # count = count + 1 count
    
    print()
    
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