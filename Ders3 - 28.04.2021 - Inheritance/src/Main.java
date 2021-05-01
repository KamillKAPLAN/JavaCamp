import Inheritance.Customer;
import Inheritance.CorporateCustomer;
import Inheritance.IndividualCustomer;
import Inheritance.UnionCustomer;
import Inheritance.CustomerManager;

import Inheritance2.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- Products");
		Product product1 = new Product(1, "Lenova V14", 16000, "16 GB Ram", 10); /* Referans oluþturma, instance */
		System.out.println("Product1 Ýndirimden Önceki Fiyat :" + product1.getUnitPrice());
		System.out.println("Product1 Ýndirimden Sonraki Fiyat :" + product1.getUnitPriceAfterDiscount());
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(20000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(20);
		System.out.println("Product1 Ýndirimden Önceki Fiyat :" + product2.getUnitPrice());
		System.out.println("Product1 Ýndirimden Sonraki Fiyat :" + product2.getUnitPriceAfterDiscount());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		System.out.println("--- Categories");
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		System.out.println("--- Inheritance : Miras Almak");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "67890";
		
		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		/* customerManager.add(individualCustomer);
		customerManager.add(corporateCustomer);
		customerManager.add(unionCustomer); */
		
		Customer[] customers = { individualCustomer, corporateCustomer, unionCustomer };
		customerManager.addMultiple(customers);
		
		System.out.println("--- Inheritance2 : Miras Almak");
		LogManager logManager = new LogManager();
		logManager.log(1);
		
		Inheritance2.CustomerManager customerManager2 = new Inheritance2.CustomerManager();
		customerManager2.add(new DatabaseLogger());
		
	}
}
