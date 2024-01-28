

import string 
import random



odds_dict = {5: 65780,
             4: 626,
             3: 31,
             2: 5,
             1: 2,
             0: 0
             }


# this function to creat a list of letters from A-Z and put them in a var 
li = list(string.ascii_uppercase)


# this loop to get from the user 5 diff letter and save them in a var 
num = []
count =0
while 5 >len(num):
    count+=1 
    char = input("Enter char: ").upper()   
    if len(char)<2 and char.isalpha() and char not in num:
        num.append(char)

# this loop to create 5 diff random letters 
liss = []
limit = 5
while len(liss)< limit:
    se = random.choice(li)
    if se not in liss:
        liss.append(se)

# to check the matches balls between the system and the user 
match_char =[]
for i in num:
    for e in liss:
        if e ==i:
            match_char.append(e)


#to print the random list that system choosen it and whatever letter user picks 
print(num)
print(liss)

# this to return the value by choosing the key of the dict
if len(match_char) == 5:
    print(odds_dict[5])
elif len(match_char) == 4:
    print(odds_dict[4])
elif len(match_char) ==3:
    print(odds_dict[3])
elif len(match_char) == 2:
    print(odds_dict[2])
else:
    print(odds_dict[0])




















# simple grade

