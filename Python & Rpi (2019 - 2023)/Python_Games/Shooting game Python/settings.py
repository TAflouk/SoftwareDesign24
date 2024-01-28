import string

vowel = []
constant = []


all_letters = string.ascii_lowercase
for i in all_letters :
    if i == "e" or i == "i" or i == "i" or i == "o" or i == "u" or i == "a":
        vowel.append(i)
    elif i != "e" or i != "i" or i != "i" or i != "o" or i != "u" or i != "a":
        constant.append(i)
#print(vowel)
#print(constant)

def prettify(letter_list ,sep =""):
    for each_element in letter_list:
        print(each_element, end = sep)
    
prettify(["a","r","i","k","p"],"-")
