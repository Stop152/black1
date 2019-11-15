
public class ContinueExample {

	public static void main(String[] args) {
		System.out.println("Main app starts here");
		for(int i=1; i<=7; i++){
			if (i == 6 || i == 3) {
				continue;
			}
			System.out.println("Iteration " + i);
		}
		System.out.println("Main app ends here");
	}

}
