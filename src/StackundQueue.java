
public class StackundQueue {

	public static void main (String[] args){
		StackInArray stack = new StackInArray(10);
		//push erster Stack
		System.out.println("push erster Stack");
	    stack.push(1, 2);
	    stack.push(1, 4);
	    stack.push(1, 3);
	    stack.push(1, 9);
	    stack.push(1, 8);
	    stack.print();
	    
	    //push zweiter Stack
	    System.out.println("\n push zweiter Stack");
	    stack.push(2, 24);
	    stack.push(2, 45);
	    stack.push(2, 36);
	    stack.push(2, 97);
	    stack.print();
	    
	    //pop erster Stack
        System.out.println("\n pop erster Stack");
	    System.out.println(stack.pop(1));
	    System.out.println(stack.pop(1));
	    stack.print();
	    
	    //pop zweiter Stack
	    System.out.println("\n pop zweiter Stack");
	    System.out.println(stack.pop(2));
	    System.out.println(stack.pop(2));
	    stack.print();
	    
	    
	    QueueInArray queue = new QueueInArray(10);
		//put erste Queue
		System.out.println("\n\n put erste Queue");
		queue.put(1, 2);
		queue.put(1, 4);
		queue.put(1, 3);
		queue.put(1, 9);
		queue.print();
	    
	    //push zweite Queue
	    System.out.println("\n put zweite Queue");
	    queue.put(2, 24);
	    queue.put(2, 45);
	    queue.put(2, 36);
	    queue.put(2, 97);
	    queue.print();
	    
	    //get erste Queue
        System.out.println("\n get erste Queue");
	    System.out.println(queue.get(1));
	    System.out.println(queue.get(1));
	    queue.print();
	    
	    //get zweite Queue
	    System.out.println("\n get zweite Queue");
	    System.out.println(queue.get(2));
	    System.out.println(queue.get(2));
	    queue.print();
//	    
//		stack.push(1, 2);
//		stack.push(1, 3);
//		stack.push(1, 4);
//		stack.push(1, 5);
//		stack.push(1, 100);
//		stack.print();
//		stack.push(1, 2);
//		stack.push(1, 3);
//		stack.push(1, 4);
//		stack.push(1, 5);
//		stack.push(1, 100);
//		stack.print();
//		System.out.println(stack.pop(1));
//		System.out.println(stack.pop(1));
//		System.out.println(stack.pop(1));
//		System.out.println(stack.pop(1));
//		System.out.println(stack.pop(1));
//		System.out.println("");
//		stack.push(2, 44);
//		stack.push(2, 33);
//		stack.print();
//		stack.push(2, 77);
//		stack.push(2, 55);
//		stack.push(2, 10);
//		stack.print();
//		System.out.println(stack.pop(2));
//		System.out.println(stack.pop(2));
//		stack.print();
		
//		Queue q = new Queue(10);
//		q.push(1, 2);
//		q.push(1, 3);
//		q.push(1, 2);
//		q.push(1, 2);
//		
//	
//		q.print();
//		System.out.println(q.pop(1));
//		q.print();
//		System.out.println(q.pop(1));
//		q.print();
//		System.out.println(q.pop(1));
//		q.print();
//		System.out.println(q.pop(1));
//		q.print();
//		q.push(2, 8);
//		q.push(2, 6);
//		q.push(2, 2);
//		q.push(2, 3);
//		q.print();
//		System.out.println(q.pop(2));
//		System.out.println(q.pop(2));
//		q.print();
	
	
		
		
	
		

		
	
		

		
	
		

		
		
	}
	
	
}
