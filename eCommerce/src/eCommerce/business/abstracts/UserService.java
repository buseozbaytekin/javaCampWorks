package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void SignIn(User user);
	void confirm(User user);
	
	
}
