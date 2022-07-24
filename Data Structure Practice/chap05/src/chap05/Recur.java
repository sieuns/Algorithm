package chap05;
import java.util.Scanner;



public class Recur {
	
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
		
//재귀적 recur
//		if(n > 0) {
//			recur(n-1);
//			System.out.println(n);
//			recur(n-2);
//		}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = scan.nextInt();
		recur(x);
	}
}
