package Inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1)
			System.out.println("Veritaban�na logland�.");
		else if(logType == 2) 
			System.out.println("Dosyaya logland�.");
		else if(logType == 3)
			System.out.println("Email g�nderildi.");
		else 
			System.out.println("LogType tan�ms�z, loglama yap�lamad�");
	}
}
/*
 * 1 - Database
 * 2 - File
 * 3 - Email
 */