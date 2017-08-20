import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetExam {

	public static void main(String[] args) {
		Set<String> cities = new HashSet<String>();
		
		cities.add("Dhaka");
		cities.add("Jessore");
		cities.add("Khulna");
		cities.add("Khulna");
		cities.add("Dinajpur");
		
		System.out.println(cities);
		
		Set<Integer> tree = new TreeSet<Integer>();
		
		tree.add(5);
		tree.add(1);
		tree.add(4);
		tree.add(2);
		
		System.out.println(tree);
		

	}

}
