public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    @Override
    public void insertCoin(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    @Override
    public void dispenseItem(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    @Override
    public void setOutOfOrder(VendingMachine machine) { System.out.println("Already Out of Order."); }
}