num1 = int (input ("enter nuumber 1 :"))
num2 = int (input ("enter nuumber 2 :"))
big = 0
if num1 > num2 :
    big = num1
else:
    big = num2
    
print(big)


# or
num1 = int (input ("enter nuumber 1 :"))
num2 = int (input ("enter nuumber 2 :"))
big = ""
if num1 > num2 :
    big = 'num1'
else:
    big = 'num2'
    
print(big)


# or we can make it inline but with string value

num1 = int (input ("enter nuumber 1 :"))
num2 = int (input ("enter nuumber 2 :"))
big = 'num1' if num1>num2 else 'num2'
print(big)


# or we can find as int value

num1 = int (input ("enter nuumber 1 :"))
num2 = int (input ("enter nuumber 2 :"))
big = num1 if num1>num2 else num2
print(big)
