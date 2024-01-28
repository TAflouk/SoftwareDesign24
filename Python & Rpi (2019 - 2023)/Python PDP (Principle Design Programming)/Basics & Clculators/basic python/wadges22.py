def wadges():
    try:
        print("hello this is the wadges calculator")
        line = "=" * 50
        print(line)
        hours = input("enter the hours num: ")
        hours = float(hours)
        rates = input("enter the rate: ")
        rates = float(rates)
        pay = (hours) * (rates) 
        print(f"this is your money {pay}")
        print(line)
    except:
        print ("Not a Valid Number!.")

    

wadges()

