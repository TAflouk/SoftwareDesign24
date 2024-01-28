# to mactch something to something else 
import re


text = "a"  # it should be small leter and the patt small as well to match and we can doi it as an input to check 
patt = "^[a-z]$"

v = re.match(patt , text)
if v == None: print(No)
else: print("Yes")



#          text = input("enter your name:")
#    patt = "^[A-Z][a-z]+$"


#    or this to check 2 values match 



#       text = input("enter your name:")
#       patt = "^[A-Z][a-z]+\s[A-Z][a-z]+$"