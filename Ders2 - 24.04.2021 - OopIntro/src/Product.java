
public class Product {
	/* constructor : `yap�c�` block. Bir class'� olu�tururken yapmas�n� istedi�imiz �eyi buraya yazar�z. */
	public Product() {
		System.out.println("Ben �al��t�m.");
	}
	/* overloading : birden fazla olu�turma - a��r� y�klenme */
	public Product(int id, String name, double unitPrice, String detail) {
		this(); /* Bu class'�n o anki ��ren�inin parametresiz olan�n� �al��t�r. */ 
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
