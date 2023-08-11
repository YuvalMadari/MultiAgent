
/*
 * represents a constraints table between two agents
 */
public class ConsTable {

	private boolean[][] table;
	
	public ConsTable(int d, double p2) {
		// code...create a constraint table that match the parameters d,p2...
		// code...create a constraint table that match the parameters d,p2...
		// code...create a constraint table that match the parameters d,p2...
	}
	
	// do not modify the print method!
	public void print(int d) {
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}
