public class ATMMachine {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState state;

    double cashInMachine;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        state = noCard;

        if (cashInMachine < 0) state = atmOutOfMoney;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void setCashInMachine(double cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void requestCach(double amount) {
        state.requestCash(amount);
    }

    public void insertPin(String pin) {
        state.insertPin(pin);
    }

    public ATMState getState() {
        return state;
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPinState() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }
}
