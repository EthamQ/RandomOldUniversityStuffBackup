
public class QueueInArray extends StackInArray {
	
	//The head of queue 1 is on the left of the array and the head of queue 2 is on the right of the array.
	//Tail 1 is on the right of head 1 and tail 2 is on the left of head 2(if there are elements)
	private int head1;
	private int tail1;
	private int head2;
	private int tail2;


	
	public QueueInArray(int n){
		super(n);
		tail1 = -1;
		head1 = 0;
		tail2 = length;
		head2= length-1;
	}
	
	@Override
	public boolean isFull(){
		return isFull1()||isFull2();
		}
	public boolean isFull1(){
		return elements1 >= (length/2-1);
		}
	public boolean isFull2(){
		return elements2 >= (length/2-1);
		}
	
	
	//just for the correct name
	public void put(int queue, Object value){
		push(queue, value);
	}
	

	@Override
	public void push(int queue, Object value) {
		if (queue < 1 || queue > 2) {
			throw new IllegalArgumentException();
		}
		
		else{
		if (queue == 1) {
			if(isFull1()){
				throw new UnsupportedOperationException("Überlauf");
			}
			array[++tail1] = value;
			elements1++;
		}

		if (queue == 2) {
			if(isFull2()){
				throw new UnsupportedOperationException("Überlauf");
			}
			array[--tail2] = value;
			elements2++;
		}
		}
	}
	
	//just for the correct name
	public Object get(int stack) {
		return pop(stack);
	}
	
	/**
	 * returns the value of the head, sets the head equal null.
	 * The head of queue 1 is on the left of the array and the head of queue 2 is on the right of the array.
	 * If queue equal 1 then it shifts every element of queue 1 one position to the left.
	 * If queue equal 2 then it shifts every element of queue 2 one position to the right.

	 */
	@Override
	public Object pop(int queue) {
		if (queue < 1 || queue > 2) {
			throw new IllegalArgumentException();
		}

		Object ret = null;

		if (queue == 1) {
			if (isEmpty1()) {
				throw new NullPointerException();
			}
			ret = array[head1];
			array[head1] = null;
			elements1--;
			shift(1);
			return ret;
		}

		if (queue == 2) {
			if (isEmpty2()) {
				throw new NullPointerException();
			}
			ret = array[head2];
			array[head2] = null;
			elements2--;
			shift(2);
			return ret;

		}

		else
			return null;
	}
	
	/**
	 * If queue equal 1 then it shifts every element of queue 1 one position to the left.
	 * If queue equal 2 then it shifts every element of queue 2 one position to the right.
	 */
	private void shift(int queue){
		if(queue == 1){
			for(int i = head1; i<tail1; i++){
				Object temp = array[i+1];
				array[i] = temp;;
			}
			array[tail1] = null;
		}
		
		if(queue == 2){
			for(int i = head2; i>tail2; i--){
				Object temp = array[i-1];
				array[i] = temp;;
			}
			array[tail2] = null;
		}
		
	}
}
