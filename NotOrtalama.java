import java.awt.Choice;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class NotOrtalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quiz, vize , donemSonu;
		double ortalama;
		int notGorme;
		System.out.println("Quiz notunuzu giriniz");
		quiz = input.nextInt();
		System.out.println("Vize notunuzu giriniz");
		vize = input.nextInt();
		System.out.println("Final notunuzu giriniz");
		donemSonu = input.nextInt();
		
		ortalama = (quiz * 0.2 ) + (vize * 0.35) + (donemSonu * 0.5)/ 3;
		//System.out.println("Ortalamanız: " + ortalama);
		if (ortalama < 50) {
			System.out.println("Geçemediniz.");
		} else {
			System.out.println("Geçtiniz.");
		
		}
		
		System.out.println("Ortalamanızı görmek ister misiniz? (E/H)");
		
		 notGorme = input.next().charAt(0);
		 if (notGorme == 'E' || notGorme == 'e') {
	            System.out.println("Ortalamanız: " + ortalama);
		 }  else if (notGorme == 'H' || notGorme == 'h') {
			 System.out.println("Siz bilirsiniz!");
		 } else {
	            System.out.println("Lütfen geçerli bir seçenek girin.");
	            
		
	}

	}
}
