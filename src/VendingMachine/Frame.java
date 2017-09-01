package VendingMachine;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Frame extends JFrame {
	
	private JLabel status;
	private JButton b_VodkaCola;
	

	
	public Frame(){
		//creating a new JFrame with the obligatory methods
		super("Vending machine");
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setSize(300, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );
		this.setVisible(true);
		
		//creating the JLabel
		status = new JLabel("Chose a drink");
		this.add(status);
		addVodkaColaButton();
		
		
		
		
	}
	
	
	public void addVodkaColaButton(){
		b_VodkaCola = new JButton("Vodka-Cola");
		b_VodkaCola.addActionListener(new Listener());
		this.add(b_VodkaCola);	
	}
	

	static int i=0;
	/**
	 * 
	 * @param drink: Create an object Drink with the name of the drink you want to mix.
	 * Drink(String drink)
	 * available Strings for "String drink" so far: "VodkaCola"
	 */
	public void mix(Drink drink){
		//names of the ingredients
		String drink1 = drink.getDrink1();
		String drink2 = drink.getDrink2();
		
		//creating a timer that updates every second
		Timer t = new Timer( 1000, null);
		t.addActionListener(new ActionListener(){
	  public void actionPerformed( ActionEvent e ) {
		  
		//start electricity drink1
	    if(i==0){
	    status.setText("Filling with: " + drink1);
	    VendingMachine.startElectricity(drink1);
	    }
	    
	  //stop electricity drink1
	  //start electricity drink2
	    int time1 = drink.getTimeDrink1();
	    if(i == time1){
	    	VendingMachine.stopElectricity(drink1);
	        VendingMachine.startElectricity(drink2);
	    	status.setText("Filling with: " + drink2);
	    	 status.repaint();
	    }
	    
	    //stop electricity drink2
	    int time2 = drink.getTimeDrink2();
	    if(i == time1+time2){
	    	VendingMachine.stopElectricity(drink2);
	    	status.setText("Enjoy!");
	    	 status.repaint();
	    }
	    
	    //stop the timer and reset i
	    if(i == time1+time2+3){
	    	status.setText("Chose a drink");
	    	 status.repaint();
	    	 System.out.println("stoptimer");
	    	 i=-1;
	    	 t.stop();
	    }
	    System.out.println(i++);
	  }
	});
	t.start();  
	}
	
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == b_VodkaCola){
				mix(new VodkaCola());
				
			}
		}
		
	}
}
