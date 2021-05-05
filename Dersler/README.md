# JAVA CAMP - JAVA & REACT YouTube Eğitim Videosu

☑️ Bu Repository 'de `YouTube` 'da yer alan [(Java & React ) Yazılım Geliştirici Yetiştirme Kampı](https://www.youtube.com/playlist?list=PLqG356ExoxZUuVYKLuiQLnref7Y4ims87) oynatma listesindeki videolar yer almaktadır.

☑️ [Ders1 - 21.04.2021 - 1. Gün Java Giriş](https://www.youtube.com/watch?v=HB0T0hAMk0k) dersinde `Java` ile aşağıdaki konular işlenmiştir.
 - jave se (jdk) kurulumu (1)
 - eclipse kurulumu (2)
 - replit.com --> online Ide
 - bankacılık, e-ticaret, yemek, market, stok takip, rent a car : otomasyon uygulamaları
 - metinsel veri tipleri arka planda `char` array olarak tutulur.
 - iyi bir programcı olmanın en önemli şartı bir hata ile 3-4 gün uğraşmaktır. Bu ciddi bir `özveri` istemektedir.
 - **`Derste öğrendiklerimiz`** : Değişkenler, Şart Blokları, Diziler, Döngüler, For ve Foreach, Değer ve Referans Tipleri

☑️ `Ders1 - Ödev`
 - [5. Ders](https://www.youtube.com/watch?v=dtP6yK50xIs&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=6) ve [23. Ders](https://www.youtube.com/watch?v=MaJXZn3CqVA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=24) aralığında verilen videolar izlendi ve uygulandı.
 - `NOTLAR`
   - `intellisense` : programcıya kodu yazarken yardımcılık sağlar. 
   - `case sensitive` : büyük küçük harf duyarlı
   - değişken tanımlarken `camelCasing` ile isimlendirme yapılır.
   - `reusability` : tekrar kullanılabilirlik
   - `code refactor` : kodları temizleme, kirli kod olayını ortadan kaldırma
   - `değişkenler` : çalıştığımız blokta tekrar tekrar kullanabilmek için ve bellekten tasarruf yapmak için kullanıyoruz.
   - Java tip güvenli bir dildir.
   - İlkel Tipler : bir dilin en temel veri tipleridir. Bunlar `Değer Tipleri` 'dir.
   - `Değer Tipleri`
   - ```
        byte  dataTypeByte  = 127;    /* 1 byte -128 127 */
		short dataTypeShort = 123;    /* 2 bytes */ 
		int   dataTypeInt   = 123;    /* 4 bytes */
		long  dataTypeLong  = 922;    /* 8 bytes */
		float dataTypeFloat = 134;    /* 4 bytes */
		double dataTypeDouble = 14.4; /* 8 bytes */
		
		char    dataTypeChar = 'A';     /* 2 bytes */
 		boolean dataTypeBool = false;   /* 1 bytes */
     ```
   - Programlar insanların gündelik hayattaki aktivitilerini kodsal bilgisayar destekli sistemlerle daha kolay hale getiren versiyonudur.
   - `if - else programing` - **savunmacı programlama**
   - Şart blogu oluşturmak için 2 yöntem kullanılır. Bunlardan ilki `if` ikincisi `switch` ama **if standart**
   - `do-wile` döngüsü şart sağlanmasa bile en az bir kere çalışır. 
   - `diziler` : genellikle aynı tipdeki verilerin bir arada bulunduğu liste 
   - **`bug`** : uygulamadaki mantıksal veya sistemsel hatalar.

☑️ [Ders2 - 24.04.2021 - 2. Gün Java OOP Giriş](https://www.youtube.com/watch?v=zwPQsIpTrH8) dersinde `Java` ile aşağıdaki konular işlenmiştir.
 - Class oluşturma, `Özellik` ve `İş yapan` classlar incelenmiştir.
 - Constructor ifadesi incelenmiştir. `Constructor` overloading üzerinde çalışılmıştır.
 - Javanın kendisi C# gibi tamamen OOP 'dir.
 - main metodu java uygulamalarındaki başlangıç dosyasıdır. Biz aksini belirtmediğimiz sürece, program oradan dallanıyor.
 - veritabanı olarak `postgre` kullanılacak. Memory veritabanı üzerinden ilerlenecek.
 - Her JAVA dosyası bir **class** dır.
 - **`constructor`** : `yapıcı block`. Bir class'ı oluştururken yapmasını istediğimiz şeyi buraya yazarız.
 - `overloading` : birden fazla oluşturma - aşırı yüklenme
 - **Important** : bir constructor çalışmak zorunda, birden fazla constructor varsa sadece biri çalışır.
 - **`Don't repeat yourself`** : kendini tekrar etme
 - **IMPORTANT** `İş yapan Class'lar`, `Özellik tutan Class'lar` **IMPORTANT**
 - `SOLID - Single Responsibility` : her class, her metot sadece bir işi yapmakla mükelleftir.
 - **`sys`** = System.out.println();
 - Eclipse --> **Run** : `Ctrl F11` ve **Format Code** : `Ctrl + Shift + F`
 - **`Derste öğrendiklerimiz`** : Class oluşturma, `Özellik` ve `İş yapan` classlar incelenmiştir. `Constructor` overloading üzerinde çalışılmıştır.

☑️ `Ders2 - Ödev`
 - [24. Ders](https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25) ve [35. Ders](https://www.youtube.com/watch?v=X1UnM4W4-_w&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=36) aralığında verilen videolar izlendi ve uygulandı.
 - `NOTLAR`
   - **Don't Repeat Yourself (DRY) Prensibi** : kendini tekrar etme prensibi
   - **fonksiyonel programlama** : bir fonksiyonun metodun içerisinde bir sürü işi yapmak o anki operasyonu kurtarır. Aynı kodu tekrar tekrar yazmamak için bir işi yapacak şekilde kodlarımızı yazmalıyız.
   - metot yazarak kendimizi tekrarlamayı engellemiş oluyoruz.
   - **`metot isimleri`** : **camelCasing** 
   - **`class isimleri`** : `pascalCasing`
   - -- YAZIM ŞEKİLLERİ --
   - **Camel Case** : userLoginCount
   - **Pascal Case** : UserLoginCount 
   - **Snake Case** : user_login_count || USER_LOGIN_COUNT 
   - **Kebab Case** : user-login-count
   - class'ları, nesnel alt yapıları öğrenirsek `sürdürülebilir` yazılım  gerçekleştirmeyi öğrenmiş oluruz.
   - **`Sürdürülebilir yazılım`** : uygulamamıza sürekli yeni istekler ve ihtiyaçlar gelecektir. Bu isteklere ve ihtiyaçlara direnmeyen yazılım yapmamıza denir.
   - Java'da herşey iş yapan bir class'ın içerisinde oluşuyor. **Class'ların en önemli özelliği gruplama yapmaktır.**
   - **Class'lar** `referans tipdir`.
   - int, double, float, byte : **`Değer Tipler` - `Value Types`**
   - diziler : **`Referans Tipler` - `References Types`**
   - Class'lar
     - ortak operasyonları tutar.
	 - referans tiptir. 
   - `Class` 'ların bir diğer özelliği ise özellik tutmasıdır. Bir class aynı zamanda field, attribute barındırır. C# 'da karşılığı `property` olarak adlandırılır.
   - **Class'lar** ilgili operasyonları, ilgili özellikleri tutarlar.
   - SOLID (Singleton Pattern) : 
     - tek sorumluluk prensibi, 
     - bir class sadece bir işi yapar.
	 - bir metot sadece bir işi yapar.
	 - bir if blogu sadece bir işi yapar.
   - **`Encapsulation`** : 
     - capsulleme dediğimiz bir yöntemdir, 
	 - herhangi bir alanı kullanmak için kısıtlamayı ön görür. 
	 - getter - setter
   - **getter** : okumak, almak, bir değeri okumaya yönelik işlemdir. : **readonly**
   - **setter** : kurmak, vermek, bir değeri vermek                   : **writeonly**
   - Class'ların default bir Constructor'ı mevcuttur. 
   - **this** : bu class, içerisinde bulunduğum class anlamına gelmektedir.
   
☑️ [Ders3 - 28.04.2021 - 3. Gün Java OOP Soyutlama](https://www.youtube.com/watch?v=v0nc0yesGfk) dersinde `Java` ile aşağıdaki konular işlenmiştir.   
 - **Constructor** : bir nesnenin referansını bellekte oluşturduğumuz zaman çalışan blocktur.
 - **final** : sadece constructor'dan erişim sağlayabilmek için field'ların önüne konulur.
 - **getter'lar ve setter'lar** field alanlarının değerlerini vermeye ve o değerleri almak için kullanılacak operayonlar.
 - **Inheritance(Miras Almak)** : bizim iki adet sınıfımız var, bu iki tane sınıfımızda bazı operasyonlar ortak bir yapıya sahip onun için ya biz gider iki kere onu ayrı ayrı sınıflara yazarız yada bu `Inheritance` mimarisinden faydalanırız.
 - Üzerinde 4 işlem yapmadığımız veriler `metinsel` olarak oluşturulmalıdır. Bu bizim VTYS tarafında doğru arama yapmamızı sağlar. 
 - **Bir class ne yapabiliyorsa sadece onları yapabilmelidir.**
 - **extends** : genişletmek
 - **class'lar referans tipdir. ve temel sınıflar, super sınıflar onu `extends` eden sınıfların referansını tutabilir. Bu bize `sürdürülebilirliği` sağlar.**
 - SOLID (Open Closed Principle) : 
   - sisteme yeni özellik eklendiğinde mevcutta bulunan hiç bir kodu değiştiremezsin, sadece yeni kodu eklersin.
 - **bir birinin alternatifi olan kodlar için **`if`** ile yazılmaz.**
 - **iş yapan bir sınıf başka bir iş yapan sınıf'ı kullanacak ise asla ve asla somut sınıf üzerinden ilerlenmez ve asla new lenmemelidir.**
 - **İş yapan sınıflar** = somut sınıf
 -- **Polymorphism** : 
    - bir alt sınıfta bir süper sınıfın **yapısını ve davranışını kullanmayı** ifade eder.
    - class'lar referans tipdir. ve temel sınıflar, super sınıflar onu `extends` eden sınıfların referansını tutabilir. 
 -- **Inheritance(Miras Almak)** : 
    - alt sınıftaki bir süper sınıfın **davranışını değiştirmeyi** ifade eder.
	- bizim iki adet sınıfımız var, bu iki sınıfımızda bazı ortak operasyonlar ve ortak özellikler mevcut..

☑️ `Ders3 - Ödev`
 - [27. Ders](https://www.youtube.com/watch?v=zfIt6x-guc0&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=29) ve [39. Ders](https://www.youtube.com/watch?v=P4j2oh84ht4&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=40) aralığında verilen videolar izlendi ve uygulandı.
 - `NOTLAR`
   - class'ları, nesnel alt yapıları öğrenirsek `sürdürülebilir` yazılım  gerçekleştirmeyi öğrenmiş oluruz.
   - **`Sürdürülebilir yazılım`** : uygulamamıza sürekli yeni istekler ve ihtiyaçlar gelecektir. Bu isteklere ve ihtiyaçlara direnmeyen yazılım yapmamıza denir.
   - Java'da herşey iş yapan bir class'ın içerisinde oluşuyor. **Class'ların en önemli özelliği gruplama yapmaktır.**
   -
   - **`Değer Tipler` - `Value Types`** : int, double, float, byte
   - **`Referans Tipler` - `References Types`** : diziler, **classlar**
   -
   - **Class'lar** ilgili operasyonları, ilgili özellikleri tutarlar.
   - `SOLID`
     - **(Singleton Pattern)** : 
       - tek sorumluluk prensibi, 
       - bir class sadece bir işi yapar.
	   - bir metot sadece bir işi yapar.
	   - bir if blogu sadece bir işi yapar.
     - **(Open Closed Principle)** : 
       - sisteme yeni özellik eklendiğinde mevcutta bulunan hiç bir kodu değiştiremezsin, sadece yeni kodu eklersin.
   - 
   - **`Encapsulation` - (Kapsülleme)** : kullanıcıya herhangi bir alanı kullanmak için kısıtlamayı ön görür. **getter** - **setter**
     - **getter** : okumak, almak, bir değeri okumaya yönelik işlemdir. : **readonly**
     - **setter** : kurmak, vermek, bir değeri vermek                   : **writeonly**
	 - **this** : bu class, içerisinde bulunduğum class anlamına gelmektedir.
   - 
   - **`Inheritance` - (Miras | Kalıtım)** : 
     - İki nesne | class arasındaki miras(kalıtım) durumudur.
	 - bizim iki adet sınıfımız var, bu iki sınıfımızda bazı ortak operasyonlar ve ortak özellikler mevcut..
	 - **ortak özellikleri** ve **ortak operasyonları** tekrar tekrar yazmamamızı söyler.
	 - bir class başka bir class'ı sadece bir kere **extends - Inherit** edebilir.
   - 
   - **bir birinin alternatifi olan kodlar için **`if`** ile yazılmaz.**
   -
   - **`Polimorfizm` - (Çok biçimlilik)** : 
     - **aralarında `inheritis` olan referans tiplerinin birbirinin referansını tutması ile olan durumdur.**
     - oluşturduğumuz bir nesne kendisi gibi değil de başka bir nesne gibi davranıyorsa buna polymorphism denilir.
	 - Elimizde farklı biçimlerde çalışan nesneler olsun. Ama biz bu nesnelere aynı şekilde ulaşmak istiyoruz diyelim. İşte o zaman polymorphism özelliği bizim en büyük yardımcımız olacaktır.
	 - Java’da farklı şekilde çalışan nesnelere aynı şekilde erişmek şeklinde tanımlayabiliriz. Diğer bir tanım olarak bir nesnenin farklı bir nesne gibi davranmasıdır.
   -
   - **bir class'ı başka bir class'ın içerisinde `new` anatar sözcüğü ile kullanmak ona bağımlı olduğumuzu gösterir.**
   - **final** : java'da sabit bir değer tanımlamak için kullanılır.