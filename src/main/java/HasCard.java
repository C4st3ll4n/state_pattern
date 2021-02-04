public class HasCard implements ATMState{

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(String pin) {
        if(pin.equals("1234")){
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setState(atmMachine.getHasPinState());
        }else{
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Card Ejected");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(double amount) {
        System.out.println("Insert PIN first");
    }
}
