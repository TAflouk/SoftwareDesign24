# from utils import *
import i_spy
import scrambler
import bogglette
import jotto 
import file_functions


title = "My Fun Games"
# make a dict of str: Module
module_map={"marina": file_functions,
            "dee": scrambler, 
            "alan": i_spy,
            "taha":bogglette,
			"thanga":jotto
}

opts = list(module_map.keys())
opts.append("Quit")

def main():
    m = Menu(title, opts) 
    m.points = 33
    while True:
        # makes menu obj
        choice = m.display()
        
        if opts[choice] == opts[-1]:
            break
        m.points = module_map[opts[choice]].main(m.points)
        
    input("Quitting... Hit key to continue....")


# if __name__ == "__main__":
#     main()
