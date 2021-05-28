package gameDemo;

public class EDevletVerificationManager implements GamerVerification {
	

		@Override
		public void eDevlet(Gamer gamer) {
			System.out.println(gamer.firstName + " kullanıcı bilgilerin doğrulandı.");
			
		}

	}