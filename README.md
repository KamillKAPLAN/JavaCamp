# JAVA CAMP

☑️ Bu Repository 'de `YouTube` 'da yer alan [(Java & React ) Yazılım Geliştirici Yetiştirme Kampı](https://www.youtube.com/watch?v=HB0T0hAMk0k) oynatma listesindeki videolar yer almaktadır.

☑️ [Ders1 - 21.04.2021 - Intro](https://www.youtube.com/watch?v=HB0T0hAMk0k) dersinde `Java` ile aşağıdaki konular işlenmiştir.
 - Değişkenler
 - Şart Blokları
 - Diziler
 - Döngüler
 - For ve Foreach
 - Değer ve Referans Tipleri

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

☑️ [Ders2 - 24.04.2021 - OopIntro](https://www.youtube.com/watch?v=zwPQsIpTrH8) dersinde `Java` ile aşağıdaki konular işlenmiştir.
 - Class oluşturma, `Özellik` ve `İş yapan` classlar incelenmiştir.
 - Constructor ifadesi incelenmiştir. `Constructor` overloading üzerinde çalışılmıştır.
 - Javanın kendisi C# gibi tamamen OOP 'dir.
 - Her JAVA dosyası bir **class** dır.
 - **`constructor`** : `yapıcı block`. Bir class'ı oluştururken yapmasını istediğimiz şeyi buraya yazarız.
 - `overloading` : birden fazla oluşturma - aşırı yüklenme
 - **Important** : bir constructor çalışmak zorunda, birden fazla constructor varsa sadece biri çalışır.
 - **`Don't repeat yourself`** : kendini tekrar etme
 - **IMPORTANT** `İş yapan Class'lar`, `Özellik tutan Class'lar` **IMPORTANT**
 - `SOLID - Single Responsibility` : her class, her metot sadece bir işi yapmakla mükelleftir.
 - **`sys`** = System.out.println();
 - Eclipse --> **Run** : `Ctrl F11` ve **Format Code** : `Ctrl + Shift + F`

☑️ `Ders2 - Ödev`
 - [24. Ders](https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25) ve [35. Ders](https://www.youtube.com/watch?v=X1UnM4W4-_w&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=36) aralığında verilen videolar izlendi ve uygulandı.
 - `NOTLAR`
   - **Don't Repeat Yourself (DRY) Prensibi** : kendini tekrar etme prensibi
   - **fonksiyonel programlama** : bir fonksiyonun metodun içerisinde bir sürü işi yapmak o anki operasyonu kurtarır. Aynı kodu tekrar tekrar yazmamak için bir işi yapacak şekilde kodlarımızı yazmalıyız.
   - metot yazarak kendimizi tekrarlamayı engellemiş oluyoruz.
   - **`metot isimleri`** : **camelCasing** 
   - **`class isimleri`** : `pascalCasing`
   - YAZIM ŞEKİLLERİ
   - **Camel Case** : userLoginCount
   - **Pascal Case ** : UserLoginCount 
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
   - SOLID (Singleton Pattern) : tek sorumluluk prensibi, 
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