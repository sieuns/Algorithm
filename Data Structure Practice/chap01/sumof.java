package chap01;
import java.util.Scanner;

public class sumof {
	static int sumbet (int A, int B) {
		int sum=0;
		if (A>B) {
			for(int i =B; i<= A; i++) {
				sum = sum+i;
			}return sum;
		}else if(A<B) {
			for(int i=A;i<=B;i++) {
				sum=sum+i;
			}return sum;
		}return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 개의 숫자를 입력하세요. ");
		System.out.print("a의 값 ");
		int a = scan.nextInt();
		System.out.print("b의 값 ");
		int b = scan.nextInt();
		
		
		System.out.println("a와 b사이의 정수의 합" +sumbet(a,b)+ "입니다. ");
	
	}

}
