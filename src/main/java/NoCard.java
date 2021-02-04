public class NoCard implements  ATMState{
    ATMMachine machine;

    public NoCard(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void insertPin(String pin) {

    }

    @Override
    public void requestCash(double amount) {

    }
}
