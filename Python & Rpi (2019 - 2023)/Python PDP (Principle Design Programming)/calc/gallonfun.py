def kilometer():  
    try:
        line = "¬" * 30
        miles_driven = input("enter the miles: ")
        gallon_used= input("enter how many gallon used: ")
        cost_per_gallon = input("how much per a gallon: ")
        print(line)
        miles_driven = float(miles_driven)
        gallon_used = float(gallon_used)
        cost_per_gallon = float(cost_per_gallon)
        miles_per_gallon = miles_driven/gallon_used
        total_gas_cost = cost_per_gallon*gallon_used
        cost_per_mile = total_gas_cost / miles_driven
        print (f"your miles per gallon {miles_per_gallon}")
        print(f"your total gas is {total_gas_cost}")
        print(f"it cost you {cost_per_mile} per mile")
        print(line)
    except:
        print("Enter A Valid Num!.")
kilometer()
