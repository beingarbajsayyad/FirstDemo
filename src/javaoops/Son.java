package javaoops;

public class Son extends Child {

	public void pen() {
		System.out.println("pen");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Son ref = new Son();
		
		ref.farm();
		ref.Home();
		ref.pen();
	}

}
