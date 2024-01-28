
line = "~" * 30
print(line)
print("Travel Cost Calculator")
print(line)
#get numbers or input
miles_driven = input("enter miles driven: ")
gallon_used= input("enter gallons of gas used: ")
cost_per_gallon = input("how much per a gallon: ")
print("\n")
#calculation 
miles_driven = float(miles_driven)
gallon_used = float(gallon_used)
cost_per_gallon = float(cost_per_gallon)
miles_per_gallon = miles_driven/gallon_used
total_gas_cost = cost_per_gallon*gallon_used
cost_per_mile = total_gas_cost / miles_driven

#output
print (f"miles per gallon {miles_per_gallon}")
print(f"total gas cost {total_gas_cost}")
print(f"cost per mile {cost_per_mile} per mile")


