package Odev2;

public class Product {
	
	/* Constructor */
	public Product() {
		System.out.println("Yapýcý block çalýþtý.");
	}
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		this._id = id;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
	}
	
	
	/* Attribute || Field */
	public int _id;
	public String _name;
	public String _description;
	public double _price;
	private int _stockAmount;
	private String _code;
	
	/* getter */
	public String getCode() {
		return _name.charAt(0) + "" + _id;
	}
	
	public int getStockAmount() {
		return _stockAmount;
	}
	
	/* setter */
	public void setStockAmount(int stockAmount) {
		/* this : bu class, içerisinde bulunduðum class anlamýna gelmektedir.
		 * this._code = code; 
		 */
		_stockAmount = stockAmount;
	}
}
