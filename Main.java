package albumZi;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Album> sanatcilar = new ArrayList<>();
		Album sanatci1 = new Album();
		sanatci1.isimSanatci = "Future";
		sanatci1.albumler = "MIXTAPE PLUTO, WSDTY, WDTY, \n I NEVER LIKED YOU, High Off Life, HNDRXX, \n WATTBA, EVOL, PURPLE REIGN, DS2, MONSTER, HONEST.";
		sanatci1.aylikDinleyici = "55.239.640";
		sanatci1.hitSarki = "Mask Off";
		sanatcilar.add(sanatci1);

		Album sanatci2 = new Album();
		sanatci2.isimSanatci = "ASAPROCKY";
		sanatci2.albumler = "LIVE.LOVE.ASAP, LONG.LIVE.ASAP, AT.LONG.LAST.ASAP, TESTING";
		sanatci2.aylikDinleyici = "35.951.600";
		sanatci2.hitSarki = "Praise The Lord (Da Shine) (feat. Skepta)";
		sanatcilar.add(sanatci2);

		Album sanatci3 = new Album();
		sanatci3.isimSanatci = "KANYEWEST";
		sanatci3.albumler = "The College Dropout, Late Registration, Graduation, \n808s & Heartbreak, My Beautiful Dark Twisted Fantasy, Yeezus, The Life of Pablo, \nYe, Jesus Is King, Donda";
		sanatci3.aylikDinleyici = "55.400.000";
		sanatci3.hitSarki = "Stronger";
		sanatcilar.add(sanatci3);

		Album sanatci4 = new Album();
		sanatci4.isimSanatci = "KENDRICKLAMAR";
		sanatci4.albumler = "Section.80, Good Kid, M.A.A.D City, To Pimp a Butterfly, \nDAMN., Mr. Morale & The Big Steppers";
		sanatci4.aylikDinleyici = "65.500.000";
		sanatci4.hitSarki = "HUMBLE.";
		sanatcilar.add(sanatci4);

		Album sanatci5 = new Album();
		sanatci5.isimSanatci = "JCOLE";
		sanatci5.albumler = "Cole World: The Sideline Story, Born Sinner, 2014 Forest Hills Drive, \n4 Your Eyez Only, KOD, The Off-Season";
		sanatci5.aylikDinleyici = "40.200.000";
		sanatci5.hitSarki = "No Role Modelz";
		sanatcilar.add(sanatci5);

		Album sanatci6 = new Album();
		sanatci6.isimSanatci = "TRAVISSCOTT";
		sanatci6.albumler = "Rodeo, Birds in the Trap Sing McKnight, Astroworld, UTOPIA";
		sanatci6.aylikDinleyici = "75.800.000";
		sanatci6.hitSarki = "SICKO MODE";
		sanatcilar.add(sanatci6);

		Album sanatci7 = new Album();
		sanatci7.isimSanatci = "LILWAYNE";
		sanatci7.albumler = "Tha Block Is Hot, Tha Carter, Tha Carter II, Tha Carter III, \nTha Carter IV, Tha Carter V, Funeral";
		sanatci7.aylikDinleyici = "30.700.000";
		sanatci7.hitSarki = "A Milli";
		sanatcilar.add(sanatci7);

		Album sanatci8 = new Album();
		sanatci8.isimSanatci = "50CENT";
		sanatci8.albumler = "Get Rich or Die Tryin', The Massacre, Curtis, Before I Self Destruct, Animal Ambition";
		sanatci8.aylikDinleyici = "33.500.000";
		sanatci8.hitSarki = "In Da Club";
		sanatcilar.add(sanatci8);

		Album sanatci9 = new Album();
		sanatci9.isimSanatci = "TYLERTHECREATOR";
		sanatci9.albumler = "Goblin, Wolf, Cherry Bomb, Flower Boy, Igor, Call Me If You Get Lost";
		sanatci9.aylikDinleyici = "28.600.000";
		sanatci9.hitSarki = "EARFQUAKE";
		sanatcilar.add(sanatci9);

		Album sanatci10 = new Album();
		sanatci10.isimSanatci = "NAS";
		sanatci10.albumler = "Illmatic, It Was Written, Stillmatic, God's Son, \nKing's Disease, Magic";
		sanatci10.aylikDinleyici = "8.500.000";
		sanatci10.hitSarki = "N.Y. State of Mind";
		sanatcilar.add(sanatci10);

		System.out.print("Sanatçıyı girin: ");
		String kullaniciSanatci = scanner.next();

		 boolean bulundu = false;
	        for (Album sanatci : sanatcilar) {
	            if (kullaniciSanatci.equalsIgnoreCase(sanatci.isimSanatci)) {
	                sanatci.bilgileriGoster();
	                bulundu = true;
	                break;
	            }
	        }

	        // Sanatçı bulunamazsa hata mesajı
	        if (!bulundu) {
	            System.out.println("Bu sanatçı bulunamadı.");
	        }
		scanner.close();
	}

}
