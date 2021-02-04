public class NoCash implements  ATMState{

    ATMMachine machine;

    public NoCash(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Not cash !!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Not cash !!\nYou didn't enter a card");
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("Not cash !!");
    }

    @Override
    public void requestCash(double amount) {
        System.out.println("Not cash !!");
    }
}
