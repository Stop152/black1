class Argument {
	
	boolean man;
	double length;
	String name;

	void darbiba() {
		System.out.println(man + name + " is " + length + " high");
	}
}

public class Notclear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Argument clare = new Argument();

		clare.man = false;
		clare.length = 170.5;
		clare.name = "Clare";
		clare.darbiba();
	}

}