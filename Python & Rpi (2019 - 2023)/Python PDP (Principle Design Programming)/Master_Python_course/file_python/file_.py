# ----------------------
# ----File Handling
# ----------------------
# "a" Append  Open File For Appending Values, Create File if Not Exists
# "r" Read  [Default Value] Open File For Read and Give Error If File is Not Exists
# "w" Write Open File For Writing, Create File If not Exists
# "x" Create Crete File, Give Error if File Exists
#----------------------------------------------------------

import os

# Main Current Working Directory
print(os.getcwd())  #a method to get the current working dir

#print(os.path.abspath(__file__))


# Directory For The Open File
print(os.path.dirname(os.path.abspath(__file__)))

# Change Current Working Directory
os.chdir(os.path.dirname(os.path.abspath(__file__)))

file = open(r"score.txt","r") # we can add r befor the "quotions" that will read the file if we want the format as string and there are \n or \t

print(file)
