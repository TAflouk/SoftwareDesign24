
def items_list():
    items = []
    counter = 0
    while True:
        one_item = input("Enter your item or q to exit: ").lower()
        if one_item == "q":
            indx_finding = input("enter the word that you want to see the index : " ).lower()
            #if indx_finding == "y":
            for i in items:  
                if i == indx_finding:
                    print(f"the items at index {items[i]}")
            #return items
        items.append(one_item)
        counter += 1
    return items
    

print(items_list())