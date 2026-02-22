public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Currently dispensing. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Already dispensing.");
        machine.setState(new IdleState());
        System.out.println("Dispensing complete. Returning to Idle.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine error during dispensing. Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}