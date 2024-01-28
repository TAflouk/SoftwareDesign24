# imports are ALWAYS at the beginning of the file
from math import sqrt

line = "~" * 60
print(line)
print("\t\tQuadratic Equation Solver")
print(line)
# with 1, 4, 3 the roots should be -1 and -3
a = input("Enter the value for 'a': ")
a = int(a)
b = input("Enter the value for 'b': ")
b = int(b)
c = input("Enter the value for 'c': ")
c = int(c)

print(f"For the quadrative equation {a}x\u00b2 + {b}x + {c}")
# ( -b +/- sqrt(b^2 - 4ac) ) / 2a
y = b**2 - (4 * a * c)
if y >= 0:
    x = sqrt(y)
    ans_1 = (-b + x) / 2 * a
    ans_2 = (-b - x) / 2 * a
    print("The roots are:")
    print(f"\t{ans_1} and")
    print(f"\t{ans_2}\n")
else:
    print("The curve does not intersect the x-axis\n")
    # from here you can work out the imaginary roots
    
