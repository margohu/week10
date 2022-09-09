package week4;

public class Ex72 {
    public static void main(String[] args) {
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        system.out.println(a);
        system.out.println(b);
        system.out.println(c);

        transfer(a, b, 50);

        system.out.println(a);
        system.out.println(b);
        system.out.println(c);

        transfer(b, c, 25);

        system.out.println(a);
        system.out.println(b);
        system.out.println(c);
    }

    public static void transfer(Account from, Account to, double amount){
        from.withdrawal(amount);
        to.deposit(amount);
    }




//Teine ülesanne
//    public static void main(String[] args) {
//        Account mattAccount = new Account("Matts account", 1000);
//        Account myAccount = new Account("My account", 0);

//        System.out.println(mattAccount);
//        System.out.println(myAccount);

//        mattAccount.withdrawal(100.0);
//        System.out.println(mattAccount);

    //       myAccount.deposit(100.0);
//        System.out.println(myAccount);

}




//esialgne ülesanne
//    public static void main(String[] args) {
//        Account bartosAccount = new Account("Barto's account",100.00);
//        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);
//
//        System.out.println("Initial state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);

//        bartosAccount.withdrawal(20);
//        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
//        bartosSwissAccount.deposit(200);
//        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

//        System.out.println("Final state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);
    }
            }

