package chap06;
import java.util.Scanner;

public class Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a,int n) {
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d：\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				ccnt++;
				
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요솟수: ");	
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i] = scan.nextInt();
		}
		
		bubbleSort(x, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
	}
}
