line = "="*30
#c = (9/5)*c +32
print(line)
print("     Temperature converter")


print(line)

# input
c = input("enter degrees celsius: ")
c = float(c)

print(line)




if c <= -273.15:
    print("absolute zero exceeded")
    c = -273.15
    f = -459.67
else:
    c == -273.15
    print("This is abslute zero!")
# calc
f = (9/5)*c+32    
print(f"{c} degree C is equal to {f} degrees F")
