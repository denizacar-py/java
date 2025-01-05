package albumZi;

public class Album {
	String isimSanatci;
	String albumler;
	String aylikDinleyici;
	String hitSarki;

	void bilgileriGoster() {
		System.out.println("İsim: " + isimSanatci + "\n Albümler: " + albumler + "\n Aylık dinleyici: " + aylikDinleyici
				+ "\n Hit Şarkısı: " + hitSarki);
	}

}
