package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double[] scores = new double[num];
		
		for(int i=0;i<num;i++) {
			scores[i] = scan.nextInt();
		}
		
		Arrays.sort(scores);
		double M = scores[num-1];
		double sum = 0.0;
		
		for(int i=0;i<num;i++) {
			sum += (scores[i] / M) * 100;
		}
		System.out.println(sum/num);
	}
}
