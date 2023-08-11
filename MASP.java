
import java.util.HashMap;
import java.util.Map.Entry;

/*
 * the MASP class wraps the constraint tables.
 * the data structure HashMap<VarTuple, ConsTable> cons_tables is a map that holds all constraints -
 * 		VarTuple instance is a pair of agents
 * 		ConsTable is their corresponding constraints table
 */
public class MASP {

	private HashMap<VarTuple, ConsTable> cons_tables;	// maps pairs of agents to their corresponding constraint table
	private int domainSize;								// domain size of all agents
	int n;												// number of agents
	
	public MASP(HashMap<VarTuple, ConsTable> cons_tables, int domainSize, int agents) {
		this.cons_tables = cons_tables;
		this.domainSize = domainSize;
		this.n = agents;
	}
	
	// do not modify the print method!
	public void print() {
		for (Entry<VarTuple, ConsTable> entry : cons_tables.entrySet()) {
			System.out.println("table of " + entry.getKey().getI() + " and " + entry.getKey().getJ() + ":");
			entry.getValue().print(domainSize);
			System.out.println();
		}
	}
}
