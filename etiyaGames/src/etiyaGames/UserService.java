package etiyaGames;

import java.util.ArrayList;

public class UserService {

	ArrayList<User> users = new ArrayList<User>();

	public void add(User user) {

		if (user.getAge() >= 15) {
			System.out.println(user.getFirstName() + " adlı kullanıcı sisteme kaydedildi");
			this.users.add(user);
		} else if (user.getAge() < 0) {
			System.out.println("Geçersiz kullanıcı yaşı");
		} else {
			System.out.println("15 yaşından küçükler sisteme kayıt olamaz");
		}
	}

	public ArrayList<User> getAll() {

		User user1 = new User();
		user1.setFirstName("İbrahim");
		user1.setLastName("Gezer");
		user1.setAge(28);

		this.users.add(user1);

		return this.users;
	}
}
