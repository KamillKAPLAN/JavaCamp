package Odev1.InheritanceDemo;

public class BaseKrediManager {
	
	 public void hesapla() {
		 System.out.println("Kredi hesaplandý.");
	 }
	 
	 public double krediHesapla(double hesaplanacakTutar) {
		 return hesaplanacakTutar * 1.18;
	 }
}
