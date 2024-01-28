from math import *
line = "~"*40

#title
print(line)
print("\tQuadratic equation solver")
print(line)




#input
a = 1
a = float(a)
b = 4
b = float(b)
c = 5
c = float(c)

# x = (-b+/-sqrt(b**2-4*a*b))/2*a operation
if a and b and c <0:
    x = b**2 - 4 * a * c
    ans_1 = (-b + (sqrt(abs(x)))/(2*a)
   # print("the curve does not intersect the x-axis")

        
#ans_2 = (-b -( sqrt(x)) / 2 *a

#print(f"The roots are {ans_1)i, {ans_2}i")