import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;


public class HW_2 {

	public static void main(String[] args) throws IOException { 
		
		//괄호열 문제  
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
		//Buffer Reader 는 line 단위로 가공, 많은 양의 데이터를 받을 때 더 쉬움.  
		System.out.println("Enter your number for Q1 -> ");
		int n = Integer.parseInt(br.readLine()); 
		System.out.println("Enter your parenthesis -> ");
		while(n-->0) {  // post fix -, n이 계속 감소, 그게 0이 되기 전까지.
			boolean isVPS = true; 
			String input = br.readLine(); 
			Stack<Character> stack = new Stack<Character>(); // 
			char temp; 
			for(int i=0; i<input.length(); i++) { 
				temp = input.charAt(i); 
				if(temp == '(') { // 여는 괄호는 스택에 push하여 담는다. 
					stack.push(temp); 
				}
				else if(temp == ')') { 
					// 닫는 괄호가 나온경우 스택의 맨 위의 값이 여는괄호인지 비교한다. 
					if(!stack.isEmpty()) { 
						// 스택이 비어있지 않고 맨위값이 여는 괄호라면 스택의 맨 위값을 pop한다. 
						stack.pop(); 
						}
						else { 
						isVPS = false; 
						break; 
						} 
					} 
				} 
		
				if(!stack.isEmpty()) isVPS = false; 
				
				if(isVPS) { 
					System.out.println("YES");			
				}else { 
					System.out.println("NO"); 
					} // end while } }​
			}
		
		//괄호열 using String
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean b = true;
		int m = 0;
		for(int i1=0; i1<input.length(); i1++) {
			if(input.charAt(i1)=='(') m++;
			else if(input.charAt(i1) ==')') {
				if(m!=0) m--;
				else {
					b = false;
					break;
				}
			}
		}
		if(b) System.out.println("Yes");
		else System.out.println("N0");
			
			
		//요시푸스 문제  	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter your number for Q2 -> ");
		StringBuilder sb = new StringBuilder("<");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken()) - 1;

        for(int i1=1;i1<=n1;i1++) {
        		list.add(i1);
        }
        
        int index = 0;
        
        while(!list.isEmpty()) {
	        	index += m1;
	        	
	        	if (index >= list.size()) {
	        		index %= list.size();
	        	}
	        	
	        sb.append(list.remove(index) + ", ");	
        }
        System.out.println(sb.toString().substring(0, sb.length()-2) + ">");
        
        //상근이 설탕배달  
        System.out.println("Enter your number for Q3 -> ");
            int input1 = 0; 
            int count = 0;
            Scanner sc = new Scanner(System.in);
            input1 = sc.nextInt();
            
            while(true) {
                if (input1 % 5 ==0) {
                    System.out.println(input1/5 + count);
                    break;
                }else if(input1 <= 0) {
                    System.out.println(-1);
                    break;
                }
                input1 = input1-3;
                count++;
            }
          
            
            
            
        }

	
}



