package com.acceture.lecture16;

public class WarriorApp {

 
	public static void main(String[] args) {
		 
		Warrior w1=new Warrior("Bobby", 50);
		w1.restoreHealth (10);
		System.out.println(w1);
		w1.restoreHealth (10);
		System.out.println(w1);		
		w1.recievedDamage(80);
		System.out.println(w1);
		w1.restoreHealth (10);
		System.out.println(w1);
		
		
	}

}