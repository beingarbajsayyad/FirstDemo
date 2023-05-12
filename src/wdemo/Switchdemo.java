package wdemo;
import java.util.Scanner;
public class Switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter user age");
		int age=10;
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		switch (age){
		case 10:
			System.out.println("User age is 10");
		case 20:
			System.out.println("User age is 20");
		case 30 :
			System.out.println("User age is 30");
			break;
			default:
			System.out.println("User age is not matching with any case");

		
		}
		
    }
}
	
