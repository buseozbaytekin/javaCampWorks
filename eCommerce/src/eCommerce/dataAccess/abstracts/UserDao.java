package eCommerce.dataAccess.abstracts;

import java.util.ArrayList;

import eCommerce.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void remove(User user);
	void update(User user);
	User get(int id);
	User getByEmail(String eMail);
	User getByEmailAndPassword(String eMail, String password);
	ArrayList<User> getAll();
}
