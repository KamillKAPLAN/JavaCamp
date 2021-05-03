package Odev2;

public class UserManager {	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý eklendi.");
	}
	
	public void read(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý okundu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý güncellendi.");
	}
}
