
public class Product {
	/* constructor : `yapýcý` block. Bir class'ý oluþtururken yapmasýný istediðimiz þeyi buraya yazarýz. */
	public Product() {
		System.out.println("Ben çalýþtým.");
	}
	/* overloading : birden fazla oluþturma - aþýrý yüklenme */
	public Product(int id, String name, double unitPrice, String detail) {
		this(); /* Bu class'ýn o anki öðrenðinin parametresiz olanýný çalýþtýr. */ 
		this.id = id; /* this : bu class'taki demek */
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail; 
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
