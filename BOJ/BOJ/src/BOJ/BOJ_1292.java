package BOJ;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1292 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum=0;

        for(int i=0; i<1000; i++) {
            for(int j=0; j<=i; j++) {
                list.add(i + 1); 
            }
        }

        for(int i=a-1; i<=b-1; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
