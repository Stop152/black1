package com.accenture.lecture13;

import java.util.Scanner;

public class Practice {
	
	static int arrayEl;
	static int[] userArray = new int [3];
	

	//task 1
	public static void sayHi() {
		System.out.println("Hello world");

	}

	//task 2
	public static void printArray(int[] myArrays) {
		for (int i = 0; i < myArrays.length; i++) {
			System.out.println(i + " element is " + myArrays[i]);
		}
	}
//task 7
	public static void printArray1(int[] myArrays) {
		int i = 0;
		for (int number: myArrays) {
			System.out.println("Elements number is " + i + " The element is " +number);
			i++;
		}
	}
	//task 3
	public static int getSum(int[] someArray) {
		int sum = 0;

		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}

		return sum;

	}
//task 4
	public static int getAvarege(int[] someArray) {

		int sum = 0;
		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}

		int average = sum / someArray.length;

		return average;
	}
	//task 6
	public static int getAvarege1(int[] someArray) {

		int average = getSum(someArray) / someArray.length;

		return average;
	}
//task 4.1
	public static int getMaxValue(int[] someArray) {

		int maxEl = 0;
		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] > maxEl) {
				maxEl = someArray[i];
			}
		}

		return maxEl;

	}
    //task 4.2
	public static double getAvaregeDouble(int[] someArray) {

		int sum = 0;
		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}

		double average = sum / someArray.length;

		return average;
	}

	//task 5
	public static int[] getArrayDefinedByUser(int arrayEl) {
		
		for (int i=0; i<userArray.length; i++){
		System.out.println("Enter number  ");
		Scanner userinput1 = new Scanner(System.in);
		arrayEl = userinput1.nextInt();
		
		userArray[i] = arrayEl;
		}
		return userArray;

		}
		
	//task 8
	public int[] getOurArray(int arrayLength) {
		System.out.println("Enter array size  ");
		Scanner userinput2 = new Scanner(System.in);
		arrayLength = userinput2.nextInt();
		
		int[] ourArray = new int [arrayLength];
		
		
		System.out.println("Your array will be " + arrayLength + " long");
		return ourArray;
		
		//CONTINUE AT HOME :-) 
		

	}
	
	
	//MAIN
	public static void main(String[] args) {

		sayHi();
		sayHi();
		System.out.println();

		int[] myArrays = new int[10];
		for (int i = 0; i < myArrays.length; i++) {
			myArrays[i] = i * 2;
		}
//		printArray(myArrays);
//		System.out.println();
//
//		int sum = getSum(myArrays);
//		System.out.println("Sum is " + sum);
//
//		System.out.println();
//
//		int avarege = getAvarege(myArrays);
//		System.out.println("Avarege is " + avarege);
//
//		System.out.println();
//		
//		int avarege1 = getAvarege1(myArrays);
//		System.out.println("Avarege is " + avarege1);
//
//		System.out.println();
//
//		int maxValue = getMaxValue(myArrays);
//		System.out.println("Max value = " + maxValue);
//
//		System.out.println();
//
//		double getAverageDouble = getAvaregeDouble(myArrays);
//		System.out.println("Avarege double is " + getAverageDouble);
//
//		System.out.println();
//		
//		getArrayDefinedByUser(arrayEl);
//		printArray(userArray) ;
//		
//		System.out.println();
//		
		printArray1(myArrays) ;

	}

		
	
		

		// Task 8 - create your own method, which
		// - at first, will ask user how big array he wants to create *you will
		// need to use Scanner class
		// - after user should enter in console value for each element of an
		// array
		// - at the end array should be printed out into console *you can reuse
		// already existing method printArray()
		// Possible console content:
		// Enter array size:
		// 4
		// Enter value of each array element:
		// 5
		// 2
		// 1
		// 12
		// 0 element is 5
		// 1 element is 2
		// 2 element is 1
		// 3 element is 12

		// Task 8.1 - rewrite your program, that Scanner object would be
		// initialized only once in your program
		// * hint, think about making Scanner instance(object) as a class static
		// field and refer to it in your code

	}

	
	
