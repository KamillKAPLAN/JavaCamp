import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(); /* Referans oluþturma, instance */
		product1.id = 1;
		product1.name = "Lenova V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		Product product2 = new Product(2, "Lenova V15", 16000, "32 GB Ram");
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Hp5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		Product[] products = { product1, product2, product3 };
		System.out.println("--> Products");
		for (Product product : products) {
			System.out.println(product.name + " - " + product.unitPrice + " - " + product.detail);
		}
		
		System.out.println("Product Length : " + products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
	}
}
