# ----------------------
# ---- File Handling ---
# ----------------------
#----------------------------------------------------------



# Deletes the old content and it overwrite the new things
def write_file():
    
    my_file.write("Hello from the other siiiide")
    my_file.write("seconde\n")
    my_file.write("third")

# this will create a new file
def create_file():
    my_file = open(r"C:\Users\19TAflouk.avtos\Desktop\file_python\new.txt", "w") 

    my_file.write("programing for fun\n" * 1000) #
    
def write_line():
    my_list = ["good\n", "goat\n", "dog\n"]
    my_file = open(r"C:\Users\19TAflouk.avtos\Desktop\file_python\new.txt", "w")
    my_file.writelines(my_list)
    
def append_file():

    my_file = open(r"C:\Users\19TAflouk.avtos\Desktop\file_python\new.txt", "a")
    my_file.write("this is append str with new line \n")

def binary_search(arr, term):
    start_idx = 0
    end_idx = len(arr) -1
    while start_idx <= end_idx :
        mid_point = start_idx + (end_idx - start_idx) //2
        midpoint_value = arr[mid_point]
        
        if midpoint_value == term:
            return f"{term} founded in ({mid_point} index) position "
        
        elif term < midpoint_value:
            end_idx = mid_point - 1
            
        else:
            start_idx = mid_point + 1
    return f"{term} is not in {arr}"

def sigma(n, k):
    count = 0
    for each_number in range(n,k):
        #print(each_number)
        count += each_number
    return f"the sum from {n} to {k} is {count}"

#print(binary_search(ee, 71))
#print(sigma(2,5))
import time as t
ROUND = 10
def time_passed(start_time):
    """Function to calculate the time passed
    (float) -> (int)
    """
    total = int( start_time - t.time())
    return total

time_now = t.time()
#print(time_now)
while time_passed(time_now) + ROUND != 0:
    print(time_passed(time_now)+ROUND)
print("done")