package CalcTree;

/**
 * Abstrakte Klasse f�r Knoten die bin�ren Operatoren representieren. 
 * Bin�re Operator Knoten sind Knoten mit zwei Nachfolgern.
 */

public abstract class BinaryOperator implements CalcTreeNode{

	protected CalcTreeNode leftChild;
	protected CalcTreeNode rightChild;

	
	
	
	/**
	 * Konstruktor, der einen neuen Bin�ren Operator erstellt. 
	 * @param left linker Nachfolger
	 * @param right rechter Nachfolger
	 */
	public BinaryOperator(CalcTreeNode left, CalcTreeNode right){
		this.leftChild = left;
		this.rightChild = right;

	}
	

	
}
