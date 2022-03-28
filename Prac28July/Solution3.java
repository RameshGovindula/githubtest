package Prac28July;

import java.util.*;

public class Solution3 {
	 public static boolean canWin(int leap, int[] game) {
	        // Return true if you can win the game; otherwise, return false.
		 int i=0;
		 try {
		 for(int k=0;k<=100;k++) {
			 if(i!=game.length-1&i+leap<game.length) {
				 if(game[i+leap]==0) {
					 i+=leap;
				 }
				 else if(game[i+1]==0) {
					 i=i+1;
				 }
				 else if(game[i-1]==0) {
					 i=i-1;
				 }
				 else {
					 return false;
				 }
				 }
			 else if(i==game.length-1|i+leap>=game.length)
				 return true;
		 }
		 
		 return false;
		 }catch(ArrayIndexOutOfBoundsException e) {
			 if(i==0)
				 return false;
			 else
				 return true;
		 }
		 catch(Exception e) {
			 //System.out.println(e);
			 return false;
		 }
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
}
