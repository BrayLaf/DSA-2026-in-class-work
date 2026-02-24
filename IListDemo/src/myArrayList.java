import java.util.Arrays;

public class myArrayList implements IList {
	
	private int [] data;
	private int sz = 0;
	private static final int DEFAULT_SIZE = 5;
	private int maxSize = DEFAULT_SIZE;
	
	public myArrayList() {
		this.sz = 0;
		data = new int[maxSize];
	}
	
	private void resizeCapacity() {
		int newSize = maxSize * 2;
		data = Arrays.copyOf(data, newSize);
		maxSize = newSize;
	}
	@Override
	public void add(int value) {
		if(sz == maxSize)
			resizeCapacity();
		data[sz] = value;
		sz++;
	}

	@Override
	public void clear() {
		data = null;
		sz = 0;
		maxSize = DEFAULT_SIZE;
		data = new int [maxSize];
	}

	@Override
	public int indexof(int value) {
		for(int i = 0; i < sz; i++) {
			if(data[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public int get(int index) {
		
		if(index >= 0 && index < sz)
			return data[index];
		
		return -1;
	}

	@Override
	public int remove(int index) {
		int val = -1;
		if(index >= 0 && index < sz) {
			val = data[index];
			for(int i = index; i < sz; i++)
				data[i] = data[i + 1];
			sz--;
			if(sz*2 < maxSize) {
				int newSize = maxSize/2;
				data = Arrays.copyOf(data, newSize);
				maxSize = newSize;
			}
		}
		return 0;
	}

	@Override
	public int size() {
		
		return sz;
	}

}
