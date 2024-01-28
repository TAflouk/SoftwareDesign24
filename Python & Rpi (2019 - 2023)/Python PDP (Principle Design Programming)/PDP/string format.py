# STRING FORMAT
#how to format the string
my ="hello %s!what do you want?" %"peter" # we use this symbole "%s" 
my = "my number is %s " %546 #and it works with numbers
my = "my number is %s " %123.2354 # as we see it works with fractions 
my = "my number is %d" %343 # we can also use "%d" to format decimal numbers
my = "my number is %d" %222.111 # %d it write the number as a decimal with not as a fraction
my = "number1 is %s , number2 is %s , number3 is &s " %(777,888,999) #we can do that with a big list as we see to format more than number
my = "name1: %s , name2: %s, name3: %s"  %("taha" ,"ali","khaled") # and it works as well with list of names
print(my)
