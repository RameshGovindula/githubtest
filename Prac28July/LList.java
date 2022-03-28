package Prac28July;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LList {
public static void main(String[] args) {
	LinkedList<String> places=new LinkedList<String>();
	places.add("Sydney");
	places.add("Melbourne");
	places.add("Perth");
	places.add("Hyderabad");
	places.add("Mumbai");
	places.add("Chennai");
	print(places);
	places.add(1,"Kazipet");
	print(places);
	places.remove(2);
	print(places);
}

public static void print(LinkedList<String> ll) {
	Iterator<String> i= ll.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("================");
}
}
