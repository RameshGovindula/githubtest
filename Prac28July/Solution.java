package Prac28July;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	
    	ArrayList<String> Input=new ArrayList<String>();
    	Scanner scanner = new Scanner(System.in);
    	for(int i=0;i<3;i++) 
    		Input.add(scanner.nextLine());
    	int queries=Integer.parseInt(Input.get(2));
    	int NumOfElements=Integer.parseInt(Input.get(0));
    	for(int i=0;i<queries*2;i++)
    		Input.add(scanner.nextLine());
    	
    	List<String> Numbers=Arrays.asList(Input.get(1).split(" "));
    			
    	ArrayList<Integer> num=new ArrayList<Integer>();
    	for(int i=0;i<NumOfElements;i++) {
    		num.add(Integer.parseInt(Numbers.get(i)));
    	}
    	
    	for(int i=3;i<queries*2+3;i++) {
    		if(Input.get(i).equalsIgnoreCase("INSERT")) {
    			++i;
    			num.add(Integer.parseInt(Input.get(i).split(" ")[0]), Integer.parseInt(Input.get(i).split(" ")[1]));
    		}
    		else if(Input.get(i).equalsIgnoreCase("DELETE")){
    			num.remove(Integer.parseInt(Input.get(++i)));
    		}
    	}
    	
    	for(int i=0;i<num.size();i++) {
    		System.out.print(num.get(i));
    		if(i!=num.size()-1) {
    			System.out.print(" ");
    		}
    	}
    	scanner.close();
    }
}
