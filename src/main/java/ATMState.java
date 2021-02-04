public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(String pin);
    void requestCash(double amount);
}
