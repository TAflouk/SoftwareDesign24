vat_rate = 0.21
line = "=" * 60
print(line)
print("\t\tTemperature Converter")
print(line)

cel = input("\tEnter degrees Celsius: ")
cel = float(cel)

fahr = (9 / 5 * cel) + 32

print(f"\n\t{round(cel, 2)} degrees C is equal to {round(fahr, 2)} degrees F\n")

