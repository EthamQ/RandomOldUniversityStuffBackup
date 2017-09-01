package CalcTree;

public class Value implements CalcTreeNode {

	private int value;
	
	
	
	/**
	 * Erzeugt einen neuen Wert-Knoten mit dem Ÿbergebenen Wert.
	 * 
	 * @param value der Wert des Knoten
	 */
	public Value(int value){
		this.value = value;
	}
	
	public String toString(){
		return value+" ";
	}
	

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public String preOrderString() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String postOrderString() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String inOrderString() {
		// TODO Auto-generated method stub
		return toString();
	}


}
