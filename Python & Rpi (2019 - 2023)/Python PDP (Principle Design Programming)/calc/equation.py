# x = (-b+sqrt(b**2-4ac)/2a
line = "~"*40
print(line)
print("\tQuadratic equation solver")
print(line)
from math import *


a = input("enter the value for A:  ")
a = float(a)
b = input("enter the value for B:  ")
b = float(b)
c = input("enter the value for C:  ")
c = float(c)
v = sqrt((b**2)-(4*a*c))
x = -b + v
z = x/2*a
an = -b - v
ee = an/2*a
print(line)
print(f"the quadrative equation {a} + {b} + {c}\n the roots are:\n \t{z} and \n  \t{ee}")












