# one approach to solving this exercise
line = "=" * 60
print(line)
print("\t\tTemperature Converter")
print(line)

cel = input("\tEnter degrees Celsius: ")
cel = float(cel)

if cel < -273.15:
    print("Absolute Zero exceeded")
    cel = -273.15
elif cel == -273.15:
    print("This is absolute zero!")
# could have used an else, but the next line executes regardless,
# so no need.  else would have just added complexity here.
fahr = (9 / 5 * cel) + 32

print(f"\n\t{round(cel, 2)} degrees C is equal to {round(fahr, 2)} degrees F\n")

