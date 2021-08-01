package chap01;
import java.util.Scanner;

public class Q17 {
	static void npira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(i-1)*2+1;k++) {
				System.out.print(i%10);
				
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 피라미드 단의 갯수를 입력하세요. ");
		int num = scan.nextInt();
		
		npira(num);
		
		

	}

}
