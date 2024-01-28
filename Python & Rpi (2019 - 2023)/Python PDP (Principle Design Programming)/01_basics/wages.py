print("\nPayroll Program")
line = "~" * 30
print(line)
rate = input("Enter rate: ")
rate = float(rate)
hours = input("Enter hours: ")
hours = float(hours)
pay = rate * hours
print(f"You will be paid €{pay}")
print(line)

