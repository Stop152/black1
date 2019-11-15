public class SwitchBasics {

	public static void main(String[] args) {
		int expression = 3;
		int result = 0;
		switch (expression){
		case 1:
			if (expression == result){
				break;
			}
			result++;
		case 2:
			if (expression == result){
				break;
			}
			result++;
		case 3:
			if (expression == result){
				break;
			}
			result++;
		default:
			result++;
		}
		
		System.out.println(result);
	}
}
