import Odev1.*;
import Odev1.CustomerManager;
import Odev1.Inheritance.*;
import Odev1.InheritanceDemo.*;
import Odev1.Polimorfizm.*;
import Odev2.*;

public class Main {
	public static void main(String[] args) { 
		System.out.println("--- 27_Class Nedir");
		/* CourseManager class'ý oluþturuldu. */
		
		System.out.println("--- 28_Bir Class Nasýl Çalýþýr");
		/* class : references type */
		CustomerManager cm = new CustomerManager();
		CustomerManager cm2 = new CustomerManager();
		cm = cm2; /* cm'nin referans numarasý eþittir, cm2'nin referans numarasýdýr. */
		cm.add();
		cm.remove();
		cm.update();
		
		System.out.println("--- 29_Deðer ve Referans Tipleri");
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {4, 5, 6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		System.out.println("--- 30_ReCap Demo Classlarla Çalýþmak");
		DortIslem dortIslem = new DortIslem();
		int result = dortIslem.topla(3, 4);
		System.out.println(result);
		
		System.out.println("--- 31_Field ve Attribute ile Çalýþmak");
		Product product = new Product();
		/*product.id = 1;
		product.name = "Laptop";
		product.description = "Lenova Z-50";
		product.price = 5000;
		product.stockAmount = 3; */
		
		/* ProductManager productManager = new ProductManager();
		productManager.add(product); */
		
		System.out.println("--- 32_Encapsulation Ýhtiyacý");
		/* Video izlendi. */
		
		System.out.println("--- 33_Getter ve Setter");
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Lenova Z-50");
		product.setPrice(5000);
		product.setStockAmount(3);
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());
		 
		System.out.println("--- 34_Constructor");
		Product product2 = new Product(2, "Akg Kulaklýk", "Kulak içi kulaklýk", 4500, 5);
		productManager.add(product2);
		System.out.println(product2.getCode());
		
		System.out.println("--- 35_Method Overloading");
		DortIslem dortIslem2 = new DortIslem();
		System.out.println(dortIslem2.topla(2, 3));
		System.out.println(dortIslem2.topla(2, 3, 5));
		
		System.out.println("--- 36_Inheritance Yapýsý");		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		Odev1.Inheritance.CustomerManager customerManager = new Odev1.Inheritance.CustomerManager();
		
		System.out.println("--- 37_Inheritance Demo");
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());
		
		System.out.println("--- 38_Polimorfizm");
		BaseLogger[] baseLoggers = new BaseLogger[] {
				new DatabaseLogger(), 
				new EmailLogger(),
				new FileLogger(),
				new ConsoleLogger()
		};
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.log("Log mesajý");
		}
		
		Odev1.Polimorfizm.CustomerManager customerManager2 = new Odev1.Polimorfizm.CustomerManager(new DatabaseLogger());
		customerManager2.add();
		
		System.out.println("--- 39_Overriding Altyapýsý");
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {
				new AskerKrediManager(),
				new OgretmenKrediManager(),
				new TarimKrediManager()
		};
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			System.out.println(baseKrediManager.krediHesapla(1000));
		}
		
		System.out.println("--- Odev2");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setCourseTitle("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		  
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Kamil");
		student.setLastName("Kaplan");
		student.setEmail("kamilkaplnn@gmail.com");
		student.setAge(27);
				
		UserManager[] userManagers = {
			new InstructorManager(),
			new StudentManager()
		};
		for (UserManager userManager : userManagers) {
			if (userManager instanceof StudentManager) {
				userManager.add(student);
				userManager.read(student);
				userManager.update(student);
				userManager.delete(student);
			} else if(userManager instanceof InstructorManager) {
				userManager.add(instructor);
				userManager.read(instructor);
				userManager.update(instructor);
				userManager.delete(instructor);
			}
		}
	}
}