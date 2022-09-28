package classesWithAttributes;

public class Main {
	
											//1. kullanım
	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "ASUS", 3000, 2);

											//2. kullanım
		/*Product product = new Product();
		product.setId(1);
		product.setDescription("ASUS");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.getKod(); */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod()); 

		// id
	}

}
