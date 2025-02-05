public class ShippingCost {

	public static double calculateShipping (double w) {
		return (w < 15.0 ? 9.95 : 12.95);
	}
	
    public static void main(String[] args) {

        double weight1, weight2, weight3;
        double cost1, cost2, cost3;

        weight1 = 22.0;
        weight2 = 10.0;
        weight3 = 12.0;
		
		cost1 = calculateShipping(weight1);
		cost2 = calculateShipping(weight2);
		cost3 = calculateShipping(weight3);
	
		
        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);

    }
}