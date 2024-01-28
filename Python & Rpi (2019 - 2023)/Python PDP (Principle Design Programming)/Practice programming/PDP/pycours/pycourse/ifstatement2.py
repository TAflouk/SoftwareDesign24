num =float (input("enter an num: "))
op= input("enter the opertation:")
num1 =float(input("enter an num: "))


if op == "*":
    print(num*num1)
elif op == "+":
    print(num+num1)
elif op == "-":
    print(num-num1)
elif op == "/":
    print(num/num1)
    if num or num1 > 0:
        print("you divid 0")
    
else:
    print("please enter valid number")