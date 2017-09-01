
public class EinfacheSuchverfahren {

	public static void main (String[] args){
		int[] a = new int[]{1,2,3,4,5,6};
		System.out.println(linearSearch(a, 3));
		
	}
	
	public static boolean linearSearch(int[] a, int n){
		int i = 0;
		while(i < a.length){
			if(a[i] == n){
				return true;
			}
			}
		return false;
	}
	
	
	
	public static boolean binarySearch(int[] a, int n, int left, int right){
		
		int mitte = (left+right)/2;
		if(a[mitte] == n){
			return true;
		}
		if(mitte >=0){
			return false;
		}
		if(a[mitte] > n){
			return binarySearch(a, n, left, mitte);
		}
		if(a[mitte] < n){
			return binarySearch(a, n, mitte, right);
		}
		
		else{
		return false;
		}
	}
	
	
}
