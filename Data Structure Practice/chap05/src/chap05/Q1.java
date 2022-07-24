package chap05;
import java.util.Scanner;

public class Q1 {
	
	static int Q1(int n) {
		int m = 1;
		for(int i=n;i>0;i--) {
			m = m * n--;
		}return m;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = scan.nextInt();
		
		System.out.println(x+"의 팩토리얼은 "+Q1(x)+"입니다.");
		

	}

}
