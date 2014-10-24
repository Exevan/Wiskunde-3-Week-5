package hamiltonianCycle;

import java.util.Arrays;

public class HamiltonianCycleDriver {

	public static void main(String[] args) {
		boolean graph1[][] = {{false, true, false, true, false},
							  {true, false, true, true, true},
							  {false, true, false, false, true},
							  {true, true, false, false, true},
							  {false, true, true, true, false}};
		
		boolean graph2[][] = {{false, true, false, true, false},
				  			  {true, false, true, true, true},
				  			  {false, true, false, false, true},
				  			  {true, true, false, false, false},
				  			  {false, true, true, false, false}};
		
		test(graph1, HamiltonianCycleFinderType.BACKTRACKING);		
		test(graph2, HamiltonianCycleFinderType.BACKTRACKING);		
	}
	
	private static void test(boolean[][] graph, HamiltonianCycleFinderType type){
		IHamiltonianCycleFinder hamCycleFinder = HamiltonianCycleFinderFactory.create(type);
		int[] cycle = hamCycleFinder.find(graph);	
		if(cycle != null){
			System.out.println(Arrays.toString(cycle));
		} else {
			System.out.println("Geen Hamiltoniaanse kring.");
		}	
	}
}
