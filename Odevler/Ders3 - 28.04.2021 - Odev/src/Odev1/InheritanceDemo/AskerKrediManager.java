package Odev1.InheritanceDemo;

public class AskerKrediManager extends BaseKrediManager {
	
	@Override
	public void hesapla() {
		System.out.println("Asker kredisi hesapland�.");
	}
	
	@Override
	public double krediHesapla(double hesaplanacakTutar) {
		 return hesaplanacakTutar * 1.10;
	 }
}
