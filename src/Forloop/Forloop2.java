package Forloop;
import java.util.Scanner;
public class Forloop2 extends Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //    for(int i=1; i<=10;i++) {
   // 	  System.out.println("I value is "+i);
   // 	for(int j=1; j<=5; j++) {
   // 		System.out.println(j);
  //  	 }
  //     }
		System.out.println("Enter max loop value");
	Scanner scan = new Scanner (System.in);
	int userVal = scan.nextInt();
	for(int i=0; i<=userVal;i++) {
		System.out.println(i);
	}
	
	}

}


