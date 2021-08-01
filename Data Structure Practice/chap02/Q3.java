package chap02;

public class Q3 {
	
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			}return (sum);
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		
		System.out.println("배열의 모든 요소의 합계는 "+sumOf(num)+"입니다.");
		
		

	}

}
