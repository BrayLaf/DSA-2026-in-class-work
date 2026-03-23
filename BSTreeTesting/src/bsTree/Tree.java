package bsTree;

public class Tree {
	private StudentNode root;
	
	public Tree() {
		setRoot(null);
	}
	public StudentNode getRoot() {
		return this.root;
	}
	public void setRoot(StudentNode root) {
		this.root = root;
	}
	public Boolean isEmpty() {
		return getRoot() == null;
		
//		if(getRoot() == null)
//			return true;
//		return false;
	}
	public String peak() {
		return root.toString();
	}
	
	public void Insert(StudentNode st) {
		if ( st == null)
			return;
		st.setLeft(null);
		st.setRight(null);
		
		if(isEmpty()) {
			root = st;
		}
		else {
			StudentNode cursor = getRoot();
			while(true) {
				StudentNode parent = cursor;
				
				if(st.getId() <= cursor.getId()) {
					cursor = cursor.getLeft();
					if(cursor == null) {
						parent.setLeft(st);
						return;
					}
				}
				else if(st.getId() > cursor.getId()) {
					cursor = cursor.getRight();
					if(cursor == null) {
						parent.setRight(st);
						return;
					}
				}
			}
		}
	}
}