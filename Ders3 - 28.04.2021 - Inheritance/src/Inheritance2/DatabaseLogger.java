package Inheritance2;

public class DatabaseLogger extends Logger {
	@Override
	public void log() {
		System.out.println("Veritabanına loglandı.");
	}
}
