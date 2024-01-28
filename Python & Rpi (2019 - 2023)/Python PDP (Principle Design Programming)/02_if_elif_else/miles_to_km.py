print("\nMiles to Km Converter")
line = "~" * 30
print(line)

miles = input("\nEnter miles to convert: ")
miles = float(miles)

if miles >= 0:
    km = miles * 8 / 5
    print(f"{miles} miles is equal to {km}Km\n")
else:
    print("Negative distances are not possible\n")
