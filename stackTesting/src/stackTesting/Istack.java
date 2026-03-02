package stackTesting;

public interface Istack<E> {
	
	void push(E val);
	E pop();
	boolean empty();
	E peek();
	void display();
	
}
