package Inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
/* SOLID - Open Closed Principle 
 * sisteme yeni �zellik eklendi�inde mevcutta bulunan hi� bir kodu de�i�tiremezsin, 
 * sadece yeni kodu eklersin
 */