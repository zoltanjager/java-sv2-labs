package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("car", 5000, 4,0.27);

        System.out.println(billItem.calculateTotalPrice());
    }
}
