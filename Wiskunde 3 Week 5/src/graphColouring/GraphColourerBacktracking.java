package graphColouring;

public class GraphColourerBacktracking implements IGraphColourer {

	@Override
	public int[] colour(boolean[][] graph, int nColours) {
		int[] colours = new int[graph.length];
		return (nodeColouring(graph, colours, nColours, 0)) ? colours : null;
	}

	
	private boolean nodeColouring(boolean[][] graph, int[] colours, int nColours, int node){
		if(node == graph.length)
			return true;
		
		for(int colour = 1; colour <= nColours; ++colour){
			if(isValid(graph, colours, node, colour)){
			    colours[node] = colour;
			    if(nodeColouring(graph, colours, nColours, node+1)){
			    	return true;
			    }
			}
		}
		return false;
	}
	
	private boolean isValid(boolean[][] graph, int[] colours, int node, int colour){
		// TODO: implement (zie oefening 2)
		return false;
	}
	
}
