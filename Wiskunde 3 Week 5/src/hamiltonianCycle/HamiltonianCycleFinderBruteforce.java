package hamiltonianCycle;

public class HamiltonianCycleFinderBruteforce implements IHamiltonianCycleFinder {

	@Override
	public int[] find(boolean[][] graph) {
		int[] cycle = new int[graph.length];
		cycle[0] = 0;
		return addNode(graph, cycle, 1) ? cycle : null;
	}


	private boolean addNode(boolean[][] graph, int[] cycle, int index){
		if(index == graph.length){
			return isValid(graph, cycle);
		}
			
		for(int node = 1; node < graph.length; ++node){
			cycle[index] = node;
			if(addNode(graph, cycle, index+1)){
				return true;
			}
		}
		return false;
	}

	private boolean isValid(boolean[][] graph, int[] cycle){
		boolean nodesInCycle[] = new boolean[graph.length];
		for(int i = 0; i < cycle.length; ++i) {
			int a = cycle[i];
			int b = cycle[(i+1) % cycle.length];
			if(!graph[a][b] || nodesInCycle[a]) return false;
			nodesInCycle[a] = true;
		}
		return true;
	}
}

