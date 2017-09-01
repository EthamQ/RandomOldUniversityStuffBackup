package VendingMachine;

public abstract class Drink {

	//name of the drink
	private String name;
	
	//ingredients
	protected String nameDrink1;
	protected String nameDrink2;
	
	//seconds for each drink
	protected int timeDrink1;
	protected int timeDrink2;
	
	/**
	 * 
	 * @param drink: depending on the drink you chose it will have different time variables 
	 * and different ingredients
	 */
	public Drink(String name){
	this.name = name;
	}
	
	//setters & getters
	public String getName() {
		return name;
	}
	
	public String getDrink1() {
		return nameDrink1;
	}

	public String getDrink2() {
		return nameDrink2;
	}

	
	public int getTimeDrink1() {
		return timeDrink1;
	}

	public int getTimeDrink2() {
		return timeDrink2;
	}

}
