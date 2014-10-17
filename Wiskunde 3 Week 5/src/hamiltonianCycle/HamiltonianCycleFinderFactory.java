package hamiltonianCycle;

public class HamiltonianCycleFinderFactory {
	
	static IHamiltonianCycleFinder hamiltonianCycleFinderBruteforce = new HamiltonianCycleFinderBruteforce();
	
	static IHamiltonianCycleFinder create(HamiltonianCycleFinderType type){
		return hamiltonianCycleFinderBruteforce;
	}
}
