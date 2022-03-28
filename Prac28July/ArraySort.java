package Prac28July;

import java.util.*;

public class ArraySort {
public static int[] getIntegers(int number) {
	int[] num=new int[number];
	Scanner scanner=new Scanner(System.in);
	for(int i=0;i<num.length;i++) {
		num[i]=scanner.nextInt();
	}
	return num;
}

public static void printArray(int[] num) {
	for(int i=0;i<num.length;i++)
		System.out.println(num[i]);
	int a=Integer.parseInt("3");
}

public static int[] sortIntegers(int[] num) {
	int[] sortedArray=new int[num.length];
	for(int i=0;i<num.length;i++) {
		sortedArray[i]=num[i];		
	}
	boolean flag=true;
	int temp;
	while(flag) {
		flag=false;
		for(int i=0;i<sortedArray.length-1;i++) {
			if(sortedArray[i]<sortedArray[i+1]) {
				temp=sortedArray[i];
				sortedArray[i]=sortedArray[i+1];
				sortedArray[i+1]=temp;
				flag=true;
			}
		}
	}
	return sortedArray;
}

public static void main(String[] args) {
	printArray(sortIntegers(getIntegers(5)));
}
}
