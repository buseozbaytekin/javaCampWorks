package gameDemo;

public class GamerManager {
	
	public void signUp(Gamer gamer) {
		System.out.println(gamer.firstName + ", giriş yapıldı!");
	}
	
	public void deleteAccount(Gamer gamer) {
		System.out.println(gamer.firstName + ", hesap silindi!");
	}
	
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName + ", güncellendi!");
	}
}
