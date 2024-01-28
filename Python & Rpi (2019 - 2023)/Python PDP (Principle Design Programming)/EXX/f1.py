l1=['tiger','CAT','dog','lion']
def check_word (l1):
   # =check_word
    for word in (l1):
        return word
        for count in len(word):
            return(count)
            count+=1
        
#check_word('cat')
import gameutilities as g

def count_letters(fl):
    '''( file) -> int
    count the letters in a list of str
    '''
    word_list=g.file_to_list(fl)
    count=0
    for word in word_list:
      #  print(word)
      #  print(len(word))
        count+=len(word)
    return count
        
    
        
c=count_letters('words.txt')
#print(c)
        
def check_indices(word1,word2):
    l2=[]
    for o in word1:
        l2.append(int(o))
    l2.sort()
    l2.reverse()
    for w in range(0,len(l2)):
        l2[w]=l2[w]
    return l2[:word2]
        
        
 
            


check_indices('cat','bat')