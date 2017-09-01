
public class StackInArray {
	Object[] array;
	private int top1;
	private int top2;
	
	//counter for the number of elements in the stacks
	protected int elements1;
	protected int elements2;
	
	//length of the stack (=n)
	protected int length;

	public StackInArray(int n) {
		length = n;
		array = new Object[length];
		init(n);
	}
	
	public void init(int n){
		//the values -1 and n just make it easier to count in the push method 
		//than using 0 and n-1 (++top1 and --n)
		top1 = -1;
		top2 = n;
		elements1 = 0;
		elements2 = 0;
	}
	
	/**
	 * @return returns true if the entire stack is empty
	 */
	public boolean isEmpty(){
		return elements1+elements2 == 0;
	}
	
	/**
	 * @return returns true if the first stack is empty
	 */
	public boolean isEmpty1(){
		return elements1== 0;
	}
	
	/**
	 * @return returns true if the second stack is empty
	 */
	public boolean isEmpty2(){
		return elements2 == 0;
	}
	
	/**
	 * @return returns true if the elements of both stacks are >= the length of the array
	 */
	public boolean isFull(){
	return (elements1 + elements2) >= length;
	}
	
	public void print(){
		String ret = "";
		for(int i = 0; i<length; i++){
		ret += array[i] + ", ";
		}
		System.out.println(ret);
	}
	


	public void push(int stack, Object value) {
		if (stack < 1 || stack > 2) {
			throw new IllegalArgumentException();
		}
		
		else if(isFull()){
			throw new UnsupportedOperationException("Überlauf");
		}
		
		else{
		if (stack == 1) {
			array[++top1] = value;
			elements1++;
		}

		if (stack == 2) {
			array[--top2] = value;
			elements2++;
		}
		}
	}

	public Object pop(int stack) {
		if (stack < 1 || stack > 2) {
			throw new IllegalArgumentException();
		}

		Object ret = null;

		if (stack == 1) {
			if (isEmpty1()) {
				throw new NullPointerException();
			}
			ret = array[top1];
			array[top1] = null;
			top1--;
			elements1--;
			return ret;
		}

		if (stack == 2) {
			if (isEmpty2()) {
				throw new NullPointerException();
			}
			ret = array[top2];
			array[top2] = null;
			top2++;
			elements2--;
			return ret;

		}

		else
			return null;
	}

}
