public class HasPin implements ATMState {

    ATMMachine machine;

    public HasPin(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        machine.setState(machine.getNoCardState());
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("PIN already entered");
    }

    @Override
    public void requestCash(double amount) {
        if(amount > machine.cashInMachine){
            System.out.println("Not enough cash !");
            ejectCard();
        }
        else if(machine.cashInMachine <= 0){
            System.out.println("Not enough cash !");
            machine.setState(machine.getNoCashState());

        }
        else{
            System.out.println(amount+" provided by ATM");
            machine.setCashInMachine(machine.cashInMachine - amount);
            ejectCard();
        }
    }
}
