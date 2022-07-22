package chap04;

public class IntStack {
	//스택 최대용량
	private int max;
	//스택 포인터
	private int ptr;
	//스택 본체
	private int[] stk;
	
	//스택이 비어있을때 예외처리
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//스택이 가득차있을때 예외처리
	public class OverFlowIntStackException extends RuntimeException {
		public OverFlowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}catch (OutOfMemoryError e) {
			max =0;
		}
	}


	public int push(int x) throws OverFlowIntStackException {
		if(ptr >= max)
			throw new OverFlowIntStackException();
		return stk[ptr++] = x;
 	}
	 
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr-1;i>=0;i--)
			if(stk[i] == x)
				return i;
			return -1;
	}
	
	public void clear() {
		ptr =0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0 ;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i=0; i<ptr;i++ ) {
				System.out.println(stk[i] +" ");
			}
		}
	}

}