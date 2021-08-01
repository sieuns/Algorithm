package chap01;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=0;
		int b=0;
		System.out.print("a의 값 ");
		a = scan.nextInt();
		while(true) {
			System.out.print("b의 값 ");
			b = scan.nextInt();
			if(b>a)
				break;
			System.out.println("a보다 큰 값을 입력하세요! ");
		}
		
		int sum = b-a;
		System.out.println("b-a는 "+sum+"입니다. ");
	}

}
