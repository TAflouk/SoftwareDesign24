#cel to fahr
line = "="*30
print(line)
print("     Temperature Converter")
print(line)



#input
cel = input("Enter degrees celsius: ")
cel = float(cel)

fahr = (9/5)*cel+32 
set_cel = -273.15
fahr1 = -459.67

if cel < -273.15:
    print("absolute zero exceeded")
    print(f"{set_cel} C is equal to {fahr1} degrees F")
elif cel == -273.15:
    print("This is absolute zero!")
    print(f"{cel} degrees C is equal to {fahr1} degrees F")
else:
    print(f"{cel} degrees C is equal to {fahr} degrees F" )


