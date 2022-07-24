//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

package BOJ;
import java.util.Scanner;

public class BOJ_10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수열의 갯수 N과 정수 X를 입력하세요. : ");
		int N = scan.nextInt();
		int X = scan.nextInt();
//		System.out.print(N + "," + X);
		System.out.print("수열을 입력하세요.:");
		int[] A = new int[N];
		for(int i = 0;i < N; i++) {
			A[i] = scan.nextInt();
		}
		for(int i = 0; i < N; i++) {
			if(A[i] < X)
				System.out.print(A[i]+" ");
		}
	}
}
