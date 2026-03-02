package stackTesting;

import java.util.Arrays;

public class StackArray<E> implements Istack<E> {
	private E[] data;
	int topOfStack = -1;
	private static final int INITIAL_CAPACITY = 10;
	
	public StackArray() {
		data = (E[]) new Object[INITIAL_CAPACITY];
	}
	
	public StackArray(int sz) {
		data = (E[]) new Object[sz];
	}
	private void reallocate() {
		int newSize = data.length * 2;
		data = Arrays.copyOf(data, newSize);
	}

	@Override
	public void push(E val) {
		if(topOfStack == data.length - 1) 
			reallocate();
		
		data[++topOfStack] = val;
	}

	@Override
	public E pop() {
		if(empty())
			return null;
		
		E val = data[topOfStack--];
		return val;
	}

	@Override
	public boolean empty() {
		return topOfStack == -1;
	}

	@Override
	public E peek() {
		if(empty())
			return null;
		
		E val = data[topOfStack];
		return val;
	}

	@Override
	public void display() {
		System.out.println("Contents of the Stack: ");
		for(int i = topOfStack; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}

}
