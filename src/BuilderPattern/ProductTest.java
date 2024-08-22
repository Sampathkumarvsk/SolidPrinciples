package BuilderPattern;

public class ProductTest {

	public static void main(String[] args) {

		Product product1 = new Product.ProductBuilder("Apple Macbook", 100).build();
		System.out.println(product1);

		Product product2 = new Product.ProductBuilder("Apple Macbook", 100).setCategory("Laptops")
				.setDescription("Speed Laptop").setFreeShipping(false).build();
		System.out.println(product2);

		product2.setStock(10);
		System.out.println(product2);

	}

}
