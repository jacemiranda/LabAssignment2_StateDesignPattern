public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private double balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.currentState = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void selectItem() { currentState.selectItem(this); }
    public void insertCoin() { currentState.insertCoin(this); }
    public void dispenseItem() { currentState.dispenseItem(this); }
    public void setOutOfOrder() { currentState.setOutOfOrder(this); }

    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }
}