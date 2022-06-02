import java.util.Scanner;

public class HW_1_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//100을 입력하면 100이하의 모든 소수를 출력하는 프로그램
		//1~100 까지 모두 본다 -> 소수인지 아닌지 -> 만약 소수이면 출력 아님말
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Input your number for primeTest -> ");
	int num = scan.nextInt();
	for(int i=2; i<=num; i++) {
		if(isPrime(i)) {
			System.out.print(i +" ");
		}
	}

	
	
	}//main

	public static boolean isPrime(int n) {
		
		boolean b = true; //initialize
		
		//hint: 5 -> 2 3 4 
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				b = false;
				break; //escape the loop!
			}
		}
		
		return b;
	
	} //isPrime
	
}
