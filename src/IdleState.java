public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Cannot dispense. No item selected.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}