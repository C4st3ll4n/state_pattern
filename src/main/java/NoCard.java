public class NoCard implements  ATMState{
    ATMMachine machine;

    public NoCard(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please insert your PIN");
        machine.setState(machine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(double amount) {
        System.out.println("Enter a card first");
    }
}
