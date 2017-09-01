package CalcTree;

/**
 * Abstrakte Klasse für Knoten die binären Operatoren representieren. 
 * Binäre Operator Knoten sind Knoten mit zwei Nachfolgern.
 */

public abstract class BinaryOperator implements CalcTreeNode{

	protected CalcTreeNode leftChild;
	protected CalcTreeNode rightChild;

	
	
	
	/**
	 * Konstruktor, der einen neuen Binären Operator erstellt. 
	 * @param left linker Nachfolger
	 * @param right rechter Nachfolger
	 */
	public BinaryOperator(CalcTreeNode left, CalcTreeNode right){
		this.leftChild = left;
		this.rightChild = right;

	}
	

	
}
