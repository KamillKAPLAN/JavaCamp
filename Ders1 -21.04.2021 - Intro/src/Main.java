
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * de�i�ken isimlendirmelerde camelCase kullan�l�r.
	     * 
	     * Don't repeat yourself : kendini tekrar etme, yaz�l�m geli�tirmenin ana
	     * prensiplerinden bir tanesi
	     * 
	     * byte : 0 - 254
	     * 
	     * byte > int > long : veri tipi s�ralama
	     * 
	     * biz programlar�m�zda belli bir durumun ger�ekle�ip ger�ekle�medi�ine g�re
	     * `�artl� �fadeler` den yararlan�yoruz. Bu �artl� ifadeleri tuttu�umuz veri
	     * tipinin ad� `boolean` de�eri ya true yada false
	     * 
	     * liste tabanl� verileri tutmak i�in kar��m�za `Array(Dizi)` ler ��kar yani
	     * Veri Seti, Veri Dizisi...
	     */

	    String internetSubeBtn = "�nternet �ubesi";
	    double dolarDun = 8.15;
	    double dolarBugun = 8.15;
	    int vade = 36;
	    boolean dustuMu = false;

	    System.out.println("Hello world! " + internetSubeBtn + " " + dolarDun + " " + vade + " " + dustuMu);

	    if (dolarBugun < dolarDun)
	      System.out.println("Dolar d��t�");
	    else if (dolarBugun == dolarDun)
	      System.out.println("Dolar de�i�medi");
	    else
	      System.out.println("Dolar y�kseldi.");

	    String kredi1 = "H�zl� Kredi";
	    String kredi2 = "Mutlu Emekli Kredisi";
	    String kredi3 = "Konut Kredi";
	    String kredi4 = "�ift�i Kredisi";
	    String kredi5 = "Mbs Kredisi";
	    String kredi6 = "Med Kredisi";

	    System.out.println(kredi1);
	    System.out.println(kredi2);
	    System.out.println(kredi3);
	    System.out.println(kredi4);
	    System.out.println(kredi5);
	    System.out.println(kredi6);

	    System.out.println("\n--------------\n");

	    String[] krediler = { 
	    		"H�zl� Kredi", 
	    		"Mutlu Emekli Kredisi", 
	    		"Konut Kredi", 
	    		"�ift�i Kredisi", 
	    		"Mbs Kredisi",
	    		"Med Kredisi", 
	    		"K�lt�r Bakanl��� Kredisi" 
	    };

	    /* For D�ng�s� */
	    for (int i = 0; i < krediler.length; i++)
	      System.out.println(krediler[i]);

	    System.out.println("\n--------------\n");

	    /* Foreach D�ng�s� */
	    for (String kredi : krediler)
	      System.out.println(kredi);

	    /*
	     * IMPORTANT* say�sal veri tipleri `�nt`, `float`, `double`, `boolean`, `byte`,
	     * `enum` bu tip say�sal veri tipleri bellekte `de�er tip` olarak tutulurlar.
	     * �stisna olara `String` tipide `de�er tip` olarak �al���r.
	     * 
	     * IMPORTANT* `array`, `class`, `interface`, `abstract class` gibi yap�lar
	     * `referans tip` dir. Onlar `Heap` �zerinde tutulur.
	     *
	     ** IMPORTANT* bellekte veriler adres'te tutulur.
	     *
	     * Bir de�i�keni tan�mlad���m�zda asl�nda bellekte iki tane k�s�m var. Bu veri
	     * tiplerindeki de�i�kenleri tutmak i�in bunlardan biri `Stack` di�eri ise
	     * `Heap`
	     *
	     * De�er Tipleri : `stack` 'de �al���r. Ad� �zerinde her�ey de�eri �zerinde,
	     * atamalar de�eri �zerinden yaz�l�yor. De�er atamas� yap�l�r ama asla ba�lant�
	     * kalmaz. De�er tiplerdeki atamalarda de�er atanmas� yap�l�r ve ba�lant� kopar.
	     *
	     * Referans Tipleri : `heap` 'te �al���r.
	     * 
	     */

	    System.out.println("\n--------------\n");
	    
	    int sayi1 = 10;
	    int sayi2 = 20;
	    sayi1 = sayi2;
	    sayi2 = 100;
	    System.out.println(sayi1); /* 20 */

	    int[] sayilar1 = { 1, 2, 3, 4, 5 };
	    int[] sayilar2 = { 10, 20, 30, 40, 50 };
	    sayilar1 = sayilar2;
	    sayilar2[0] = 100;
	    System.out.println(sayilar1[0]); /* 100 */

	    String sehir1 = "Ankara";
	    String sehir2 = "�stanbul";
	    sehir1 = sehir2;
	    sehir2 = "�zmir";
	    System.out.println(sehir1); /* �stanbul - �stisna bir �ekilde de�er tipi olarak �al���r.*/
	}

}
