line = "~"*30
print(line)
print("\twadges calculator")
print(line)

rate = input("Enter rate: ")
rate = float(rate)
hours = input("Enter hours: ")
hours = float(hours)

if hours <=39:
    pay = rate*hours
else:
    o_t_hrs = hours - 39
    o_t_pay = rate * 1.5 * o_t_hrs
    total = 39 * rate + o_t_pay
    print(f"you will be paid €{total}")
