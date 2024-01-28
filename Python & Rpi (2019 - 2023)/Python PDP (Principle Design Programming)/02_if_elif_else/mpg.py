print("Travel Cost Calculator")
line = "~" * 30
print(line)

miles = input("Enter miles driven: ")
miles = float(miles)

gallons = input("Enter gallons of gas used: ")
gallons = float(gallons)

cost_gallon = input("Enter cost per gallon: ")
cost_gallon = float(cost_gallon)

mpg = miles/gallons
total_cost = gallons * cost_gallon
cost_per_mile = total_cost / miles
print(f"\nMiles Per Gallon\t{mpg}")
print(f"Total Gas Cost \t\t{total_cost}")
print(f"Cost Per Mile \t\t{cost_per_mile}")
