# vat 21%
line = "¬"*40
#percentage 
vat = 21/100
print(line)
print("Vat calc")
print(line)
def vat_1():
    #input item names here
    item_name = input("enter the item name: ")

    print(line)

    # input item price here
    price = input("enter the item price here : ")
    price = float(price)

    print(line)
    # calc  item_price*0.21+ the price 
    vat_price = price*vat
    vat_price = round(vat_price,2)
    vat_and_price = vat_price + price
    vat_and_price = round(vat_and_price,2)

    print(f"the Vat on {item_name} is {vat_price} so the total cost is {vat_and_price}") 

vat_1()
