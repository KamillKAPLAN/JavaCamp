package Odev1.Polimorfizm;

public class CustomerManager {
	
	private BaseLogger _baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this._baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("M��teri eklendi.");
		this._baseLogger.log("log mesaj�");
	}
}
