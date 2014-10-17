package graphColouring;

import java.util.Arrays;

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
		System.out.println(Arrays.toString(colours));
		int nodes = colours.length;
		int[] colours2 = new int[nodes];
		for(int i=0; i<nodes; ++i)
			colours2[i] = colours[i];
		colours2[node] = colour;
		for(int i=0; i<=node; ++i){
			for(int j=i+1; j<=node; ++j){
				if(graph[i][j] && colours2[i] == colours2[j])
					return false;
			}
		}
		return true;
	}

}
