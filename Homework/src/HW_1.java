import java.util.Scanner;

public class HW_1 {

	private static final int i = 0;


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1) Prime Number
	
		System.out.print("Input your number for primeTest -> ");
		int n = scan.nextInt();
		System.out.println(primeTest(n));
		
		//2) Pyramid
		
		System.out.print("Input your number for pyramid -> ");
		int p = scan.nextInt(); 
		pyramid(p);
	
	}


	public static boolean primeTest(int n) {
		
		boolean b = true; //initialize
			
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				b = false;
				System.out.print(i+" / ");			
		}
			
			}
		return b;
	}
		
	public static void pyramid(int p) {
		

		for(int i=p; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}		
	    
		return;
		
	}
}
