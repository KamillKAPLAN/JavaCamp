package Odev2;

public class UserManager {	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı eklendi.");
	}
	
	public void read(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı okundu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı güncellendi.");
	}
}
