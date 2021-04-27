
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * intellisense : programcýya kodu yazarken yardýmcýlýk saðlar. 
		 * 
		 * 06.Java Dersi 5_Hello World Uygulamasý ile Baþlayalým
		 */
		System.out.println("Hello Word!");
		
		/*
		 * case sensitive : büyük küçük harf duyarlý
		 * deðiþken tanýmlarken camelCasing ile isimlendirme yapýlýr. 
		 * reusability    : tekrar kullanýlabilirlik
		 * code refactor  : kodlarý temizleme, kirli kod olayýný ortadan kaldýrma
		 * deðiþkenler    : çalýþtýðýmýz blokta tekrar tekrar kullanabilmek için ve 
		 * 					bellekten tasarruf yapmak için kullanýyoruz.
		 * 
		 * 07.Java Dersi 6_Deðiþkenler ve Deðiþken Kullaným Ýhtiyacý
		 */
		int studentCount = 10;
		String message = "Öðrenci Sayým : ";
		System.out.println(message + studentCount);
		
		/*
		 * Java tip güvenli bir dildir.
		 * Ýlkel Tipler : bir dilin en temel veri tipleridir. Bunlar `Deðer Tipleri` 'dir.
		 * 
		 * 08.Java Dersi 7_Temel Veri Tipleriyle Çalýþmak
		 */
		byte  dataTypeByte  = 127;    /* 1 byte -128 127 */
		short dataTypeShort = 123;    /* 2 bytes */ 
		int   dataTypeInt   = 123;    /* 4 bytes */
		long  dataTypeLong  = 922;    /* 8 bytes */
		float dataTypeFloat = 134;    /* 4 bytes */
		double dataTypeDouble = 14.4; /* 8 bytes */
		
		char    dataTypeChar = 'A';     /* 2 bytes */
 		boolean dataTypeBool = false;   /* 1 bytes */
 		
 		/*
 		 * Programlar insanlarýn gündelik hayattaki aktivitilerini kodsal bilgisayar destekli sistemlerle
 		 * daha kolay hale getiren versiyonudur. 
 		 * if - else programing - savunmacý programlama
 		 * Þart blogu oluþturmak için 2 yöntem kullanýlýr. Bunlardan ilki `if` ikincisi `switch` ama if standart
 		 * 
 		 * 09.Java Dersi 8_If Bloklarýyla Çalýþmak
 		 */
 		int number = 20;
 		if(number < 20) {
 			System.out.print("Sayý 20'den küçüktür.");
 		} else if (number == 20) {
 			System.out.print("Sayý 20'e eþittir.");
 		} else {
 			System.out.print("Sayý 20'den büyüktür.");
 		}
 		
 		/*
 		 * 10.Java Dersi 9_ReCap Demo 1 En Büyük Sayý Hangisi
 		 */
 		int number1 = 30, number2 = 25, number3 = 27;
 		if(number1 > number2 && number1 > number3) {
 			System.out.println("EnBüyük : " + number1);
 		} else if (number2 > number1 && number2 > number3) {
 			System.out.println("EnBüyük : " + number2);
 		} else {
 			System.out.println("EnBüyük : " + number3);
 		}
 		
 		int maxNumber = number1;
 		if(maxNumber < number2) {
 			maxNumber = number2;
 		} else if(maxNumber < number3) {
 			maxNumber = number3;
 		} 
 		System.out.println("EnBüyük : " + maxNumber);
 		
 		/*
		 * 11.Java Dersi 10_Switch Bloklarýyla Çalýþmak
		 */
		char grade = 'H';
		switch (grade) {
		case 'A':
			System.out.print("Mükemmel : Geçtiniz.");
			break;
		case 'B':
		case 'b':
			System.out.print("Çok Güzel : Geçtiniz.");
			break;
		case 'C':
			System.out.print("Ýyi : Geçtiniz.");
			break;
		case 'D':
			System.out.print("Fena Deðil : Geçtiniz.");
			break;
		case 'F':
			System.out.print("Malesef : Kaldýnýz.");
			break;
		default:
			System.out.print("Geçersiz Not Girdiniz...");
		}

		/*
		 * 12.Java Dersi 11_For Döngüsüyle Çalýþmak
		 */
		System.out.print("\nFor Döngüsü : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTek Sayýlar : ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}

		System.out.print("\nÇift Sayýlar : ");
		for (int i = 2; i < 10; i += 2) {
			System.out.print(i + " ");
		}

		/*
		 * 13.Java Dersi 12_While Döngüsüyle Çalýþmak
		 */
		System.out.print("\nWhile Döngüsü : ");
		int ii = 0;
		while(ii < 10) {
			System.out.print(ii + " ");
			ii++;
		}
		
		/*
		 * `do-wile` döngüsü þart saðlanmasa bile en az bir kere çalýþýr. 
		 *  
		 * 14.Java Dersi 13_Do-While Döngüsüyle Çalýþmak
		 */
		System.out.print("\nDo-While Döngüsü : ");
		do {
			System.out.print(ii + " ");
			ii--;
		} while(ii > 0);
		
		/*
		 * genellikle ayný tipdeki verilerin bir arada bulunduðu liste 
		 * 
		 * 15.Java Dersi 14_Dizilerle Çalýþmaya Baþlamak
		 */
		System.out.print("\nDiziler - For : ");
		String[] students = new String[4];
		students[0] = "Kamil";
		students[1] = "Melih";
		students[2] = "Artun";
		students[3] = "Ahmet";
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i] + " - ");
		}
		
		System.out.print("\nDiziler - Foreach : ");
		for(String student : students) {
			System.out.print(student + " - ");
		}
		
		/*
		 * 16.Java Dersi 15_ReCap Demo 2 - Dizilerle Çalýþmak
		 */
		System.out.print("\nReCap Demo 2 : ");
		double[] myList = {1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double dblMax = myList[0];
		for(double dblnumber : myList) {
			if(dblMax < dblnumber) {
				dblMax = dblnumber;
			}
			total = total + dblnumber;
			System.out.print(dblnumber + " ");
		}
		System.out.print("\n-Toplam : " + total);
		System.out.print("\n-En Büyük : " + dblMax);
		
		/*
		 * 17.Java Dersi 16_Çok Boyutlu Dizilerle Çalýþmak
		 */
		System.out.print("\nÇok Boyutlu Diziler : ");
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";
		for(int i = 0; i <=2 ; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.print(sehirler[i][j] + " ");
			}
			System.out.print(" - ");
		}
		
		/*
		 * 18.Java Dersi 17_Stringlerle Çalýþmak 1
		 */
		System.out.println("\n-Stringlerle Çalýþmak 1");
		String message1 = "Bugün hava çok güzel.";
		System.out.println(message1);
		System.out.println("Eleman Sayýsý : " + message1.length());
		System.out.println("5.Eleman : " + message1.charAt(4));
		System.out.println(message1.concat(" Yaþasýn!")); /* iki string'i birleþtirme */
		System.out.println(message1.startsWith("A")); /* string'in baþlangýç deðeri */
		System.out.println(message1.endsWith(".")); /* string'in bitiþ deðeri */
		char[] karakterler = new char[5];
		message1.getChars(0, 5, karakterler, 0); /* string'in karakterlerini almak */
		System.out.println(karakterler);
		System.out.println(message1.indexOf('a')); /* yazýlan karakterin string içindeki baþtan index'ini verir. */
		System.out.println(message1.lastIndexOf('e')); /* yazýlan karakterin string içindeki sondan index'ini verir. */
		
		/*
		 * 19.Java Dersi 18_Stringlerle Çalýþmak 2
		 */
		String newMessage1 = message1.replace(' ', '-');
		System.out.println(newMessage1); /* ilgili metindeki deðeri deðiþtirmek */
		System.out.println(message1.substring(6)); /* metin içerisinde parça almak */
		System.out.println(message1.substring(6, 10));
		for(String kelime : message1.split(" ")) /* metinin karakter veya karakter dizisini dikkate alarak parçalamak */
			System.out.println(kelime); 
		System.out.println(message1.toLowerCase()); /* metini küçük harfe çevirmek */
		System.out.println(message1.toUpperCase()); /* metini büyük harfe çevirmek */
		message1 = "   Bugün hava çok güzel.   ";
		System.out.println(message1.length() + " - " + message1.trim() + " - " + message1.trim().length()); /* metin içindeki baþýndaki ve sonundaki boþluklarý silmek */
		
		/*
		 * bug : uygulamadaki mantýksal veya sistemsel hatalar.
		 * 20.Java Dersi 19_Mini Proje 1 - Sayý Asal mý_
		 */
		number = 25;
		boolean isPrime = true;
		
		if(number == 1) {			
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if(number < 1) {			
			System.out.println("Geçersiz sayý");
			return;
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) 
			System.out.println("Sayý asaldýr.");
		else 
			System.out.println("Sayý asal deðildir.");
		
		/*
		 * 21.Java Dersi 20_Mini Proje 2 - Kalýn Sesli ve Ýnce Sesli Harfler
		 */
		char harf = 'A';
		harf = Character.toLowerCase(harf);
		if(harf == 'a' || harf == 'ý' || harf == 'o' || harf == 'u') 
			System.out.println("Kalýn sesli harf");
		else if(harf == 'e' || harf == 'i' || harf == 'ö' || harf == 'ü') 
			System.out.println("Ýnce sesli harf");
		else 
			System.out.println("Sessiz harf");
		
		switch (harf) {
		case 'a': 
		case 'ý': 
		case 'o': 
		case 'u': 
			System.out.println("Kalýn sesli harf");
			break;
		case 'e': 
		case 'i': 
		case 'ö': 
		case 'ü': 
			System.out.println("Ýnce sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");
		}
		
		/*
		 * 6  --> 1, 2, 3
		 * 28 --> 1, 2, 4, 7, 14
		 * 22.Java Dersi 21_Mini Proje 3 - Mükemmel Sayýlar
		 */
		number = 28;
		total = 0;
		for(int i = 1; i < number; i++)
			if(number % i == 0)
				total = total + i;
		
		if(total == number)
			System.out.println("Mükemmel sayýdýr.");
		else 
			System.out.println("Mükemmel sayý deðildir.");
		
		/*
		 * 23.Java Dersi 22_Mini Proje 4 - Arkadaþ Sayýlar
		 */
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for(int i = 1; i < sayi1; i++)
			if(sayi1 % i == 0)
				toplam1 += i;
		
		for(int i = 1; i < sayi2; i++)
			if(sayi2 % i == 0)
				toplam2 += i;
		
		if(toplam1 == sayi2 && toplam2 == sayi1)
			System.out.println("bu iki sayý arkadaþ sayýdýr.");
		else 
			System.out.println("bu iki sayý arkadaþ sayý deðildir.");
		
		/*
		 * 24.Java Dersi 23_Mini Proje 5 - Sayý Bulma
		 */
		int[] array = {1, 2, 5, 7, 9, 0};
		int searchNumber = 6;
		boolean isThere = false;
		for(int value : array)
			if(value == searchNumber) {
				isThere = true;
				break;
			}	
		if(isThere)
			System.out.println("Aradýðýnýz sayý var.");
		else {				
			System.out.println("Aradýðýnýz sayý yok.");
		}
		
	}
}