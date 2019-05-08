package family.names.canessa;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class Solution {
	
	// **** get the names for a person ****
	static private void getNames(Person p, List<String> names) {
		
		// **** termination condition ****
		if (p == null)
			return;
		
		// **** add the name of this person ****
		names.add(p.name);
		
		// **** check the mother branch ****
		getNames(p.mother, names);
		
		// **** check the father branch ****
		getNames(p.father, names);
	}
	

	// **** get all names starting with this person ****
	static List<String> getAllNames(Person p) {
		
		// **** ****
		ArrayList<String> names = new ArrayList<String>();
		
		// ???? display name for starting person ????
		System.out.println("<<< starting name: " + p.name);

		// **** get all names starting here (recursive call) ****
		getNames(p, names);
		
		// **** ****
		return names;
	}
	
	
	/*
	 * Test scaffold
	 */
	public static void main(String[] args) {

		// **** small family ****
		Person fred = new Person(	"Fred",
									new Person("Edna", null, null),
									new Person("Ed", null, null));

		Person wilma = new Person(	"Wilma",
									new Person("Pearl", null, null),
									null);
		
		Person pebbles = new Person("Pebbles",
									wilma,
									fred);
		
		
		// **** get all names starting with this person ****
//		List<String> names = getAllNames(fred);
//		List<String> names = getAllNames(wilma);
//		List<String> names = getAllNames(pebbles);

		Person p = new Person();
		p.traversal(pebbles);						// fred, wilma or pebbles
		List<String> names = p.getNames();

		
		// **** display the name(s) ****
		for (String name : names) {
			System.out.println(name);
		}
		
	}

}
