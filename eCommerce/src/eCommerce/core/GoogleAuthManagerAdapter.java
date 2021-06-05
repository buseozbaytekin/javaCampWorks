package eCommerce.core;

import eCommerce.entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {


	
	@Override
	public void register(User user) {
		GoogleAuthManager google = new GoogleAuthManager();
		google.register(user.geteMail());
	}

	@Override
	public void login(User user) {
		GoogleAuthManager google = new GoogleAuthManager();
		google.login(user.geteMail());
	}

}
