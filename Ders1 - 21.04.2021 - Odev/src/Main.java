
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * intellisense : programc�ya kodu yazarken yard�mc�l�k sa�lar. 
		 * 
		 * 06.Java Dersi 5_Hello World Uygulamas� ile Ba�layal�m
		 */
		System.out.println("Hello Word!");
		
		/*
		 * case sensitive : b�y�k k���k harf duyarl�
		 * de�i�ken tan�mlarken camelCasing ile isimlendirme yap�l�r. 
		 * reusability    : tekrar kullan�labilirlik
		 * code refactor  : kodlar� temizleme, kirli kod olay�n� ortadan kald�rma
		 * de�i�kenler    : �al��t���m�z blokta tekrar tekrar kullanabilmek i�in ve 
		 * 					bellekten tasarruf yapmak i�in kullan�yoruz.
		 * 
		 * 07.Java Dersi 6_De�i�kenler ve De�i�ken Kullan�m �htiyac�
		 */
		int studentCount = 10;
		String message = "��renci Say�m : ";
		System.out.println(message + studentCount);
		
		/*
		 * Java tip g�venli bir dildir.
		 * �lkel Tipler : bir dilin en temel veri tipleridir. Bunlar `De�er Tipleri` 'dir.
		 * 
		 * 08.Java Dersi 7_Temel Veri Tipleriyle �al��mak
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
 		 * Programlar insanlar�n g�ndelik hayattaki aktivitilerini kodsal bilgisayar destekli sistemlerle
 		 * daha kolay hale getiren versiyonudur. 
 		 * if - else programing - savunmac� programlama
 		 * �art blogu olu�turmak i�in 2 y�ntem kullan�l�r. Bunlardan ilki `if` ikincisi `switch` ama if standart
 		 * 
 		 * 09.Java Dersi 8_If Bloklar�yla �al��mak
 		 */
 		int number = 20;
 		if(number < 20) {
 			System.out.print("Say� 20'den k���kt�r.");
 		} else if (number == 20) {
 			System.out.print("Say� 20'e e�ittir.");
 		} else {
 			System.out.print("Say� 20'den b�y�kt�r.");
 		}
 		
 		/*
 		 * 10.Java Dersi 9_ReCap Demo 1 En B�y�k Say� Hangisi
 		 */
 		int number1 = 30, number2 = 25, number3 = 27;
 		if(number1 > number2 && number1 > number3) {
 			System.out.println("EnB�y�k : " + number1);
 		} else if (number2 > number1 && number2 > number3) {
 			System.out.println("EnB�y�k : " + number2);
 		} else {
 			System.out.println("EnB�y�k : " + number3);
 		}
 		
 		int maxNumber = number1;
 		if(maxNumber < number2) {
 			maxNumber = number2;
 		} else if(maxNumber < number3) {
 			maxNumber = number3;
 		} 
 		System.out.println("EnB�y�k : " + maxNumber);
 		
 		/*
		 * 11.Java Dersi 10_Switch Bloklar�yla �al��mak
		 */
		char grade = 'H';
		switch (grade) {
		case 'A':
			System.out.print("M�kemmel : Ge�tiniz.");
			break;
		case 'B':
		case 'b':
			System.out.print("�ok G�zel : Ge�tiniz.");
			break;
		case 'C':
			System.out.print("�yi : Ge�tiniz.");
			break;
		case 'D':
			System.out.print("Fena De�il : Ge�tiniz.");
			break;
		case 'F':
			System.out.print("Malesef : Kald�n�z.");
			break;
		default:
			System.out.print("Ge�ersiz Not Girdiniz...");
		}

		/*
		 * 12.Java Dersi 11_For D�ng�s�yle �al��mak
		 */
		System.out.print("\nFor D�ng�s� : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTek Say�lar : ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}

		System.out.print("\n�ift Say�lar : ");
		for (int i = 2; i < 10; i += 2) {
			System.out.print(i + " ");
		}

		/*
		 * 13.Java Dersi 12_While D�ng�s�yle �al��mak
		 */
		System.out.print("\nWhile D�ng�s� : ");
		int ii = 0;
		while(ii < 10) {
			System.out.print(ii + " ");
			ii++;
		}
		
		/*
		 * `do-wile` d�ng�s� �art sa�lanmasa bile en az bir kere �al���r. 
		 *  
		 * 14.Java Dersi 13_Do-While D�ng�s�yle �al��mak
		 */
		System.out.print("\nDo-While D�ng�s� : ");
		do {
			System.out.print(ii + " ");
			ii--;
		} while(ii > 0);
		
		/*
		 * genellikle ayn� tipdeki verilerin bir arada bulundu�u liste 
		 * 
		 * 15.Java Dersi 14_Dizilerle �al��maya Ba�lamak
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
		 * 16.Java Dersi 15_ReCap Demo 2 - Dizilerle �al��mak
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
		System.out.print("\n-En B�y�k : " + dblMax);
		
		/*
		 * 17.Java Dersi 16_�ok Boyutlu Dizilerle �al��mak
		 */
		System.out.print("\n�ok Boyutlu Diziler : ");
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";
		for(int i = 0; i <=2 ; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.print(sehirler[i][j] + " ");
			}
			System.out.print(" - ");
		}
		
		/*
		 * 18.Java Dersi 17_Stringlerle �al��mak 1
		 */
		System.out.println("\n-Stringlerle �al��mak 1");
		String message1 = "Bug�n hava �ok g�zel.";
		System.out.println(message1);
		System.out.println("Eleman Say�s� : " + message1.length());
		System.out.println("5.Eleman : " + message1.charAt(4));
		System.out.println(message1.concat(" Ya�as�n!")); /* iki string'i birle�tirme */
		System.out.println(message1.startsWith("A")); /* string'in ba�lang�� de�eri */
		System.out.println(message1.endsWith(".")); /* string'in biti� de�eri */
		char[] karakterler = new char[5];
		message1.getChars(0, 5, karakterler, 0); /* string'in karakterlerini almak */
		System.out.println(karakterler);
		System.out.println(message1.indexOf('a')); /* yaz�lan karakterin string i�indeki ba�tan index'ini verir. */
		System.out.println(message1.lastIndexOf('e')); /* yaz�lan karakterin string i�indeki sondan index'ini verir. */
		
		/*
		 * 19.Java Dersi 18_Stringlerle �al��mak 2
		 */
		String newMessage1 = message1.replace(' ', '-');
		System.out.println(newMessage1); /* ilgili metindeki de�eri de�i�tirmek */
		System.out.println(message1.substring(6)); /* metin i�erisinde par�a almak */
		System.out.println(message1.substring(6, 10));
		for(String kelime : message1.split(" ")) /* metinin karakter veya karakter dizisini dikkate alarak par�alamak */
			System.out.println(kelime); 
		System.out.println(message1.toLowerCase()); /* metini k���k harfe �evirmek */
		System.out.println(message1.toUpperCase()); /* metini b�y�k harfe �evirmek */
		message1 = "   Bug�n hava �ok g�zel.   ";
		System.out.println(message1.length() + " - " + message1.trim() + " - " + message1.trim().length()); /* metin i�indeki ba��ndaki ve sonundaki bo�luklar� silmek */
		
		/*
		 * bug : uygulamadaki mant�ksal veya sistemsel hatalar.
		 * 20.Java Dersi 19_Mini Proje 1 - Say� Asal m�_
		 */
		number = 25;
		boolean isPrime = true;
		
		if(number == 1) {			
			System.out.println("Say� asal de�ildir.");
			return;
		}
		
		if(number < 1) {			
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) 
			System.out.println("Say� asald�r.");
		else 
			System.out.println("Say� asal de�ildir.");
		
		/*
		 * 21.Java Dersi 20_Mini Proje 2 - Kal�n Sesli ve �nce Sesli Harfler
		 */
		char harf = 'A';
		harf = Character.toLowerCase(harf);
		if(harf == 'a' || harf == '�' || harf == 'o' || harf == 'u') 
			System.out.println("Kal�n sesli harf");
		else if(harf == 'e' || harf == 'i' || harf == '�' || harf == '�') 
			System.out.println("�nce sesli harf");
		else 
			System.out.println("Sessiz harf");
		
		switch (harf) {
		case 'a': 
		case '�': 
		case 'o': 
		case 'u': 
			System.out.println("Kal�n sesli harf");
			break;
		case 'e': 
		case 'i': 
		case '�': 
		case '�': 
			System.out.println("�nce sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");
		}
		
		/*
		 * 6  --> 1, 2, 3
		 * 28 --> 1, 2, 4, 7, 14
		 * 22.Java Dersi 21_Mini Proje 3 - M�kemmel Say�lar
		 */
		number = 28;
		total = 0;
		for(int i = 1; i < number; i++)
			if(number % i == 0)
				total = total + i;
		
		if(total == number)
			System.out.println("M�kemmel say�d�r.");
		else 
			System.out.println("M�kemmel say� de�ildir.");
		
		/*
		 * 23.Java Dersi 22_Mini Proje 4 - Arkada� Say�lar
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
			System.out.println("bu iki say� arkada� say�d�r.");
		else 
			System.out.println("bu iki say� arkada� say� de�ildir.");
		
		/*
		 * 24.Java Dersi 23_Mini Proje 5 - Say� Bulma
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
			System.out.println("Arad���n�z say� var.");
		else {				
			System.out.println("Arad���n�z say� yok.");
		}
		
	}
}