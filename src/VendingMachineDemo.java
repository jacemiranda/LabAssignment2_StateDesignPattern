public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);

        System.out.println("--- Scenario 1: Successful Purchase ---");
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();

        System.out.println("\n--- Scenario 2: Rule Enforcement ---");
        machine.insertCoin();
        machine.dispenseItem();

        System.out.println("\n--- Scenario 3: Out of Order ---");
        machine.setOutOfOrder();
        machine.selectItem();

        System.out.println("\n--- Current Inventory Status ---");
        System.out.println("Remaining items: " + machine.getInventory());
    }
}