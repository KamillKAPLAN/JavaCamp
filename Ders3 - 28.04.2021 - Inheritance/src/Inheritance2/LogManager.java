package Inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1)
			System.out.println("Veritabanına loglandı.");
		else if(logType == 2) 
			System.out.println("Dosyaya loglandı.");
		else if(logType == 3)
			System.out.println("Email gönderildi.");
		else 
			System.out.println("LogType tanımsız, loglama yapılamadı");
	}
}
/*
 * 1 - Database
 * 2 - File
 * 3 - Email
 */