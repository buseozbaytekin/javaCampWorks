package eCommerce.dataAccess.concretes;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanıcısı sisteme eklendi.");
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanıcısı kaldırıldı.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanıcısı güncellendi.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmailAndPassword(String eMail, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
