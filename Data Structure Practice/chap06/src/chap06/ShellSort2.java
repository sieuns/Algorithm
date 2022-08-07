package chap06;
import java.util.Scanner;

public class ShellSort2 {

	static void shellSort(int[] a, int n) {
		int h;
		for(h=1;h<n/9;h=h*3+1);
		
		for(;h>0;h/=3)
			for(int i=h;i<n;i++) {
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j] > tmp;j-=h)
					a[j+h] = a[j];
				a[j+h] = tmp;
			}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("셸 정렬(버전2)");
		System.out.print("요솟수: ");	
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i] = scan.nextInt();
		}
		
		shellSort(x, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
	}

}
