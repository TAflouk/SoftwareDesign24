# vat 21%
line = "="*30
#percentage 
vat = 21/100
print(line)
print("\t   Vat calc")
print(line)

#input item names here
item_name = input("Enter Item: ")


# input item price here
price = input("Enter Price: ")
price = float(price)

print(line)
# calc  item_price*0.21+ the price 
vat_price = price*vat
vat_price = round(vat_price,2)
vat_and_price = vat_price + price
vat_and_price = round(vat_and_price,2)

print(f"the Vat on {item_name} is {vat_price} so the total cost is {vat_and_price}") 


