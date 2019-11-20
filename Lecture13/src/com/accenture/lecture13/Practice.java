package com.accenture.lecture13;

public class Practice {

	public static void sayHi() {
		System.out.println("Hello world");

	}

	public static void printArray(int[] myArrays) {
		for (int i = 0; i < myArrays.length; i++) {
			System.out.println(i + " element is " + myArrays[i]);
		}
	}

	public static int getSum(int[] someArray) {
		int sum = 0;

		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}

		return sum;

	}

	public static int getAvarege(int[] someArray) {
		// TODO implement method, that it will return average of all elements of
		// array 'someArray'
		int sum = 0;
		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}

		int average = sum / someArray.length;

		return average;
	}

	public static void main(String[] args) {

		sayHi();
		sayHi();
		System.out.println();

		int[] myArrays = new int[10];
		for (int i = 0; i < myArrays.length; i++) {
			myArrays[i] = i * 2;
		}
		printArray(myArrays);

		int sum = getSum(myArrays);
		System.out.println("Sum is " + sum);

		// Task 3 - getAvarege() should return average of all elements of passed
		// array
		// Here you should get printed out into console: Average is 9
		int avarege = getAvarege(myArrays);
		System.out.println("Avarege is " + avarege);

		// Task 4.1 - declare method getMaxValue(), it should return biggest
		// element value of array
		// You should get printed out into console: Maximum is 18.0
		// int max = getMaxValue(myArrays);
		// System.out.println("Maximum is " + max);

		// Task 4.2 - declare method getAvaregeDouble(), it should return sum of
		// all elements of passed array
		// You should get printed out into console: Average is 9.0
		// double doubleAvarege = getAvaregeDouble(myArrays);
		// System.out.println("Avarege double value is " + doubleAvarege);

		// Task 5 - getArrayDefinedByUser() - should ask user to fill array of 3
		// elements and return that array
		// Possible console content:
		// Enter 3thy:
		// 3
		// 6
		// 7
		// 0 element is 3
		// 1 element is 6
		// 2 element is 7
		int[] myIntegers = getArrayDefinedByUser(3);
		// printArray(myIntegers);

		// Task 6 - make sure getAvarege() and getAvaregeDouble() methods uses
		// getSum() method
		// their shouldn't have duplicated logic with sum() method

		// Task 7 - rewrite printArray() to use enhanced loop

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

	public static int[] getArrayDefinedByUser(int numbers) {
		System.out.println("Enter " + numbers + "thy:");
		// TODO implement method, according to requirements of Task 8
		return null;
	}

}