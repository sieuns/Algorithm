package BOJ;
import java.util.Scanner;

public class BOJ_1264 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		while(true)
		{
			s = scan.nextLine();
			if(s.equals("#"))
				break;
			int count = 0;
			
			for(int i=0;i<s.length();i++) {
				if(
					s.charAt(i) == 'a' 
					|| s.charAt(i) == 'e' 
					|| s.charAt(i) == 'i' 
					|| s.charAt(i) == 'o' 
					|| s.charAt(i) == 'u' 
					|| s.charAt(i) == 'A' 
					|| s.charAt(i) == 'I'
					|| s.charAt(i) == 'O'
					|| s.charAt(i) == 'U')
					count ++;
			}
			System.out.println(count);
		}
	}
}
	
