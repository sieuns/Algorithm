package chap04;

import chap04.IntQueue.EmptyIntQueueException;
import chap04.IntQueue.OverFlowIntQueueException;

public class Q7 {
	private int[] que;
	private int max;
	private int front;
	private int rear;
	//큐가 비어있을때 num = 0 가득 찼을때 num = max 
	private int num;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverFlowIntQueueException extends RuntimeException {
		public OverFlowIntQueueException() {}
	}

	public Q7(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int frontEnque(int x) throws OverFlowIntQueueException{
		if(num >= max) 
			throw new OverFlowIntQueueException();
		num++;
		if (--front < 0)
			front = max-1;
		que[front] = x;
		return x;
	}
	
	public int rearEnque(int x) throws OverFlowIntQueueException{
		if(num >= max) 
			throw new OverFlowIntQueueException();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	public int frontDeque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	public int rearDeque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		num--;
		if(--rear < 0)
			rear = max - 1;
		return que[rear];
	}
	
	public int frontPeek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	public int rearPeek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); 
		return que[rear == 0 ? max - 1 : rear - 1];
	}

}
