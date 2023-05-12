package Ifdemo;

public class Ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price = 20000;
		
		
		if (price>5000 & price <9000) {
		
			System.out.println("purchase LENOVO laptop");
		}
	    
		else if(price >1000 & price<15000) {
		
			System.out.println("purchase REDMI mobile");
		}
		else if (price>15000 & price<25000) {
			System.out.println("purchase SAMSUNG monile");
		}
	
		else if (price>25000 & price <50000) {
			System.out.println("purchase ONEPLUS mobile");
		}
	
		else {
			System.err.println("do not purchase");
		}
	}
} 