def for_el():
    
    while True:
        try:
            successful = True#False #True
            
            for number in range(3):
                print("Attempt")
                if successful:
                    print("Succesful!")
                break           
            else:
                 
                 print("Attempted 3 times and failed")           
                                   
        except:
            print("enter True or False")
        ask = input("do u want to continue enter N to stop: ")
        ask = ask.lower()
        if ask == "n":
            break
         
        
for_el()
