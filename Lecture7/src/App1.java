
class User {
	// fileds
	String name;
	int age;
	boolean man;
	int salary;
	 
		
	void sayHello(){
		System.out.println("Hello, my name is " + name + "my salary is " + salary);
	}
	
	String name = "Peter";
	int age = 21;
	boolean man = false;		
	
	
	String name1 = "Anna";
	int age2 = 22;
	boolean man2 = true;		User peter = new User();
	
	peter.name = "Peter";
	peter.age = 21;
	peter.man = true;	
	peter.salary = 300;
	peter.sayHi();	
	peter.sayHello();