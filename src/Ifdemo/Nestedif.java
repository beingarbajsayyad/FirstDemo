package Ifdemo;

public class Nestedif{
	public static void main (String []args) {
		
	int age = 20;
	
	String gender = "Male";
	boolean isRegistered = true;
	if (age > 18) {
		System.out.println("You are eligible");	
		if (gender=="male") {
			System.out.println("Your are invited");
			if(isRegistered==true) {
				System.out.println("You have account");
			}
		}else {
			System.out.println("You are not invited");
		}
		}else {
			System.out.println("You are not eligible");
		}
	}
}















