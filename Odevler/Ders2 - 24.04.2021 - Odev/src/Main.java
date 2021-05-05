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
		 * Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz.
		 * Bunlara ait class, contructor yapýlarýný oluþturup diziye ekleyip listeleyiniz.
		 * Ýþ sýnýfý olarak tanýmladýðýmýzý düþündüðünüz bir class oluþturunuz. En az iki metot yazýnýz.
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
		
		TopMenu menu1 = new TopMenu(1, "Tüm Kurslar");
		TopMenu menu2 = new TopMenu();
		menu2.id = 2;
		menu2.name = "Kampa Hazýrlýk";
		TopMenu menu3 = new TopMenu(3, "Sýk Sorulan Sorular");
		
		TopMenuManager menuManager = new TopMenuManager();
		menuManager.redirect(menu3);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.deleteToCourse(course1);
		
		/*
		 * Don't Repeat Yourself (DRY) Prensibi : kendini tekrar etme prensibi
		 * fonksiyonel programlama : bir fonksiyonun metodun içerisinde bir sürü iþi yapmak 
		   o anki operasyonu kurtarýr. Ayný kodu tekrar tekrar yazmamak için bir iþi yapacak 
		   þekilde kodlarýmýzý yazmalýyýz.
		 * metot yazarak kendimizi tekrarlamayý engellemiþ oluyoruz.
		 * `metot isimleri` : **camelCasing** - `class isimleri` : `pascalCasing`
		 * **Camel Case** : userLoginCount
		 * **Pascal Case ** : UserLoginCount 
		 * **Snake Case** : user_login_count || USER_LOGIN_COUNT 
		 * **Kebab Case** : user-login-count
		 * 
		 * 25.Java Dersi 24_Metodlarý Anlamak
		 */
		System.out.println("--- 24_Metodlar ---");
		
		searchNumber();
		
		/*
		 * 26.Java Dersi 25_Parametreli Metodlarý Anlamak
		 */
		System.out.println("--- 25_Parametreli Metodlar ---");
		
		String newMessage = giveCity();
		System.out.println("Yeni Mesaj : " + newMessage);
		
		int total = total(5, 4);
		System.out.println("Toplam : " + total);
		
		/*
		 * 27.Java Dersi 26_Variable Arguments ile Çalýþmak
		 */
		System.out.println("--- 26_Variable Arguments ---");
		
		total = total2(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("One more value : " + total);
		int[] totall = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array values   : " + total2(totall));
		
		/*
		 * class'larý, nesnel alt yapýlarý öðrenirsek `sürdürülebilir` yazýlým 
		    gerçekleþtirmeyi öðrenmiþ oluruz.
		 * `Sürdürülebilir yazýlým` : uygulamamýza sürekli yeni istekler ve ihtiyaçlar 
		    gelecektir. Bu isteklere ve ihtiyaçlara direnmeyen yazýlým yapmamýza denir.
		 * Java'da herþey iþ yapan bir class'ýn içerisinde oluþuyor. **Class'larýn en önemli 
		    özelliði gruplama yapmaktýr.**
		 * 
		 * 28.Java Dersi 27_Class Nedir_ - Doðru Anlamak
		 */
		System.out.println("--- 27_Class Nedir ---");
		/* CourseManager class'ý oluþturuldu. */
		
		/*
		 * **Class'lar** `referans tipdir`.
		 * 
		 * 29.Java Dersi 28_Bir Class Nasýl Çalýþýr _
		 */
		System.out.println("--- 28_Bir Class Nasýl Çalýþýr ---");
		
		CustomerManager cm = new CustomerManager();
		CustomerManager cm2 = new CustomerManager();
		cm = cm2; /* cm'nin referans numarasý eþittir, cm2'nin referans numarasýdýr. */
		cm.add();
		cm.remove();
		cm.update();
		
		/*
		 * int, double, float, byte : **`Deðer Tipler` - `Value Types`**
		 * diziler : **`Referans Tipler` - `References Types`**
		 * 
		 * 30.Java Dersi 29_Çok Önemli - Deðer ve Referans Tipleri Anlamak
		 */
		System.out.println("--- 29_Deðer ve Referans Tipleri ---");
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println("Sayý1 : " + sayi1 + " Sayý2 : " + sayi2);
		
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println("Numbers1 : " + numbers1[0] + " Numbers2 : " + numbers2[0]);
		
		/*
		 * Class'lar
		    - ortak operasyonlarý tutar.
		    - referans tiptir. 
		 *   
		 * 31.Java Dersi 30_ReCap Demo Classlarla Çalýþmak
		 */
		System.out.println("--- 30_ReCap Demo Classlar ---");
		
		DortIslem dortIslem = new DortIslem();
		int result = dortIslem.bol(3, 0);
		System.out.println("Sonuç : " + result);
		
		/* 
		 * `Class` 'larýn bir diðer özelliði ise özellik tutmasýdýr. Bir class ayný zamanda
		    field, attribute barýndýrýr. C# 'da karþýlýðý `property` olarak adlandýrýlýr.
		 * **Class'lar** ilgili operasyonlarý, ilgili özellikleri tutarlar.
		 * SOLID (Singleton Pattern) : tek sorumluluk prensibi, 
		    - bir class sadece bir iþi yapar.
		    - bir metot sadece bir iþi yapar.
		    - bir if blogu sadece bir iþi yapar.
		 * 
		 * 32.Java Dersi 31_Field ve Attribute ile Çalýþmak
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
		     - capsulleme dediðimiz bir yöntemdir, 
		     - herhangi bir alaný kullanmak için kýsýtlamayý ön görür. 
		     - getter - setter
		 * 
		 * 33.Java Dersi 32_Encapsulation Ýhtiyacýný Anlamak
		 */
		System.out.println("--- 32_Encapsulation Ýhtiyac ---");
		/* Video izlendi. */

		/*
		 * getter : okumak, almak, bir deðeri okumaya yönelik iþlemdir. : readonly
		 * setter : kurmak, vermek, bir deðeri vermek                   : writeonly
		 * 
		 * 34.Java Dersi 33_Getter ve Setter ile Çalýþmak
		 */
		System.out.println("--- 33_Getter ve Setter ---");
		
		Product product2 = new Product();
		product2._id = 2;
		product2._name = "Akg Kulak Içi Kulaklýk";
		product2._description = "Kablolu Kulaklýk";
		product2._price = 60;
		/* product2._stockAmount = 10; */
		product.setStockAmount(10);
		System.out.println("Product2 Code : " + product2.getCode());
		
		/*
		 * Class'larýn default bir Constructor'ý mevcuttur. 
		 * 
		 * 35.Java Dersi 34_Constructor ile Çalýþmak
		 */
		System.out.println("--- 34_Constructor ---");
		
		Product product3 = new Product(3, "Masa", "Çalýþma Masasý", 210, 5);
		System.out.println(product3.getCode());		
		
		/*
		 * 36.Java Dersi 35_Method Overloading ile Çalýþmak
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
			giveMessage("Aradýðýnýz sayý var.", searchNumber);
		else 
			giveMessage("Aradýðýnýz sayý yok.", searchNumber);
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
