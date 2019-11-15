
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter an index (1-12) for the month you are looking for: ");

	    String result = scanner.nextLine();
	    int monthIndex = Integer.parseInt(result);
	    String month = "blank";
	    	   		
		switch(monthIndex){
		case 1:
			month = "January";
			break;
		case 2:
			month = "February.";
			break;
		case 3:
			month = "March.";
			break;
		case 4:
			month = "April.";
			break;
		case 5:
			month = "May.";
			break;
		case 6:
			month = "June.";
			break;
		case 7:
			month = "July.";
			break;
		case 8:
			month = "August.";
			break;
		case 9:
			month = "September.";
			break;
		case 10:
			month = "October.";
			break;
		case 11:
			month = "November.";
			break;
		case 12:
			month = "December.";
			break;
		default:
			month = "blank";
			
			
		}
		if (month != "blank"){
		System.out.println("The month you are looking for is " + month);
		} else{
			System.out.println("The month you are looking for is not valid. Please state a number from 1-12.");
		}
		
		
		int indexOfADay = 3;
		String day = "blank";
		
		switch(indexOfADay){
		case 1:
			day = "Monday";
		case 2:
			day = "Tuesday.";
		case 3:
			day = "Wednesday.";
		case 4:
			day = "Thursday.";
		case 5:
			day = "Friday.";
		case 6:
			day = "Saturday.";
		case 7:
			day = "Sunday.";
		default: 
			day = "blank";
		}
		if (day != "blank"){
			System.out.println("These are the days:" + day);
			} else{
				System.out.println("The days you are looking for are not valid. Please state a number from 1-7.");
			}
		
		scanner.close();
	}

}
