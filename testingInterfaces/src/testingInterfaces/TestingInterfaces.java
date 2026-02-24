package testingInterfaces;

public class TestingInterfaces {

	public static void main(String[] args) {
		IShape iObj;
		
		iObj = new Square();
		System.out.println(iObj.getArea());
	}

}
