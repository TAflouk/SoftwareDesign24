print("\nPayroll Program")
line = "~" * 30
print(line)
rate = input("Enter rate: ")
rate = float(rate)
hours = input("Enter hours: ")
hours = float(hours)

if hours <= 39:
    pay = rate * hours
else:
    o_t_hrs = hours - 39
    o_t_pay = rate * 1.5 * o_t_hrs
    pay = 39 * rate + o_t_pay

print(f"You will be paid €{pay}")
print(line)

