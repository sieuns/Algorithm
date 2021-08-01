package chap02;
import java.util.Scanner;
import java.util.Random;

public class Q01 {
	static int maxof(int[] a) {
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}return max;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 나타내려고 합니다.");
		
		int n = random.nextInt(20);
		
		int[] height = new int[n];
		for(int i=0;i<n;i++) {
			height[i] = 100+random.nextInt(90);
			System.out.println("height[i] = "+height[i]);
		}
		
		System.out.println("키의 최댓값은 "+maxof(height)+"입니다. ");
	}

}
