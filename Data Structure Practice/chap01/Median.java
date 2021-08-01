package chap01;
import java.util.Scanner;

public class Median {
	static int med3 (int A, int B, int C) {
		if(A > B) 
			if(A > C)
				 if(B > C) 
					 return B;
				else if(B < C)
					return C;
			else 
				return A;
		else if(A < B) 
			if(A > C) 
				return A;
			else if(A < C) 
				if(B < C) 
					return B;
				else 
					return C;
	
			
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다. ");
		System.out.print("a의 값 ");
		int a = scan.nextInt();
		System.out.print("b의 값 ");
		int b = scan.nextInt();
		System.out.print("c의 값 ");
		int c = scan.nextInt();
		
		System.out.println("중앙값은 "+ med3(a,b,c) +"입니다. ");
		

	}

}
