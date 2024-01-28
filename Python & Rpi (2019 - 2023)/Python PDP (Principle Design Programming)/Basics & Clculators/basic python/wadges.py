



dix = {}
count = 0 

def dict2(list1,list2):
    for i in range(0, len(list1), 2):
        dix = {list1[i +1]: list2[i +1]}
        for i in range(0, len(list2),2):            
            return dix
         
#print(dict2([1,2,3,4,5,6],["A","B","C","D"]))


def dict_merge(d1,d2):
    new_dict = {}
    for key in d1:
        new_dict[key] = d1[key]
    for e in d2:
        new_dict[e] = d2[e]
    return new_dict


print(dict_merge({"a":1 , "b":2, "c":4,"d":28},{"s":23,"q":7 , "r":6}))










class BankAccount:
    acc_num = 10000
    def __init__(self, name ,account_num , balance=0):
        self.name =name
        self.account_num = account_num
        self.balance = balance 

    def deposit(self):
        pass


    def withdraw(self):
        pass


    def __str__(self):
        pass
    
#b1 = BankAccount("freddasd")
#b2 = BankAccount("sadsd",22)