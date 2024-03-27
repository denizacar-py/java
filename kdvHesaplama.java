import java.util.Scanner;


public class kdvHesaplama {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		double kdvliFiyat;
		double kdvOran;
		double kdvMiktar;
		double kdvHaric;
		
		System.out.println("KDV Dahil Fiyatı Giriniz.");
			kdvliFiyat = input.nextDouble();
		System.out.println("KDV Oranını Giriniz.");
			kdvOran = input.nextDouble();
			kdvMiktar = kdvliFiyat - (kdvliFiyat / (1 + kdvOran / 100));
			
			kdvHaric = kdvliFiyat / (1 + kdvOran / 100);
			
			 System.out.println("Hesaplanıyor");
		        Thread.sleep(500);
		     System.out.println(".");
		        Thread.sleep(500);
		     System.out.println("..");
		        Thread.sleep(500);
		     System.out.println("...");
		        Thread.sleep(500);
		
		
		
		System.out.println("KDV Miktarı (TL): " + kdvMiktar);
		System.out.println("KDV Hariç (TL): " + kdvHaric);
	
		
	}

}
