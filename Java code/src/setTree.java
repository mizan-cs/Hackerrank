import java.util.Set;
import java.util.TreeSet;


public class setTree {

	public static void main(String[] args) {
		Set<Person> persons = new TreeSet<Person>();
		
		persons.add(new Person("Mizan"));
		persons.add(new Person("Apon"));
		persons.add(new Person("Nishat"));
		persons.add(new Person("Shanto"));
		
		for(Person person: persons){
			System.out.println(person);
		}

	}

}
