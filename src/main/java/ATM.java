public class ATM {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();

        atm.insertCard();
        atm.ejectCard();

        System.out.println("\n\n");

        atm.insertCard();
        atm.insertPin("12345");

        System.out.println("\n\n");

        atm.insertCard();
        atm.insertPin("1234");
        atm.requestCash(125);

        System.out.println("\n\n");

        atm.insertCard();
        atm.insertPin("1234");
        atm.requestCash(1251565);


    }
}
