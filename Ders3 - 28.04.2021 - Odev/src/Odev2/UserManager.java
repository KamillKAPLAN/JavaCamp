package Odev2;

public class UserManager {	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� eklendi.");
	}
	
	public void read(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� okundu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� g�ncellendi.");
	}
}
