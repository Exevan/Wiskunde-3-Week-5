package hamiltonianCycle;

public class HamiltonianCycleFinderFactory {
	
	static IHamiltonianCycleFinder hamiltonianCycleFinderBruteforce = new HamiltonianCycleFinderBruteforce();
	static IHamiltonianCycleFinder hamiltonianCycleFinderBacktracking = new HamiltonianCycleFinderBacktracking();
	
	static IHamiltonianCycleFinder create(HamiltonianCycleFinderType type){
		if(type.equals(HamiltonianCycleFinderType.BRUTEFORCE))
			return hamiltonianCycleFinderBruteforce;
		else
			return hamiltonianCycleFinderBacktracking;
	}
}
