import java.util.Scanner;

public class ÜsAlma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Üs Alınacak Sayı :");
		int n = sc.nextInt();
		
		System.out.print("Üs Olacak Sayı :");
		int k = sc.nextInt();
		int result = 1;
		
		// 3^4 = 3 * 3 * 3
		int i =1;
		while (i <= k) {
			result *=n;
			i++;
		}
		System.out.println("Sonuç : " + result);

	}

}
