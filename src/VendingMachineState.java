public interface VendingMachineState {
    void selectItem(VendingMachine machine);
    void insertCoin(VendingMachine machine);
    void dispenseItem(VendingMachine machine);
    void setOutOfOrder(VendingMachine machine);
}