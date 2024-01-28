
from sigma_pi import sigma, pi, expr_1, expr_2, expr_3
from search_sort import search # and your sort algo


print("\n----- Testing Sigma Function -----")
print(f"Sigma is {sigma(2, 6, expr_1)} \n")  # 180
print(f"Sigma is {sigma(4, 7, expr_2)} \n")  # 680
print(f"Sigma is {sigma(2, 6, expr_3)} \n")  # 

print("\n----- Testing Pi Function -----")
print(f"Pi is {pi(2, 6, expr_1)} \n")  # 
print(f"Pi is {pi(4, 7, expr_2)} \n")  # 
print(f"Pi is {pi(2, 6, expr_3)} \n")  # 

# could be refactored and added to for testing 

print("\n----- Testing search Function (unsorted) -----")
print("Searching [1, 11, 3, 5, 77, 9, 10]", search([1, 11, 3, 5, 77, 9, 10], 7, False))
print("Searching [11, 35, 15, 71, 9, 101]", search([11, 35, 15, 71, 9, 101], 9, False))
print("Searching [12, 43, 25, 57, 19, 3]", search([12, 43, 25, 57, 19, 3], 3, False))
print("Searching [21, 13, 53, 100, 17, 92]", search([21, 13, 53, 100, 17, 92], 100, False))

# See sample code in the provided file, in the section under if name is main

