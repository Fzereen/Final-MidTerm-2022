package datastructure;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

 Map<Integer,String> map = new HashMap () ;
map.put(1,"New york");
map.put(2,"Sylhet");
map.put(3,"Khulna");
map.put(4,"Tangail");
map.put(5,"Dhaka");
System.out.println(map);
System.out.println(map.get(3));
for(Map.Entry entry : map.entrySet()) {
	System.out.println(entry.getKey() + " " + entry.getValue());

}
	}

}
