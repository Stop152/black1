package com.acceture.lecture16;

public class Warrior {

	private String name;
	private int health;

	public Warrior(String name, int health) {
		this.name = name;
		this.health = health;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	private boolean isAlive() {
		if (health > 0) {
			return true;
			// System.out.println("The warrior is alive");
		} else {
			return false;
		}

	}

	public void recievedDamage(int damage) {
		if (!isAlive()) {
			System.out.println("The warrior is dead!!!! ");
		} else {
			if ((this.health - damage) < 0) {
				this.health = 0;
			}

			else {
				this.health = health - damage;
			}
		}
	}

	public void restoreHealth(int healthVar) {

		if (isAlive()) {
			// System.out.println("The warrior is dead!!!! ");

			if ((this.health + healthVar) > 100) {
				this.health = 100;
				System.out.println("The warrior is 100% fine!!!! ");
			}
			else {
				
				this.health = health + healthVar;
			}				
			

		} else
			System.out.println("The warrior is dead!!!! ");

	}

	@Override
	public String toString() {
		return "Warrior " + name + "' s " + "health is " + health;
	}
}
