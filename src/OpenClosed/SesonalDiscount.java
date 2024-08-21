package OpenClosed;

public class SesonalDiscount extends Discount {

	private double fixedDiscount;

	public SesonalDiscount(double fixedDiscount) {
		super();
		this.fixedDiscount = fixedDiscount;
	}

	public double applyDiscount(double totalAmount) {
		
		return totalAmount - fixedDiscount - 1 ;

	}

}
