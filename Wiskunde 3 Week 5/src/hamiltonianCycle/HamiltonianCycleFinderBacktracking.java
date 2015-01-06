package hamiltonianCycle;

public class HamiltonianCycleFinderBacktracking implements IHamiltonianCycleFinder {

	boolean nodesInCycle[];

	@Override
	public int[] find(boolean[][] graph) {
		nodesInCycle = new boolean[graph.length];
		int[] cycle = new int[graph.length];
		cycle[0] = 0;
		return addNode(graph, cycle, 1) ? cycle : null;
	}

	private boolean addNode(boolean[][] graph, int[] cycle, int index){
		if(index == graph.length) {
			int a = cycle[0];
			int b = cycle[index - 1];
			return graph[a][b];
		}		

		for(int node = 1; node < graph.length; ++node){
			if(isValid(graph, cycle, index, node)) {
				cycle[index] = node;
				nodesInCycle[node] = true;
				if(addNode(graph, cycle, index+1)){
					return true;
				}
				nodesInCycle[node] = false;
			}
		}
		
		return false;
	}

	private boolean isValid(boolean[][] graph, int[] cycle, int index, int node){
		return (graph[cycle[index-1]][node] && ! nodesInCycle[node]);
	}

}
