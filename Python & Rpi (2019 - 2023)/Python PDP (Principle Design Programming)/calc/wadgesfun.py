
line = "~" * 30
#title
print(line)
print("Payroll Program")
print(line)

rates = input("Enter rates: ")
rates = float(rates)
hours = input("Enter hours: ")
hours = float(hours)
pay = (hours) * (rates) 
print(f"you will be paid €{pay}")






