class BankAccount:
    """"Generic Bank Account 
    """
    acc_num = 10000

    def __init__(self, name , balance = 0):
        self.name = name 
        self.balance = balance
        self.account_num = self.acc_num
        self.acc_num +=1


    def deposit (self, amount):
        self.balance+=amount


    def withdraw(self,amount):
        self.balance-+amount

    def __str__(self):
        rep = f"bankacccount for {self.name}"
        rep += f"\n \tAccount num {self.account_num}"
        rep += f"\n \tBalance {self.balance:.2f}"
        return rep


class SavingAccount(BankAccount):
    amount_limit = 400
    interest_rate = 0.02

    def __init__(self , name , amount):
        if amount <50 :
            raise ValueError("Account could not be created")
            return None
        super().__init__(name,amount)
    
    def withdraw(self , amount ):
        if amount < self.amount_limit:
            self.balance -= amount
            print("Insufficient Funds")
        
        else:
            print(f"Amount cannot exceed limit of {self.amount_limit}")
            
b = BankAccount("sadad")
print(b)