import time
from recur_2 import fibonacci_recur, fibonacci_recur_mem

funcs = [fibonacci_recur, fibonacci_recur_mem]


for func in funcs:
    print(f"\n----Testing {func.__name__}----")
    for num in range(3, 40, 10):
        start = time.time()  # get time before calling function
        func(num)  # call the function
        stop = time.time()  # get time after function has executed
        micros = round((stop - start) * 1000000, 4)  # check time difference
        print(f"\tExecution time was: {micros} microseconds")  # print exe time
print("\n---- END TIME TESTS ----")
