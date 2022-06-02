import java.util.Scanner;

public class HW_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

	   //HW 1 단어의 개수
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter you words -> ");
	   String input = sc.nextLine().trim(); // trim 은 앞뒤에 있는 공백들을 다 없애주는 장치 
	   
	   if (input.isEmpty()) {
	   System.out.println(0);
	   } 
	   else {
	            System.out.println(input.split(" ").length); //split: ~~을 기준으로 chunk 를 해주겠다는 의미
	   }
		
		//HW 2 숫자의 
		
		System.out.println("Enter you number -> ");
		int x = sc.nextInt();
		System.out.println("Enter your series of number -> ");
		String y = sc.next();
		int result = 0;
				        
        
		for(int i=0; i<x; i++) {
			result += Integer.parseInt(y.substring(i, i+1));
				        }       
		System.out.println(result);
		
		
		//HW3 알파벳 s 분별  
			
		System.out.println("Enter you word -> ");
		String s = sc.next();
		if (contains('s')) {
		System.out.print(" 1 ");
		}
		else {
		System.out.print(" -1 ");	
		sc.close(); // 메모리 소모를 막기 위해 스캐너를 사용하지 않겠다고 선언.  
		}
	}
	
	private static boolean contains(char c) {
		// TODO Auto-generated method stub
		return false;
	}
}


// HW4
// 3 ABC --> AAABBBCCC
// 5 AB --> AAAAABBBBBB
// 