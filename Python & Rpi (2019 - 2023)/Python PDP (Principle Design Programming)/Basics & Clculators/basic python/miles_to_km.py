# miles to km calculator
line = "~"*30
print("Miles to km converter")
print(line)




keep_goin = "y"
while keep_goin == "y":
    #input
    miles = input("Enter Miles: ")
    miles = float(miles)
    #calc
    kilo_meter = miles * 8 / 5
    if miles < 0 :
        print("negative distance are not possible")
    else:
        print(f"{miles} miles is equal to {kilo_meter} km")
    keep_goin = input("enter Y if you want to continue:").lower()





