def compress_string(line):
    new_str = ""
    count = 1
    for i in range(len(line)):
        j = i
        j +=1 
        try:
            if line[i] == line[j]:
                count += 1

            else:
                new_str += line[i]
                new_str += str(count)
                count = 1
        except:
            new_str += line[i]
            j = i
            j -= 1
            if line[i] == line[j]:
                new_str += str(count)
            else:
                new_str +="1"
    #if len(new_str) > len(line):
    #    print(line)
    #else:
    print(new_str)

str_in = input("Enter a with repeated charachters:\n")
compress_string(str_in)

    