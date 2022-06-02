import java.util.Scanner;

public class c_0 {
	
	public static void main(String[] args) {
		
		//variables
		
		char c = 'A';
		String s = "Hello World asdf";
		double d = 3.14;
		boolean b_1 = true;		
		
		int m; //declaration
		m =1;
		
		char a; //d
		a = 'B'; //a
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(d);
		System.out.println(b_1);
		
		System.out.println("Hello, World");
		
		
		
		//exchange of values
		
		int n1 = 10;
		int n2 = 20;
		
		System.out.println(n1);
		System.out.println(n2);
		
		int t = n1;
		n1 = n2;
		n2 = t; //swap -> we have to declare new variable t
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		
		//Operator		
		
		String s1 = "Hello ";
		String s2 = "World";
		String s3 = s1+s2;
		System.out.println(s3);
		
		int m1 = 30;
		int m2 = 40;
		int m3 = m1+m2;
		double b1 = 3.14;
		double b2 = 0.001592;
		double b3 = b1+b2;
		
		
		
		//numeric : int, double, long, float, byte, short
		//size difference
		int i1 = 2147483647; //-2^31 ~ 2^31-1
		long l1 = Long.MAX_VALUE;
		System.out.println(l1); //2^63-1
		
		
		//efficiency
		//1. size - less memory
		//2. run time
		
		// I/O
		
		int num;
		Scanner xerox = new Scanner(System.in);
		System.out.println("Enter you number -> ");
		
		num = xerox.nextInt();
		System.out.println(num);
		
		String s_1;
		s_1 = xerox.next();
		
		
		
		
		
		int num1;
		System.out.println("Enter you number -> ");
		num1 = xerox.nextInt();
		
		// even or odd???
		if(num1%2 == 0) System.out.println("even");
		else {System.out.println("odd");}
		
		
		int x;
		System.out.println("What is your number?");
		x = xerox.nextInt();
		if(x%2==0) {
			System.out.println("even");
		}
		else {
		System.out.println("odd");
	}

}
}