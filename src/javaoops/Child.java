package javaoops;

public class Child extends Parent{

	public void Home () {
		System.out.println("flat");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child ref = new Child();
		ref.farm();
		ref.Home();
	
	}

}
