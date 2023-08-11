
import java.util.HashMap;

public class Generator {
	
	private int n, d;
	private double p1, p2;

	/*
	 * constructor parameters -
	 * n, number of agents
	 * d, domain size
	 * p1, probability that two agents are constrainted
	 * p2, probability that a constraint takes the value "false"
	 */
	public Generator(int n, int d, double p1, double p2) {
		this.n = n;
		this.d = d;
		this.p1 = p1;
		this.p2 = p2;
	}

	// generate masp
	public MASP generateDCSP() {
		HashMap<VarTuple, ConsTable> cons_tables = new HashMap<VarTuple, ConsTable>();
		// code... construct a masp...
		// code... construct a masp...
		// code... construct a masp...
		return new MASP(cons_tables, d, n);
	}
}
