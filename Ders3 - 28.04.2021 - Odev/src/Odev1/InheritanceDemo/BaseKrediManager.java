package Odev1.InheritanceDemo;

public class BaseKrediManager {
	
	 public void hesapla() {
		 System.out.println("Kredi hesaplandı.");
	 }
	 
	 public double krediHesapla(double hesaplanacakTutar) {
		 return hesaplanacakTutar * 1.18;
	 }
}
