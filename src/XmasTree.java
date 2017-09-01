import java.util.Scanner;


public class XmasTree {

	private int level;
	final private String treeTopper = "*\n";
	final private String trunk = "_";

	// Konstruktor
	public XmasTree() {
		
	}
	public XmasTree(int level) {
		this.level = level;
	}

	public String whitespace(int level) {
		String w = "";
		for (int i = level; i > 0; i--) {
			w = w + " ";

		}
		return w;
		
		
		

	}
	public String baumstamm(int level){
		String hoch="";
		for(int i=0; i<level; i++){
			hoch=hoch+"^";
		}
		return hoch+"["+trunk+"]"+hoch;
	}

	public String toString() {
		String x = "/";
		String x2 = "\\";
		String p = "";
		String a = "";
		int l = level;

		for (int i = 0; i < level; i++) {
			for (int ii = 0; ii < 2; ii++) {

				p = p + ".";
				a = a + x + p + x2 + "\n" + whitespace(l);
				p = p + ".";

			}
			l--;

			p = "..";
			for (int iii = 0; iii < i; iii++) {

				p = p + "..";

			}

		}
		return whitespace(level + 2) + treeTopper + whitespace(level + 1) + a+baumstamm(level);

	}

	public static void main(String[] args) {
		System.out.print("Geben Sie die gewünschte Höhe des Weihnachtsbaums ein: ");
		 Scanner sc = new Scanner(System.in);
		 int lev = sc.nextInt();
		XmasTree x = new XmasTree(lev);
		System.out.println(x.toString());
		// System.out.println(x.whitespace(5));
	}
}
