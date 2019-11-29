package com.acceture.lecture16;

public class Warrior {

	private String name;
	private int health;
	private int damagePower;

	public Warrior(String name, int health) {
		this.name = name;
		this.health = health;

	}

	public Warrior(String name, int damagePower, int health) {
		this.name = name;
		this.health = health;
		this.damagePower = damagePower;

	}

	public int getDamagePower() {
		return damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void fight(Warrior warrior) {

		if (this.isAlive() && warrior.isAlive()) {

			this.recievedDamage(warrior.getDamagePower());
			warrior.recievedDamage(this.getDamagePower());

		}
		if (!this.isAlive()) {
			System.out.println("The warrior " + name
					+ " is dead! Congratulations for the winner "
					+ warrior.name + " ! ");
			
		} else if (!warrior.isAlive()){
			System.out.println("The warrior " + this.name
					+ " is dead! Congratulations for the winner "
					+ name + " ! ");
		}
	}

	public boolean isAlive() {
		if (health > 0) {
			return true;
			// System.out.println("The warrior is alive");
		} else {
			return false;
		}

	}

	public void recievedDamage(int damagePower) {
		if (!isAlive()) {
			System.out.println("The warrior " + name + " is dead!!!! ");
		} else {
			System.out.println(this + " get damaged with  " + damagePower);
			if ((this.health - damagePower) < 0) {
				this.health = 0;
			} else {
				this.health = health - damagePower;
			}
		}
	}

	public void restoreHealth(int healthVar) {

		if (isAlive()) {
			// System.out.println("The warrior is dead!!!! ");

			if ((this.health + healthVar) > 100) {
				this.health = 100;
				System.out.println("The warrior is 100% fine!!!! ");
			} else {

				this.health = health + healthVar;
			}

		} else
			System.out.println("The warrior is dead!!!! ");

	}

	@Override
	public String toString() {
		// if (health <= 0);{
		// health = 0;
		// }
		return "Warrior " + name + "' s " + "health is " + health;
	}
}
