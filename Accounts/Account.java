class Account{
    int accountNumber;
    double balance;
    String accountType;
    Account(int accountNumber, double balance, String accountType){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
    int getAccNum(){
        return accountNumber;
    }
    double getBalance(){
        return balance;
    }
    String getAccType(){
        return accountType;
    }
}