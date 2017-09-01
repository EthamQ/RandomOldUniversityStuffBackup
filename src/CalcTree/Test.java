package CalcTree;

public class Test {

	/**
	 * Generates a CalcTree, calculates the result and writes the tree to the console in post-, pre- and in-order.
	 */
	public static void main(String[] args) {
		CalcTreeNode tree = new MultiplicationOperator(new PlusOperator(new MinusOperator(new Value(4),new Value(5)), new Value(3)), new DivisionOperator(new Value(8), new Value(2)));
		System.out.println("Tree: "+"CalcTreeNode tree = new MultiplicationOperator(new PlusOperator(new MinusOperator(new Value(4),new Value(5)), new Value(3)), new DivisionOperator(new Value(8), new Value(2)));");
		System.out.println("inOrder: "+tree.inOrderString());
		System.out.println("preOrder: "+tree.preOrderString());
		System.out.println("postOrder: "+tree.postOrderString());
		System.out.println("Rechnung: "+"((4-5)+3)*(8/2))");
		System.out.println("Ergebnis: "+tree.eval());
	
	}

}
