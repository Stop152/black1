
public class BreakExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++){
			System.out.println(" Iteration " + i);
			if(i == 5){
				System.out.println("Reached break statement");
				break;
			}
		}
		
		System.out.println("Main app continue work");
	}

}
