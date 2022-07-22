package chap04;

import java.util.Scanner;

public class Q3Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(64);


		while(true) {
			System.out.println("현재 데이터 수 : "+s.size() + " / "+ s.capacity());
			System.out.print("스택을 선택하세요. A -> 1  B -> 2 : ");
			int C = scan.nextInt();
			System.out.print("");
			System.out.print("(1)푸시 (2)팝 (3)피크 (0)종료 : ");
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x=scan.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverFlowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}break;
				
			case 4:
				s.dump();
				break;
			}
		}
	}
}
