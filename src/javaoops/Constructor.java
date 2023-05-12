package javaoops;

public class Constructor {
      
	int a, b;
	 

	Constructor(){
		System.out.println("ARSH");
	}
	
	Constructor(int a ){
		System.out.println("ARSHI");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Constructor var1 = new Constructor(20);
	    Constructor var = new Constructor ();
	}

}
