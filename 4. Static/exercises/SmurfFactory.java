package exercises;
/* *
 * We have 4 types of Smurf like lady, Papa, left-handy
 * right-handy So we need to make sure only 1 Papa smurf 
 * object shoud create not more than 1 .
 * *
 */
public class SmurfFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf.createSmurf("handy");
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("handy");
	}

}
