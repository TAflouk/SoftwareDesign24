  # @Author:TAflouk
# @Date:2020-12-10 13:38:59
# @LastModifiedBy:TAflouk
# @Last Modified time:2020-02-04 12:19:08

import string
def encrypt(s, key):
    '''
    (str, int) -> str
    >>> encrypt('abc', 1)
    'bcd'
    >>> encrypt('the Fat cat!', 1)
    'uid gbu dbu!'
    '''
    print("Encrypt caesar called")
    input("Waiting...")
    new_string = ""
    for element in s:
        if ord(element) == 32:
            new_string += chr(ord(element))
            
        elif ord(element) + key > 122:
            calc = (ord(element) + key) - 122
            new_string += chr(96+calc)
            
        elif (ord(element) + key > 90) and (ord(element)) <=96:
            calc = (ord(element) + key) - 90
            new_string += chr(96 + calc)
        else:
            new_string += chr(ord(element)+ key )
    return f"{new_string} I am encrypted"

print(encrypt("cat   @gmail.com",1))
print("=======")
print(encrypt("CAT",1))


str_alphabet = string.ascii_lowercase
#print(str_alphabet)
user_input = "cat@gmail.com"
key = 1
count = 0
new_string = ""
# 97 ---> 122 lower 
# 65 --> 90 upper
# ord(space) = 32
#print(ord("*"))

 

