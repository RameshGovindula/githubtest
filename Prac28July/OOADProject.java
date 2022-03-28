package Prac28July;


public class OOADProject extends Thread {
public static void main(String[] args) {
	
}


public void run() {
	String ou="";
	for(int k=2;k<10000;k++) {
		int flag=0;
	for(int i=2;i<=Math.sqrt(k);i++) {
		if(k%i==0) {
			flag=1;
			break;
		}
		}
	if(flag==0) {
		ou=ou+" "+k;
	}
}
	System.out.println(ou);
}
}
