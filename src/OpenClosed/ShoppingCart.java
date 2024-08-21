package OpenClosed;

public class ShoppingCart {

	public static void main(String[] args) {

		FixedDiscount fixedDiscount = new FixedDiscount(10);
		double fixedDiscountCost = fixedDiscount.applyDiscount(1000);
		System.out.println(fixedDiscountCost);

		PercentageDiscount percentageDiscount = new PercentageDiscount(10);
		double percentageDiscountCost = percentageDiscount.applyDiscount(1000);
		System.out.println(percentageDiscountCost);

		SesonalDiscount sesonalDiscount = new SesonalDiscount(10);
		double sesonalDiscountCost = sesonalDiscount.applyDiscount(1000);
		System.out.println(sesonalDiscountCost);
	
	}

}
