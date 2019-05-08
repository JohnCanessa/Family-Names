package family.names.canessa;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class Person {
	
	// **** members ****
	String name;
	Person mother;
	Person father;
	
	List<String> names = null;
	
	// **** constructor ****
	public Person(String name, Person mother, Person father) {
		this.name 	= name;
		this.mother = mother;
		this.father = father;
	}
	
	// **** constructor ****
	public Person() {
		this.names = new ArrayList<String>();
	}
	
	// **** traversal ****
//	public void traversal(Person p, List<String> names) {
	public void traversal(Person p) {
		
		// **** terminate recursion ****
		if (p == null)
			return;

		// ???? display node ????
		System.out.println("traversal <<< p.name ==>" + p.name + "<==");
		
		// **** visit left node (e.g., mother) ****
//		traversal(p.mother, names);
		traversal(p.mother);
		
		// **** save name ****
		names.add(p.name);

		// **** visit right node (e.g., father) ****
//		traversal(p.father, names);
		traversal(p.father);
	}
	
	// **** get list of names ****
	public List<String> getNames() {
		return this.names;
	}

}
