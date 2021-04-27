
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * deðiþken isimlendirmelerde camelCase kullanýlýr.
	     * 
	     * Don't repeat yourself : kendini tekrar etme, yazýlým geliþtirmenin ana
	     * prensiplerinden bir tanesi
	     * 
	     * byte : 0 - 254
	     * 
	     * byte > int > long : veri tipi sýralama
	     * 
	     * biz programlarýmýzda belli bir durumun gerçekleþip gerçekleþmediðine göre
	     * `Þartlý Ýfadeler` den yararlanýyoruz. Bu þartlý ifadeleri tuttuðumuz veri
	     * tipinin adý `boolean` deðeri ya true yada false
	     * 
	     * liste tabanlý verileri tutmak için karþýmýza `Array(Dizi)` ler çýkar yani
	     * Veri Seti, Veri Dizisi...
	     */

	    String internetSubeBtn = "Ýnternet Þubesi";
	    double dolarDun = 8.15;
	    double dolarBugun = 8.15;
	    int vade = 36;
	    boolean dustuMu = false;

	    System.out.println("Hello world! " + internetSubeBtn + " " + dolarDun + " " + vade + " " + dustuMu);

	    if (dolarBugun < dolarDun)
	      System.out.println("Dolar düþtü");
	    else if (dolarBugun == dolarDun)
	      System.out.println("Dolar deðiþmedi");
	    else
	      System.out.println("Dolar yükseldi.");

	    String kredi1 = "Hýzlý Kredi";
	    String kredi2 = "Mutlu Emekli Kredisi";
	    String kredi3 = "Konut Kredi";
	    String kredi4 = "Çiftçi Kredisi";
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
	    		"Hýzlý Kredi", 
	    		"Mutlu Emekli Kredisi", 
	    		"Konut Kredi", 
	    		"Çiftçi Kredisi", 
	    		"Mbs Kredisi",
	    		"Med Kredisi", 
	    		"Kültür Bakanlýðý Kredisi" 
	    };

	    /* For Döngüsü */
	    for (int i = 0; i < krediler.length; i++)
	      System.out.println(krediler[i]);

	    System.out.println("\n--------------\n");

	    /* Foreach Döngüsü */
	    for (String kredi : krediler)
	      System.out.println(kredi);

	    /*
	     * IMPORTANT* sayýsal veri tipleri `ìnt`, `float`, `double`, `boolean`, `byte`,
	     * `enum` bu tip sayýsal veri tipleri bellekte `deðer tip` olarak tutulurlar.
	     * Ýstisna olara `String` tipide `deðer tip` olarak çalýþýr.
	     * 
	     * IMPORTANT* `array`, `class`, `interface`, `abstract class` gibi yapýlar
	     * `referans tip` dir. Onlar `Heap` üzerinde tutulur.
	     *
	     ** IMPORTANT* bellekte veriler adres'te tutulur.
	     *
	     * Bir deðiþkeni tanýmladýðýmýzda aslýnda bellekte iki tane kýsým var. Bu veri
	     * tiplerindeki deðiþkenleri tutmak için bunlardan biri `Stack` diðeri ise
	     * `Heap`
	     *
	     * Deðer Tipleri : `stack` 'de çalýþýr. Adý üzerinde herþey deðeri üzerinde,
	     * atamalar deðeri üzerinden yazýlýyor. Deðer atamasý yapýlýr ama asla baðlantý
	     * kalmaz. Deðer tiplerdeki atamalarda deðer atanmasý yapýlýr ve baðlantý kopar.
	     *
	     * Referans Tipleri : `heap` 'te çalýþýr.
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
	    String sehir2 = "Ýstanbul";
	    sehir1 = sehir2;
	    sehir2 = "Ýzmir";
	    System.out.println(sehir1); /* Ýstanbul - Ýstisna bir þekilde deðer tipi olarak çalýþýr.*/
	}

}
