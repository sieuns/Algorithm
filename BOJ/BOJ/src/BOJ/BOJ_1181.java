//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

package BOJ;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1181 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String[] A = new String[N];
		
		//개행 제거
		scan.nextLine();
		
		for(int i = 0;i < N;i++) {
			A[i] = scan.nextLine();
		}
		
		//HashSet으로 중복 제거
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(A));
		//중복 제거된 배열로 다시 변경
		String[] AResult = hashSet.toArray(new String[0]);
		
		Arrays.sort(AResult, new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				if(s1.length() == s2.length())
					return s1.compareTo(s2);
				else
					return s1.length() - s2.length();			
				}
		});

		for(int i=0;i<AResult.length;i++) {
			System.out.println(AResult[i]);
		}
	}

}
