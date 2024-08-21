package OpenClosed;

public class PercentageDiscount extends Discount {

	private double percentageDiscount;

	public PercentageDiscount(double percentageDiscount) {
		super();
		this.percentageDiscount = percentageDiscount;
	}

	public double applyDiscount(double totalAmount) {

		return totalAmount - (totalAmount - (totalAmount * percentageDiscount/100));
		
	}

}
