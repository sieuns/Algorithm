package chap03;
import java.util.Arrays;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = scan.nextInt();
		int[] x = new int[num]; 

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); 
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]); 
		}

		System.out.print("찾는 값：");
		int ky = scan.nextInt();

		int idx = Arrays.binarySearch(x, ky); 
		
		
		if(idx < 0) {
			int point = idx;
			System.out.println("그 값의 요소가 없습니다. ");
			System.out.printf("삽입 포인트는 %d입니다.",point);
		}
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다. ");
		
	}
}
