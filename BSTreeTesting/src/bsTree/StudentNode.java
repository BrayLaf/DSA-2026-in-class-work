package bsTree;

public class StudentNode {
	private int id;
	private String name;
	private StudentNode left, right;
	
	public StudentNode (String name, int id) {
		setId(id);
		setName(name);
		setLeft(null);
		setRight(null);
		
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentNode getLeft() {
		return this.left;
	}
	public void setLeft(StudentNode left) {
		this.left = left;
	}
	public StudentNode getRight() {
		return this.right;
	}
	public void setRight(StudentNode right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return name + ", " + id;
	}
}
