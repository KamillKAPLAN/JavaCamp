package Inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1)
			System.out.println("Veritabanýna loglandý.");
		else if(logType == 2) 
			System.out.println("Dosyaya loglandý.");
		else if(logType == 3)
			System.out.println("Email gönderildi.");
		else 
			System.out.println("LogType tanýmsýz, loglama yapýlamadý");
	}
}
/*
 * 1 - Database
 * 2 - File
 * 3 - Email
 */