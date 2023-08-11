import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		// extract parameters
		int n = Integer.valueOf(args[0]).intValue();
		int d = Integer.valueOf(args[1]).intValue();
		double p1 = Double.valueOf(args[2]).doubleValue();
		double p2 = Double.valueOf(args[3]).doubleValue();

		// generate and print MASP
		Generator gen = new Generator(n, d, p1, p2);		
		MASP masp = gen.generateDCSP();
		masp.print();

		// initialize mailer
		Mailer mailer = new Mailer();
		for (int i = 0; i < n; i++) {
			mailer.put(i);
		}		

		// create agents
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < n; i++) {
			/*
			 * the next line is not complete.
			 * you need to initialize each agent with the sufficient information required for performing the task.
			 * remember! the agent perform a DISTRIBUTED search - do not expose unnecessary information.
			 */
			Thread t = new Thread(new Agent(i)); // May be worng
			threads.add(t);
		}

		// run agents as threads
		for (Thread t : threads) {
			t.start();
		}
		// wait for all agents to terminate
		for (Thread t : threads) {
			t.join();
		}
	}
}
