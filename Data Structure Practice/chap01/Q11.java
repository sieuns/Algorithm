package chap01;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=0;
		System.out.println("양의 정수를 입력하세요. ");
		n = scan.nextInt();
		
		int sum=0;
		while(n>0) {
			n=n/10;
			sum++;
		}
		System.out.println("그 수는 "+sum+"자리 입니다.");

	}

}
