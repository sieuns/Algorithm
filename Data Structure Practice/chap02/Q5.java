package chap02;


public class Q5 {
	static void rcopy(int[]a, int[] b) {
		for(int i=0;i<a.length;i++) {
			a[i] = b[b.length-i-1];
		}
		
	}

	public static void main(String[] args) {
		
		int[] numb= {1,2,3,4,5};
		int[] numa = {0,0,0,0,0};
	
		rcopy(numa,numb);
		
		for(int i=0;i<numa.length;i++) {
		System.out.print(numa[i]); 
		}
		

	}

}
