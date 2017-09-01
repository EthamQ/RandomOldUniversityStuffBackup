
public class InsertionSort {

	
	public static void main(String[] args){
		int[] a = new int[]{13, 4, 2, 16, 22, 1};
		print(a);
		System.out.println("");
//		print(merge(a,0,1,2));
		insertionSort(a);
		print(a);
	}
	
	public static void print(int[] a){
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i]+",");
		}
	}

	
	public static int[] insertionSort(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
		return a;
	}
	
	public static void selectionSort(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length - 1; i++) {
			boolean foundNewMin = false;
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					index = j;
					foundNewMin = true;
				}
			}
			if(foundNewMin){
			swap(a, i, index);
			}
		}

	}
	
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static int[] merge(int[] a, int lowIndex, int midIndex, int highIndex){
		int[] ret = new int[highIndex];
		
		if(lowIndex==0 && highIndex==2){
			if(a[0] < a[1]){
				ret[0] = a[0];
				ret[1] = a[1];
			}
			else{
				ret[0] = a[1];
				ret[1] = a[0];
			}
			return ret;
		}
		
		
		
		int limit = midIndex;
		int i = 0;
		boolean fillLeft = false;
		boolean fillRight = false;
		boolean end = false;
		while(!(lowIndex == limit) && !(midIndex == a.length)){
			
			
		if(a[lowIndex] < a[midIndex]){
			ret[i++] = a[lowIndex];
			lowIndex++;
		}
		else{
			ret[i++] = a[midIndex];
			midIndex++;
		}
		
		if(lowIndex == limit){
			fillRight = true;
		    end = true;
	}
		
		if(midIndex == highIndex-1){
			fillLeft = true;
		    end = true;
	}
	
		}
		if(i != ret.length-1){
		while(i<ret.length){
			if(fillLeft){
			ret[i++] = a[lowIndex++];
			}
			if(fillRight){
				ret[i++] = a[midIndex++];
				}
		}
		}
		
		return ret;
	}
}
