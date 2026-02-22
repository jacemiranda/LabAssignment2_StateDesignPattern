public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setState(new DispensingState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}