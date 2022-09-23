public class ShipCostCaculator {
    public static void main(String[] args) {
double itemPrice = 0;
double SHIPPING_RATE = .02;
double shippingCost = 0;
double totalCost;


        System.out.println(" Enter the price of the item");
        itemPrice = 50;

if (itemPrice < 100 ){
    shippingCost = SHIPPING_RATE * itemPrice;
}
                totalCost = shippingCost + itemPrice;
                System.out.println("Shipping cost is :" + shippingCost);
        System.out.println("Total cost is :" + totalCost);

    }
}