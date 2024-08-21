package OpenClosed;

public class FixedDiscount extends Discount {

	private double fixedDiscount;

	public FixedDiscount(double fixedDiscount) {
		super();
		this.fixedDiscount = fixedDiscount;
	}

	public double applyDiscount(double totalAmount) {
		
		return totalAmount - fixedDiscount;

	}

}
