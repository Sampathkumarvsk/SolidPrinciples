package BuilderPattern;

public class Product {
	private String name;
	private double price;
	private String description;
	private String category;
	private double discount;
	private boolean freeShipping;
	private int stock;
	
	private Product(ProductBuilder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.category = builder.category;
		this.description = builder.description;
		this.discount = builder.discount;
		this.freeShipping = builder.freeShipping;
		this.stock = builder.stock;
		}



	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setFreeShipping(boolean freeShipping) {
		this.freeShipping = freeShipping;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", description=" + description + ", category=" + category
				+ ", discount=" + discount + ", freeShipping=" + freeShipping + ", stock=" + stock + "]";
	}
	
	
	
	public static class ProductBuilder
	{
		
		private String name;
		private double price;
		private String description;
		private String category;
		private double discount;
		private boolean freeShipping;
		private int stock;
		
		
		public ProductBuilder(String name, double price) {
			this.name = name;
			this.price = price;
		}


		
		public ProductBuilder setCategory(String category) {
			this.category = category;
			return this;
		}


		public ProductBuilder setDescription(String description) {
			this.description = description;
			return this;
		}


		public ProductBuilder setDiscount(double discount) {
			this.discount = discount;
			return this;
		}


		public ProductBuilder setFreeShipping(boolean freeShipping) {
			this.freeShipping = freeShipping;
			return this;
		}


		public ProductBuilder setStock(int stock) {
			this.stock = stock;
			return this;
		}
		
		public Product build()
		{
			return new Product(this);
		}
		
		
		
		
		
		
		
		
	}
	
}
