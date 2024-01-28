import math




def vol_sphere(radius):
    # v = (4/3) * pi * r**3
    if radius < 0:
        print("invalid number")
        return radius
    else:
        vol  = (4/3) * math.pi * radius **3
        return vol

#print(vol_sphere(-1))
    
def vol_sphere_helper():
    num = input("enter num: ")
    vol_sphere(num)
    return f"a sphere with radius {num} has volume {num}"

#print(vol_sphere())

def get_score():
    listnum = []
    while True:
        item  = input("enter an item:")
        if item == "":
            break
        listnum.append(item)
    return listnum

def num_proc(arr):
    print(f"{len(arr)} num found")
    total = 0
    for i in arr:
        total += i
    print(f" total is {total}")
    avr = total / len(arr)
    print(f"average is {avr}")
    
def welsh_char(s):
    not_welsh = "kvxz"
    for e in not_welsh:
        if e in not_welsh:
            print(f"{e} is not welsh")
        else:
            print(f"{e} is welsh")
            
def vat_calc():
    cost = input("enter cost of the good")
    user_i = input("enter something: ")
    if user_i == "y":
        return cost * 0.135
    else:
        return cost *0,23

num_translator = {
    1:["aon","uno", "un"],
    2:["do", "due", "doh"],
    3:["tri", "tre", "trois"],
    4:["ceathair", "quattro", "quatre"]
    }

num_translator[5] = ["cuig", "cinque", "cinq" ]
num_translator[1][-1] = "deux"

#print(num_translator)
for i in num_translator:
    print(f"{i} --> {num_translator[i]}")
