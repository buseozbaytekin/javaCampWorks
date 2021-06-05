package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao());
		
		User user = new User(1,"Buse","Özbaytekin",
				"1111111","buseozbaytekin@hotmail.com",
				"123456");
		
		User user1 = new User(2,"Mustafa","Bilce",
				"1111","mustafabilcehotmail.com",
				"12");
		
		userService.SignIn(user);
		userService.signUp(user);
		userService.confirm(user);
		userService.signUp(user1);
	}

}
