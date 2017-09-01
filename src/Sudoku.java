
public class Sudoku {

	private int[][] sudokuArray;;

	// Konstruktor
	public Sudoku() {
		sudokuArray = new int[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudokuArray[i][j] = (3 * i + i / 3 + j) % 9 + 1;
			}
		}

	}
	
	public void transpose(){
		
	}

	// Sudoku als String ausgeben
	public String toString(Sudoku s) {
		String SudToString = "|";
		String zwischenlinie = "\n-------------------------------";
		String linieOben = "-------------------------------\n";

		for (int i = 0; i < 9; i++) {
			int j = 0;
			if (j == 0) {
				for (j = 0; j < 3; j++) {
					if (s.sudokuArray[i][j] == 0) {
						SudToString = SudToString + " " + " " + " ";
					} else
						SudToString = SudToString + " " + s.sudokuArray[i][j] + " ";
				}
				SudToString = SudToString + "|";
			}

			if (j == 3) {

				for (j = 3; j < 6; j++) {

					if (s.sudokuArray[i][j] == 0) {
						SudToString = SudToString + " " + " " + " ";
					} else
						SudToString = SudToString + " " + s.sudokuArray[i][j] + " ";
				}
				SudToString = SudToString + "|";
			}

			if (j == 6) {
				for (j = 6; j < 9; j++) {

					if (s.sudokuArray[i][j] == 0) {
						SudToString = SudToString + " " + " " + " ";
					} else
						SudToString = SudToString + " " + s.sudokuArray[i][j] + " ";
				}
				SudToString = SudToString + "|";
			}

			if (i == 2 || i == 5) {
				SudToString = SudToString + zwischenlinie;

			}
			if (i == 8) {
				SudToString = SudToString + zwischenlinie + "\n";
			} else
				SudToString = SudToString + "\n|";
		}
		return linieOben + SudToString;
	}

	// Methode Vertauschen Zeilen
	public void permutateRows(int a, int b) {
		if ((a > 0 && a <= 3 && b > 0 && b <= 3) || (a > 3 && a <= 6 && b > 3 && b <= 6)
				|| (a > 6 && a <= 9 && b > 6 && b <= 9)) {
			int[] zwischenspeichernA = new int[9];
			for (int i = 0; i < 9; i++) {
				zwischenspeichernA[i] = sudokuArray[i][a - 1];
			}
			int[] zwischenspeichernB = new int[9];
			for (int i = 0; i < 9; i++) {
				zwischenspeichernB[i] = sudokuArray[i][b - 1];
			}

			for (int z = 0; z < 9; z++) {
				sudokuArray[z][a - 1] = zwischenspeichernB[z];
			}

			for (int z = 0; z < 9; z++) {
				sudokuArray[z][b - 1] = zwischenspeichernA[z];
			}
		}

	}

	// Methode Vertauschen Spalten
	public void permutateColumns(int a, int b) {
		if ((a > 0 && a <= 3 && b > 0 && b <= 3) || (a > 3 && a <= 6 && b > 3 && b <= 6)
				|| (a > 6 && a <= 9 && b > 6 && b <= 9)) {
			int[] zwischenspeichernA = new int[9];
			for (int i = 0; i < 9; i++) {
				zwischenspeichernA[i] = sudokuArray[a - 1][i];
			}
			int[] zwischenspeichernB = new int[9];
			for (int i = 0; i < 9; i++) {
				zwischenspeichernB[i] = sudokuArray[b - 1][i];
			}

			for (int z = 0; z < 9; z++) {
				sudokuArray[a - 1][z] = zwischenspeichernB[z];
			}

			for (int z = 0; z < 9; z++) {
				sudokuArray[b - 1][z] = zwischenspeichernA[z];
			}
		}

	}

	// Methode Vertauschen Spaltenblöcke
	public void permutateStack(int a, int b) {

		// Zwischenspeichern des ersten Spaltenblocks in einem Array
		int[] zwischenspeichernStack1 = new int[27];
		int k = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				zwischenspeichernStack1[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Zwischenspeichern des zweiten Spaltenblocks in einem Array
		int[] zwischenspeichernStack2 = new int[27];
		k = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 3; j < 6; j++) {
				zwischenspeichernStack2[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Zwischenspeichern des dritten Spaltenblocks in einem Array
		int[] zwischenspeichernStack3 = new int[27];
		k = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 6; j < 9; j++) {
				zwischenspeichernStack3[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Vertauschen Blockspalte 1&2

		if (a == 1 && b == 2 || a == 2 && b == 1) {
			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					sudokuArray[i][j] = zwischenspeichernStack2[k];
					k++;
				}
			}
			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 3; j < 6; j++) {
					sudokuArray[i][j] = zwischenspeichernStack1[k];
					k++;
				}
			}

		}

		// Vertauschen Blockspalte 1&3

		if (a == 1 && b == 3 || a == 3 && b == 1) {

			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					sudokuArray[i][j] = zwischenspeichernStack3[k];
					k++;
				}
			}
			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 6; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack1[k];
					k++;
				}
			}
		}

		// Vertauschen Blockspalte 2&3
		k = 0;
		if (a == 2 && b == 3 || a == 3 && b == 2) {

			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 3; j < 6; j++) {
					sudokuArray[i][j] = zwischenspeichernStack3[k];
					k++;
				}
			}
			k = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 6; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack2[k];
					k++;
				}
			}
		}

	}

	// Methode Vertauschen Zeilenblöcke
	public void permutateBand(int a, int b) {

		// Zwischenspeichern des ersten Zeilenblocks in einem Array
		int[] zwischenspeichernStack1 = new int[27];
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				zwischenspeichernStack1[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Zwischenspeichern des zweiten Zeilenblocks in einem Array
		int[] zwischenspeichernStack2 = new int[27];
		k = 0;
		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 9; j++) {
				zwischenspeichernStack2[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Zwischenspeichern des dritten Zeilenblocks in einem Array
		int[] zwischenspeichernStack3 = new int[27];
		k = 0;
		for (int i = 6; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				zwischenspeichernStack3[k] = sudokuArray[i][j];
				k++;
			}
		}

		// Vertauschen Zeilenspalte 1&2

		if (a == 1 && b == 2 || a == 2 && b == 1) {
			k = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack2[k];
					k++;
				}
			}
			k = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack1[k];
					k++;
				}
			}

		}

		// Vertauschen Zeilenspalte 1&3

		if (a == 1 && b == 3 || a == 3 && b == 1) {

			k = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack3[k];
					k++;
				}
			}
			k = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack1[k];
					k++;
				}
			}
		}

		// Vertauschen Zeilenspalte 2&3
		k = 0;
		if (a == 2 && b == 3 || a == 3 && b == 2) {

			k = 0;
			for (int i = 3; i < 6; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack3[k];
					k++;
				}
			}
			k = 0;
			for (int i = 6; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudokuArray[i][j] = zwischenspeichernStack2[k];
					k++;
				}
			}
		}

	}

	public static void main(String[] args) {
		Sudoku k = new Sudoku();
		k.permutateBand(1, 2);
		k.permutateStack(1, 2);
		System.out.print(k.toString(k));
	}
}
