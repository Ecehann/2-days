package classesWithAttributes;
//ÜRÜNE AİT ÖZELLİKLER

public class Product {
	
												//1. kullanım
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	
												//2. kullanım
	public Product() {
		//System.out.println("Yapıcı blok çalıştı");
			
/*1. ve 2. kullanımı aynı anda kullandığımızda buna: "overloading" (aşırı yükleme) denir.
Aynı isimle ama farklı parametrelerde metotlarımızı kullanabiliyoruz.
Bu konuya da: "construction" diyoruz.*/
		
	}

	// degiskenler
	// "attribute" or "field"
	private int id;
	private int stockAmount;
	private String name;
	private String description;
	private double price;
	private String kod;

	// getter bloğu --- int !!!
	public int getId() {
		return id;
	}

	// setter bloğu --- void !!!
	public void setId(int id) {
		this.id = id;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
