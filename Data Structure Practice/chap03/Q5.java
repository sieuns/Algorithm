package chap03;
import java.util.Scanner;
public class Q5 {
	static int binSearchX(int[] a,int n,int key) {
		int pl=0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				for(;pc >= pl;pc--)
					if(a[pc-1] < key)
						break;
					return pc;
			}
			else if(a[pc]<key)
				pl = pc+1;
			else if (a[pc]>key)
				pr = pc-1;
			}while (pl <= pr);
		return -1;
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = scan.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); 
		x[0] = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("찾는 값："); 
		int ky = scan.nextInt();

		int idx = binSearchX(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
	}
}
