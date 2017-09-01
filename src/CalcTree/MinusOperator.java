package CalcTree;

public class MinusOperator extends BinaryOperator{
	
	

	
	/** 
	 * Erzteugt einen neuen Minus Operator mit den čbergebenen Nachfolgern.
	 * 
	 * @param left linker Nachfolger
	 * @param right rechter Nachfolger
	 */
	public MinusOperator(CalcTreeNode left, CalcTreeNode right){
		super(left, right);
	}
	
	public String toString(){
		return "- ";
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return leftChild.eval()-rightChild.eval();
	}

	
	@Override
	public String preOrderString() {
		// TODO Auto-generated method stub
		return this.toString()+this.leftChild.preOrderString()+this.rightChild.preOrderString();
		
	}

	@Override
	public String postOrderString() {
		// TODO Auto-generated method stub
		return leftChild.postOrderString()+rightChild.postOrderString()+this.toString();
	}

	@Override
	public String inOrderString() {
		// TODO Auto-generated method stub
		return leftChild.inOrderString() + this.toString() + rightChild.inOrderString();
	}
	
}
