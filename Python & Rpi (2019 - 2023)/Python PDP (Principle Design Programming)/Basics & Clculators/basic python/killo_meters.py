
print("calculate from killometer to miles")
line = "~"*30
print(line)
miles = input("enter miles to convert: ")
miles = float(miles)
if miles < 0:
    print("negative distances are not possible!...")
else:
    kilo_meter = float(miles) * 8 / 5
    print(f"{miles} miles is equal to {kilo_meter} kilometer")

