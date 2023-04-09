class AccountDemo{
    public static void main(String[] args){
        Account a1= new Account(360, 7520.3, "Type A");
        Account a2= new Account(362, 68057.5, "Type B");
        System.out.println("Account 1's balance is: " + a1.getBalance() + " and Account Type is: " + a1.getAccType());
        System.out.println("Account 2's account number is: " + a2.getBalance() + " and Account Type is: " + a2.getAccType());
    }
}