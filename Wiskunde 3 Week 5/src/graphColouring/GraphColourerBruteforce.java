package graphColouring;


public class GraphColourerBruteforce implements IGraphColourer {

	@Override	
	public int[] colour(boolean[][] graph, int nColours) {
		int[] colours = new int[graph.length];
		return (nodeColouring(graph, colours, nColours, 1)) ? colours : null;
	}
	
	private boolean nodeColouring(boolean[][] graph, int[] colours, int nColours, int node){
		if(node == graph.length){
			return isValid(graph, colours);
		}
				
		for(int colour = 1; colour <= nColours; ++colour){
			colours[node] = colour;
			if(nodeColouring(graph, colours, nColours, node+1)){
				return true;
			}
		}
		return false;
	}
		
	private boolean isValid(boolean[][] graph, int[] colours){
		for(int i=0; i<graph.length; ++i){
			for(int j=i+1; j<graph.length; ++j){
				if(graph[i][j] && colours[i] == colours[j])
					return false;
			}
		}
		return true;
	}	
}



