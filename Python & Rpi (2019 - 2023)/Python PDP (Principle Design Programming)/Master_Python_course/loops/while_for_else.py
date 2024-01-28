l_num = [2,33,44,11,23,56]

idx = 0
count = 0
while idx <= len(l_num)-2:
    while count <= len(l_num)-2:
        if l_num[count] < l_num[idx+1]:
            l_num[idx+1],l_num[count] = l_num[count],l_num[idx+1]
            count +=1
            idx += 1
            
print(l_num)