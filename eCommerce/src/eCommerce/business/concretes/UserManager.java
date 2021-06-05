package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao= userDao;
	}

	@Override
	public void signUp(User user) {
		
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(user.geteMail());
		if (!m.matches()) {
			System.out.println("Lütfen e-posta formatında doldurunuz.");
		}
		
		if(user.getPassword().length()<6) {
			System.out.println("Şifre en az 6 karakterden oluşmalıdır!");
		}
		
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır!");
		}
		
		if (user.geteMail() == user.geteMail()) {
			System.out.println("Bu e-posta kayıtlıdır. Yeni bir e-posta ya da şifre giriniz.");
		}
		
		
	}

	@Override
	public void SignIn(User user) {
		if(user.geteMail() == user.geteMail() && user.getPassword() == user.getPassword()) {
			System.out.println("Giriş başarılı.");
		}else {
			System.out.println("e-postanızı veya parolanızı kontrol ediniz");
		}
		
	}

	@Override
	public void confirm(User user) {
		
		
	}

}
