
public class DrivingRules {

	private final String name;
	private String description;

	private static String country = "Latvia";

	private static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;

	static int amount = 0;

	public DrivingRules(String name) {
		this(name, null);
		// System.out.println("Drviving rule " + name);
		// amount++;

	}

	public DrivingRules(String name, String description) {
		this.name = name;
		this.description = description;
		amount++;
		System.out.println("Drviving rule " + name + "desc " + description);
	}

	public static void main(String[] args) {
		DrivingRules rule1 = new DrivingRules("Speed limit in the city ");
		DrivingRules rule2 = new DrivingRules("Speed limit outside the city ", "Drivers should to drive " + MAX_SPEED_OUTSIDE_CITY + " KM/H");
		// TODO Auto-generated method stub

		System.out.println("Total amount of driving rules "
				+ DrivingRules.amount);

	}

}
