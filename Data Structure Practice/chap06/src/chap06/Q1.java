package chap06;
import java.util.Scanner;

public class Q1 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++)
				if(a[j] > a[j+1])
					swap(a,j,j+1);
		}
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
