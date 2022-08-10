package chap06;
import java.util.Scanner;
import java.util.Arrays;
//Arrays.sort 메서드를 사용하여 정렬합니다. (퀵 정렬)

public class ArraysSortTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수：");
		int nx = scan.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = scan.nextInt();
		}

		Arrays.sort(x);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);

	}

}
