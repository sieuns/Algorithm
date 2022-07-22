package chap04;

import chap04.IntStack.EmptyIntStackException;
import chap04.IntStack.OverFlowIntStackException;

//하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스를 만드세요.
//스택에 저장하는 데이터는 int형 값으로 배열의 처음과 끝을 사용하세요 .
public class Q3 {
	
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverFlowIntStackException extends RuntimeException {
		public OverFlowIntStackException() {}
	}
	
	public Q3(int capacity) {
		ptrA = 0;
		ptrB = capacity-1;
		max = capacity;
		try {
			stk = new int[max];
		}catch (OutOfMemoryError e) {
			max =0;
		}
	}
	
	public int push(int C,int x) throws OverFlowIntStackException {
		if(ptrA >= ptrB+1)
			throw new OverFlowIntStackException();
		else {
			if(C == 1) {
				return stk[ptrA++] = x;
			}else if(C == 2)
				return stk[ptrB--] = x;
		}
		return x;
	}
	
	public int pop(int C) throws EmptyIntStackException{
		int x = 0;
		switch (C) {
		case 1:
			if (ptrA <= 0) // 스택 A가 비어 있음
				throw new EmptyIntStackException();
			x = stk[--ptrA];
			break;
		case 2:
			if (ptrB >= max - 1) // 스택 B가 비어 있음
				throw new EmptyIntStackException();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	
	public int peek(int C) throws EmptyIntStackException{
		int x = 0;
		switch (C) {
		case 1:
			if (ptrA <= 0) // 스택 A가 비어 있음
				throw new EmptyIntStackException();
			x = stk[ptrA - 1];
			break;
		case 2:
			if (ptrB >= max - 1) // 스택 B가 비어 있음
				throw new EmptyIntStackException();
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}
}
