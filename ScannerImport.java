import java.util.Scanner;

public class ScannerImport {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		int a;
		int b;
		System.out.println("1. Sayıyı giriniz");
		a = input.nextInt();
		System.out.println("2. Sayıyı giriniz");
		b = input.nextInt();
		System.out.println(a + b);
	}

}
