package eCommerce.core;

import eCommerce.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(User user);
	
}
