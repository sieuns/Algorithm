package chap05;

import java.util.Scanner;

public class Q2 {
	static int Q2(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}return x;
		
	}

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구하겠습니다.");
		
		System.out.print("정수를 입력하세요 :");
		int x = scan.nextInt();
		System.out.print("정수를 입력하세요 :");
		int y = scan.nextInt();
		
		System.out.println("최대 공약수는 " + Q2(x,y) + "입니다. ");
	}

}
