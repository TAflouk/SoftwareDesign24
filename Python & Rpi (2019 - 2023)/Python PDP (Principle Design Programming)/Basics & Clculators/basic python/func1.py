 

def check_if_in(word:str, char:str):
    """check to see if a char appears in a word

    args:
        word(str): a word
        char (str): a single character
        return:
            bool: True if the char is found, otherwise: False
            """
    if char in word:
        return True
    else:
        return False
    # return a boolean value indicating if the char is in the word 

def make_tags(tag, word):
  tag1 = "<"
  tag2 = "/>"
  total = tag1 + word + tag2
  print(total)
#make_tags("hi","bye")

def extra_end(str):
  #print(len(str))
  one = str[-1]
  tow = str[-2]
  print(tow+one) 
#extra_end("hello")

def double_char(s):
    new_str = ''
    for char in s:
        new_str +=char*2
    return new_str
#d1 =double_char('hi-there')
#print(d1)