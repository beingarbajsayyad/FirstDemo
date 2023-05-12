package javaoops;

public class ThisDemo {

	int a;
	void getdata() {
		a= 10;
	}
	
	
	void display() {
		getdata();
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo obj = new ThisDemo();
		obj.display();
	}

}
