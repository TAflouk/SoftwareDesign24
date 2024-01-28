# @Author:srattigan
# @Date:2021-01-07 20:38:51
# @LastModifiedBy:srattigan
# @Last Modified time:2021-01-07 20:38:51
import sys
import time
from recur_1 import countdown, factorial_iter, factorial_recur, fibonacci_recur

funcs = [countdown, factorial_iter, factorial_recur, fibonacci_recur]


for func in funcs:
    print(f"\n----Testing {func.__name__}----")
    for num in range(3, 25):
        start = time.time()  # get time before calling function
        func(num)  # call the function
        stop = time.time()  # get time after function has executed
        micros = round((stop - start) * 1000000, 4)  # check time difference
        print(f"\tExecution time was: {micros} microseconds")  # print exe time
print("\n---- END TIME TESTS ----")
