class Employee {

	double salary;
	double totalMoney;
	String name;
	String work;
	boolean status;

	String info() {
		return "The " + name + " salary is increased by " + salary
				+ "  The total earned amonut is  " + totalMoney;
	}

	String infostop() {
		return "The employee " + name + " is fired!!!!";
	}

	public void doJob() {
		if (status = true);{
		totalMoney = totalMoney + salary;}
		
		//else {
			//System.out.println("The employee " + name + " is fired!!!!");
		//}
	}

	public Employee(String name) {
		// this(name, "", 0.0);
		this.name = name;
	}

	public Employee(String name, String work, double salary) {
		this.work = work;
		this.name = name;
		this.salary = salary;
		// common logic for all employees
	}

	public void giveThanksForGoodJob() {
		System.out.println("Thank you dear " + name);
	}

	public void fireSomebody() {
		if (status == true) {
			System.out.println("You are fired dear " + name);
		}
	}

	public void letsFire() {
		status = true;
	}

	public static void main(String[] args) {
		// Employee wrong = new Employee();
		Employee he = new Employee("John", "cook", 1000);
		Employee she = new Employee("Anna", "cook", 1500);

		for (int i = 0; i < 12; i++) {
			he.doJob();
			she.doJob();
		}

		System.out.println(he.info());
		System.out.println(she.info());

		she.giveThanksForGoodJob();
		he.letsFire();
		he.fireSomebody();
		she.doJob();
		System.out.println(she.info());
		System.out.println(he.infostop());
	}
}