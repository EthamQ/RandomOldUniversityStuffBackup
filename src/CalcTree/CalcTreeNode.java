package CalcTree;

/** 
 * Interface für Knoten des Operatorbaums 
 */

public interface CalcTreeNode {

	/**
	 * Wertet den Operatorbaum aus, der an diesem Knoten beginnt und gibt das Ergebnis zurück. 
	 * @return Ergebnis der Auswertung
	 */
	public int eval();
	
	/**
	 * Gibt den Operatorbaum als String in Preorder-Darstellung zurück.
	 * @return Preorder-Darstellung des Operatorbaums
	 */
	public String preOrderString();
	
	/**
	 * Gibt den Operatorbaum als String in Postorder-Darstellung zurück.
	 * @return Postorder-Darstellung des Operatorbaums
	 */
	public String postOrderString();
	
	/**
	 * Gibt den Operatorbaum als String in Inorder-Darstellung zurück.
	 * @return Inorder-Darstellung des Operatorbaums
	 */
	public String inOrderString();
	
	
		
}
