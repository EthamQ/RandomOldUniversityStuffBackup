import java.lang.reflect.Array;
import java.util.Arrays;

class Node{
	int value;
	Node next;
}


public class List {
		
	private Node head;
	
	public List(){
		head = null;
	}
	
	//testing the methods in the main class
	public static void main (String[] args){
		List l = new List();
		System.out.println("Method insert(): ");
		l.insert(1);
		l.insert(5);
		l.insert(8);
		l.printList();
		System.out.println("\n Method insert(value, pos): ");
		l.insert(10,2);
		l.printList();
		l.insert(20,4);
		l.printList();
		System.out.println("\n Method delete(): ");
		l.delete();
		l.printList();
		System.out.println("\n Method delete(pos): ");
		l.delete(2);
		l.printList();
		System.out.println("\n --Adding elements to the list--");
		l.insert(7);
		l.insert(33);
		l.insert(-4);
		l.printList();
		System.out.println("\n Method reverse(): ");
		l.reverse();
		l.printList();
		System.out.println("\n Method sort(): ");
		l.sort();
		l.printList();
	}
	
	/**
	 * Gibt den Wert des ersten Elementes zurŸck.
	 * Ist die Liste leer so wird 0 zurŸckgegeben.
	 * 
	 * @return Wert des ersten Elements
	 */
	public int getFirst(){
		if(head != null)
			return head.value;
		else 
			return 0;
	}
	
	/**
	 * Gibt zurŸck, ob die Liste leer ist.
	 * @return true falls die Liste leer ist.
	 */
	public boolean empty(){
		return head == null;		
	}
	
	
	
	/**
	 * FŸgt ein neues Element am Anfang der Liste ein.
	 * 
	 * @param value Wert der eingefŸgt wird.
	 */
	public void insert(int value){
		Node newHead = new Node();
		newHead.value = value;
		if(!empty()){
		newHead.next = this.head;
		}
		this.head = newHead;
	}
	
	/**
	 * FŸgt ein Element an der gegebenen Position ein.
	 * Wenn die Position grš§er ist als die LŠnge der Liste 
	 * wird das Element am Ende der Liste eingefŸgt.
	 * 
	 * @param value	Wert der eingefŸgt werden soll
	 * @param pos Position an der eingefŸgt werden soll.
	 */
	public void insert(int value, int pos){
	
		Node newNode = new Node();
		newNode.value = value;
		
		if(pos > getLength()){
			if(empty()){
				this.head = newNode;
			}
			else getLastNode().next = newNode;
		}
		
		else if(pos == 1){
			insert(value);
		}
		
		else{
		Node current = this.head;
		for(int i = 2; i < pos; i++){
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		}
	}
	
	/**
	 * (Additional) returns the length of the list
	 */
	public int getLength(){
		
		if(!empty()){
		int length = 1;
		Node current = this.head;
		while(current.next != null){
			current = current.next;
			length++;
		}
		return length;
		}
		else return 0;
	}
	
	
	/**
	 * 
	 * @return (Additional)returns the last Node of a list, 
	 * if the list is empty returns null
	 */
	public Node getLastNode(){
		if(empty()){
			return null;
		}
		Node current = this.head;
		while(current.next != null){
			current = current.next;
		}
		return current;
	}
	
	/**
	 * 
	 * @return returns the Node at the position pos-1
	 */
	public Node getNodeBeforePosition(int pos){
		if(!empty() && (pos > 1) && (pos <= getLength()+1)){
		Node current = this.head;
		for(int i = 1; i < pos-1; i++){
			current = current.next;
		}
		return current;
		}
		return null;
	}
	
	/**
	 * 
	 * @return (Additional) returns the value of the Node at the position pos
	 */
	public int getValueAtPosition(int pos){
		if(empty()){
			throw new NullPointerException("The list appears to be empty");
		}
		if(pos <= 0 || pos > getLength()){
			throw new IllegalArgumentException();
		}
		Node current = this.head;
		if(pos == 1){
			return this.head.value;
		}
		if(pos == getLength()){
			return getLastNode().value;
		}
		else{
		for(int i = 1; i < pos; i++){
			current = current.next;
		}
		return current.value;
		}
		
		
	}
	
	/**
	 * (Additional) prints the values of the list in the console
	 */
	public void printList(){
		if(!empty()){
		Node current = this.head;
		String ret = "["+this.head.value;
		while(current.next != null){
			current = current.next;
			ret += ", "+current.value;
		}
		System.out.println(ret+"]");
	}
		else{
			System.out.println("[]");
		}
	}
	
	
	/**
	 * Lšscht das erste Element aus der Liste, falls dieses
	 * vorhanden ist. 
	 */
	public void delete(){
		if(!empty()){
			Node newHead = head.next;
			head.next = null;
			head = newHead;
		}
	}
		
	/**
	 * Lšscht das Element an der gegebenen Position.
	 * Wenn die Liste kŸrzer ist als die angegebene Position
	 * wird kein Element gelšscht.
	 */ 
	public void delete(int pos){
		if(pos < 1){
			throw new IllegalArgumentException("position has to be bigger than 1");
		}
		if(!empty()){
		if(pos == 1){
				delete();
			}
		else if(getLength() == pos){
			Node current = getNodeBeforePosition(pos);
			current.next = null;
		}
		
		else if(getLength() > pos){
		Node current = getNodeBeforePosition(pos);
		Node delete = current.next;
		current.next = current.next.next;
		delete.next = null;
		}
		}
		
	}
	
	
	/**
	 * Dreht die Liste um
	 */
	public void reverse(){
		int lastPos = getLength();
		List ret = new List();
		for(int i = 1; i<=lastPos; i++){
		ret.insert(getValueAtPosition(i));
		}
		this.head = ret.head;

	}
	
	
	/**
	 * Sortiert die Liste der Integer aufsteigend.
	 */
	public void sort(){
		if(!empty()){
		int[] array = new int[getLength()];
		List sorted = new List();
		Node current = this.head;
		int i = 0;
		
		//fill the array with the int values of the list and sort the array
		while(current != null){
			array[i++] = current.value;
			current = current.next;
		}
		Arrays.sort(array);
		
	    //add the values of the sorted array to the new list
		for(int j = array.length-1; j >= 0; j--){
			sorted.insert(array[j]);
		}
		this.head = sorted.head;
		}
	}
	

	
	
}
