line = "~"*30

#title
print("Payroll program")
print(line)

ask = "y"
while ask=='y':

    #inputs
    rate = input("Enter rate: ")
    rate = float(rate)
    hours = input("Enter hours: ")
    hours = float(hours)

    if hours > 39 :
        over_t = (hours - 39) * (rate) * (1.5)
        pay = over_t + (39 *rate)
        

    else:
        pay = rate * hours
    print(f"you will get paid {pay}")
    ask = input("if you want to continue enter Y otherwise enter any key to exit: ").lower()

   