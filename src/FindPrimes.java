
public class FindPrimes {
	
	
	public static void main(String[] args){
		
		printArray(primes(100));
		
	}
	

	//fill the boolean[] array with true starting at the index 2
	public static boolean[] init(boolean[] b){
		for(int i = 2; i < b.length; i++){
			b[i] = true;
		}
		return b;
	}
	
	//print out the index and the corresponding boolean value in the console
	public static void printArray(boolean[] b){
		for(int i = 0; i < b.length; i++){
			System.out.println(i +" "+ b[i]);
		}
	}
	

	//sets every multiple of the index in the array to false
	public static void setFalse(boolean[] b, int index){
		int n = b.length;
		for(int i = 2; index*i < n; i++){
			b[index*i] = false;	
		}
	}
	
	
	//the method to determine the primes 
	//if a boolean is true it uses the setFalse method
	public static boolean[] primes(int n){
		//create and initialize the array
		boolean[]ret = new boolean[n];
		init(ret);
		
		//determine the primes
		for(int i = 2; i <= Math.sqrt(n); i++)
		if(ret[i]){
			setFalse(ret, i);
			
		}
		return ret;
	}
	
	


}
