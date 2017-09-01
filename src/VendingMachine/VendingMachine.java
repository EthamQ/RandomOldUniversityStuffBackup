package VendingMachine;
import java.awt.Frame;

public class VendingMachine {


	
	public static void main(String[] args) {

		Frame getränkeAutomat = new Frame();

	}
	
	
	
	/**
	 * activates the electricity
	 */
	public static void startElectricity(String ingredient){
		//TODO: add functionalities
		if(ingredient.equals("Vodka")){
			System.out.println("Start electricity Vodka");
		}
		
        if(ingredient.equals("Cola")){
        	System.out.println("Start electricity Cola");
		}
	}
	
	/**
	 * stops the electricity
	 */
	public static void stopElectricity(String ingredient){
		//TODO: add functionalities
        if(ingredient.equals("Vodka")){
        	System.out.println("Stop electricity Vodka");
		}
		
        if(ingredient.equals("Cola")){
        	System.out.println("Stop electricity Cola");
		}
	}
	
	
	
}
