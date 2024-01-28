# basic vat calc
vat_rate = 0.21
line = "=" * 50
print(line)
print("\t\tVAT Calculator")
print(line)
item = input("Enter Item: ")
price = input("Enter Price: ")
price = float(price)
vat = round(price * vat_rate, 2)
print(f"The VAT on {item} is {vat} so the total cost is {round(price+vat, 2)}")
print(line, "\n")
