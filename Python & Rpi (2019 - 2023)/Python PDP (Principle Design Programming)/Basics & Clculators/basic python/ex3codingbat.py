def chekend(s):
    if s[0]==s[-1]:
        return True
    return False

#print(chekend("ahaha"))
#print(chekend("camel"))
#print(chekend("ahaha "))


def ord_print(s):
    for i in s :
        print(ord(i))


#print(ord_print("ab"))

def tow_char(s):
    for i in s:
        print(i)
        


print(tow_char("hello"))



#Write piglet_latin( s ), which takes as input a string s. s will be a single word consisting of lowercase letters. Then, piglet_latin should output the translation of s to "piglet latin," which has these rules: 
#If the input word has no letters at all (the empty string), your function should return the empty string 
#If the input word begins with a vowel, the piglet latin output simply appends the string 'way' at the end. 'y' will be considered a consonant, and not a vowel, for this problem. 
#Example: 
#piglet_latin('one') returns 'oneway' 

#If the input word begins with a consonant, the piglet latin output is identical to the input, except that the input's initial consonant is at the end of the word instead of the beginning and it's followed by the string 'ay'. 
#Example: 
#piglet_latin('be') returns 'ebay' 

#Of course, this is not full pig latin, because it does not handle words beginning with multiple consonants correctly. For example, piglet_latin('string') returns 'tringsay'.  


def piglet_latin(s):
    s = s.lower()
    if s == "":
        return s
    elif s[0]== "a" or s[0]== "o" or s[0]== "i" or s[0]== "e" or s[0]== "u":
        return s+"way" 
    else:
        return s[1:] + s[0] + "ay"


#print(piglet_latin("car"))
#print(piglet_latin("ollo"))
#print(piglet_latin("illo"))
#print(piglet_latin("ellm"))
#print(piglet_latin("bello"))