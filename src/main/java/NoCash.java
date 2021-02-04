public class NoCash implements  ATMState{

    ATMMachine machine;

    public NoCash(ATMMachine machine) {
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
