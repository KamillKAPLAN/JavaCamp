import java.awt.Menu;

import Odev1.Course;
import Odev1.TopMenu;
import Odev1.CourseManager;
import Odev1.TopMenuManager;
import Odev2.CustomerManager;
import Odev2.DortIslem;
import Odev2.Product;
import Odev2.ProductManager;
/* pastalCasing */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kodlama.io sitesine gidiniz.
		 * �zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.
		 * Bunlara ait class, contructor yap�lar�n� olu�turup diziye ekleyip listeleyiniz.
		 * �� s�n�f� olarak tan�mlad���m�z� d���nd���n�z bir class olu�turunuz. En az iki metot yaz�n�z.
		 */
		Course course1 = new Course(1, "C# & Angular", "Engin Demirog", false);
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Java & React";
		course2.instructorName = "Engin Demirog";
		course2.status = true;
		
		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.name + " - " + course.instructorName + " - " + course.status);
		}
		
		TopMenu menu1 = new TopMenu(1, "T�m Kurslar");
		TopMenu menu2 = new TopMenu();
		menu2.id = 2;
		menu2.name = "Kampa Haz�rl�k";
		TopMenu menu3 = new TopMenu(3, "S�k Sorulan Sorular");
		
		TopMenuManager menuManager = new TopMenuManager();
		menuManager.redirect(menu3);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.deleteToCourse(course1);
		
		/*
		 * Don't Repeat Yourself (DRY) Prensibi : kendini tekrar etme prensibi
		 * fonksiyonel programlama : bir fonksiyonun metodun i�erisinde bir s�r� i�i yapmak 
		   o anki operasyonu kurtar�r. Ayn� kodu tekrar tekrar yazmamak i�in bir i�i yapacak 
		   �ekilde kodlar�m�z� yazmal�y�z.
		 * metot yazarak kendimizi tekrarlamay� engellemi� oluyoruz.
		 * `metot isimleri` : **camelCasing** - `class isimleri` : `pascalCasing`
		 * **Camel Case** : userLoginCount
		 * **Pascal Case ** : UserLoginCount 
		 * **Snake Case** : user_login_count || USER_LOGIN_COUNT 
		 * **Kebab Case** : user-login-count
		 * 
		 * 25.Java Dersi 24_Metodlar� Anlamak
		 */
		System.out.println("--- 24_Metodlar ---");
		
		searchNumber();
		
		/*
		 * 26.Java Dersi 25_Parametreli Metodlar� Anlamak
		 */
		System.out.println("--- 25_Parametreli Metodlar ---");
		
		String newMessage = giveCity();
		System.out.println("Yeni Mesaj : " + newMessage);
		
		int total = total(5, 4);
		System.out.println("Toplam : " + total);
		
		/*
		 * 27.Java Dersi 26_Variable Arguments ile �al��mak
		 */
		System.out.println("--- 26_Variable Arguments ---");
		
		total = total2(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("One more value : " + total);
		int[] totall = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array values   : " + total2(totall));
		
		/*
		 * class'lar�, nesnel alt yap�lar� ��renirsek `s�rd�r�lebilir` yaz�l�m 
		    ger�ekle�tirmeyi ��renmi� oluruz.
		 * `S�rd�r�lebilir yaz�l�m` : uygulamam�za s�rekli yeni istekler ve ihtiya�lar 
		    gelecektir. Bu isteklere ve ihtiya�lara direnmeyen yaz�l�m yapmam�za denir.
		 * Java'da her�ey i� yapan bir class'�n i�erisinde olu�uyor. **Class'lar�n en �nemli 
		    �zelli�i gruplama yapmakt�r.**
		 * 
		 * 28.Java Dersi 27_Class Nedir_ - Do�ru Anlamak
		 */
		System.out.println("--- 27_Class Nedir ---");
		/* CourseManager class'� olu�turuldu. */
		
		/*
		 * **Class'lar** `referans tipdir`.
		 * 
		 * 29.Java Dersi 28_Bir Class Nas�l �al���r _
		 */
		System.out.println("--- 28_Bir Class Nas�l �al���r ---");
		
		CustomerManager cm = new CustomerManager();
		CustomerManager cm2 = new CustomerManager();
		cm = cm2; /* cm'nin referans numaras� e�ittir, cm2'nin referans numaras�d�r. */
		cm.add();
		cm.remove();
		cm.update();
		
		/*
		 * int, double, float, byte : **`De�er Tipler` - `Value Types`**
		 * diziler : **`Referans Tipler` - `References Types`**
		 * 
		 * 30.Java Dersi 29_�ok �nemli - De�er ve Referans Tipleri Anlamak
		 */
		System.out.println("--- 29_De�er ve Referans Tipleri ---");
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println("Say�1 : " + sayi1 + " Say�2 : " + sayi2);
		
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println("Numbers1 : " + numbers1[0] + " Numbers2 : " + numbers2[0]);
		
		/*
		 * Class'lar
		    - ortak operasyonlar� tutar.
		    - referans tiptir. 
		 *   
		 * 31.Java Dersi 30_ReCap Demo Classlarla �al��mak
		 */
		System.out.println("--- 30_ReCap Demo Classlar ---");
		
		DortIslem dortIslem = new DortIslem();
		int result = dortIslem.bol(3, 0);
		System.out.println("Sonu� : " + result);
		
		/* 
		 * `Class` 'lar�n bir di�er �zelli�i ise �zellik tutmas�d�r. Bir class ayn� zamanda
		    field, attribute bar�nd�r�r. C# 'da kar��l��� `property` olarak adland�r�l�r.
		 * **Class'lar** ilgili operasyonlar�, ilgili �zellikleri tutarlar.
		 * SOLID (Singleton Pattern) : tek sorumluluk prensibi, 
		    - bir class sadece bir i�i yapar.
		    - bir metot sadece bir i�i yapar.
		    - bir if blogu sadece bir i�i yapar.
		 * 
		 * 32.Java Dersi 31_Field ve Attribute ile �al��mak
		 */
		System.out.println("--- 31_Field ve Attribute ---");
		
		Product product = new Product();
		product._id = 1;
		product._name = "Laptop";
		product._description = "Lenova Z50";
		product._price = 5000;
		/* product._stockAmount = 3; */
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		/*
		 * `Encapsulation` : 
		     - capsulleme dedi�imiz bir y�ntemdir, 
		     - herhangi bir alan� kullanmak i�in k�s�tlamay� �n g�r�r. 
		     - getter - setter
		 * 
		 * 33.Java Dersi 32_Encapsulation �htiyac�n� Anlamak
		 */
		System.out.println("--- 32_Encapsulation �htiyac ---");
		/* Video izlendi. */

		/*
		 * getter : okumak, almak, bir de�eri okumaya y�nelik i�lemdir. : readonly
		 * setter : kurmak, vermek, bir de�eri vermek                   : writeonly
		 * 
		 * 34.Java Dersi 33_Getter ve Setter ile �al��mak
		 */
		System.out.println("--- 33_Getter ve Setter ---");
		
		Product product2 = new Product();
		product2._id = 2;
		product2._name = "Akg Kulak I�i Kulakl�k";
		product2._description = "Kablolu Kulakl�k";
		product2._price = 60;
		/* product2._stockAmount = 10; */
		product.setStockAmount(10);
		System.out.println("Product2 Code : " + product2.getCode());
		
		/*
		 * Class'lar�n default bir Constructor'� mevcuttur. 
		 * 
		 * 35.Java Dersi 34_Constructor ile �al��mak
		 */
		System.out.println("--- 34_Constructor ---");
		
		Product product3 = new Product(3, "Masa", "�al��ma Masas�", 210, 5);
		System.out.println(product3.getCode());		
		
		/*
		 * 36.Java Dersi 35_Method Overloading ile �al��mak
		 */
		System.out.println("--- 35_Method Overloading ---");	
		
		DortIslem dortIslem2 = new DortIslem();
		System.out.println(dortIslem2.topla(2, 3));
		System.out.println(dortIslem2.topla(2, 3, 5));
	}
	
	/* camelCasing */
	public static void searchNumber() {
		int[] array = {1, 2, 5, 7, 9, 0};
		int searchNumber = 6;
		boolean isThere = false;
		for(int value : array)
			if(value == searchNumber) {
				isThere = true;
				break;
			}	
		if(isThere)
			giveMessage("Arad���n�z say� var.", searchNumber);
		else 
			giveMessage("Arad���n�z say� yok.", searchNumber);
	}
	
	public static void giveMessage(String message, int numberSearch) {
		System.out.println(message + " : " + numberSearch);
	}
	
	public static String giveCity() {
		return "Malatya";
	}
	
	public static int total(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int total2(int... nmbers) {
		int total = 0;
		for (int number : nmbers)
			total += number;
		return total;
	}
}
