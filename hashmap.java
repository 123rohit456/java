package assignment;
import java.util.HashMap;

public class ass1 {
	public static void main(String args[]){
		HashMap<String, Integer> name = new HashMap<String, Integer>();
		name.put("Rohit", 1);
		name.put("Manas", 2);
		name.put("Divij", 3);
		System.out.println(name.size());
		System.out.println(name);
		
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Rohit", 70);
		marks.put("Manas", 75);
		marks.put("Divij", 80);
		System.out.println(marks.size());
		System.out.println(marks);
		
	}
}
