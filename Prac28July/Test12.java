package Prac28July;

import java.util.Scanner;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

public class Test12 {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=0,t=0;
		while(a>0) {
			b=a%10;
			t=t*10+b;
			a=a/10;
		}
		System.out.println(t);
		//int[][] ab= new int[3][4]; 
		// TODO Auto-generated method stub
		//Checking new brach
		for(int i=0;i<10;i++) {
			for(int k=0;k<10-i;k++) {
			System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" "+Math.sqrt(36));
		scanner.close();
	}
	
}
