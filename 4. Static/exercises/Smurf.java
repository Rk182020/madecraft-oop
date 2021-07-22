package exercises;

public class Smurf {

	private String name;
	private static Smurf papaSmurf;


	public static Smurf createSmurf(String name) {
		if(name == "Papa"){
			/* *
			 * We have 4 types of Smurf like lady, Papa, left-handy
			 * right-handy So we need to make sure only 1 Papa smurf 
			 * object should create not more than 1.
			 * *
			 */
			if(papaSmurf == null)
				papaSmurf = new Smurf(name);
			else
				return papaSmurf;
		}
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
