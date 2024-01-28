# travel cost calc
line  = 30 *"~"

#title
print("travel cost calculator")
print(line)



#input
miles = input("Enter miles driven: ")
miles = float(miles)

gallons = input("Enter gallons of gas used: ")
gallons = float(gallons)

cost_per_gallon = input("Enter cost per gallon: ")
cost_per_gallon = float(cost_per_gallon)


times = 'yes'
while times == 'yes':
    if miles or cost_per_gallon or gallon > 0 :


        miles_per_gallon = miles/gallons
        total_gas_cost = cost_per_gallon*gallons
        cost_per_mile = total_gas_cost/miles

        print("\n")
        print(f"Miles per gallon  {miles_per_gallon}")
        print(f"Total gas cost  {total_gas_cost}")
        print(f"Cost per mile   {cost_per_mile}")
    times = input("Enter Y to exit:").lower()
