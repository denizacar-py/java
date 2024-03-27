import java.nio.channels.Pipe;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class daireAlan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double daireAlan;
		double daireCevre;
		double daireCap;
		double pi = 3.14159;
		System.out.println("Dairenin yarıçapını giriniz.");
		daireCap = input.nextDouble();
		daireCevre =  2 * pi * daireCap;
		daireAlan = pi * Math.pow(daireCap, 2);
		System.out.println("Dairenin Çevresi: " + daireCevre + "");
		System.out.println("Dairenin Alanı: " + daireAlan);
	}
}
