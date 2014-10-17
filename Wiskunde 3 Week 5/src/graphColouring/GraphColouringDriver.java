package graphColouring;

import java.util.Arrays;

public class GraphColouringDriver {

	public static void main(String[] args) {
		boolean[][] graph1 = {{false, true, false}, 
				{true, false, true},
				{false, true, false}};			
		test(graph1, 2, GraphColourerType.BRUTEFORCE);	
		test(graph1, 2, GraphColourerType.BACKTRACKING);
		System.out.println("");
		
		boolean[][] graph2 = {{false, true, true, true}, 
				{true, false, true, false},
				{true, true, false, true},
				{true, false, true, false}};
		test(graph2, 3, GraphColourerType.BRUTEFORCE);	
		test(graph2, 3, GraphColourerType.BACKTRACKING);
		System.out.println("");
		
		boolean[][] graph3 = {{false, true, true}, 
				{true, false, true},
				{true, true, false}};			
		test(graph3, 2, GraphColourerType.BRUTEFORCE);	
		test(graph3, 3, GraphColourerType.BACKTRACKING);
		System.out.println("");
	}
	
	private static void test(boolean[][] graph, int nColours, GraphColourerType type){
		IGraphColourer graphColourer = GraphColourerFactory.create(type);
		int[] colours = graphColourer.colour(graph, nColours);	
		if(colours != null){
			System.out.println(Arrays.toString(colours));
		} else {
			System.out.println("Geen graafkleuring mogelijk met " + nColours + " kleur" + ((nColours == 1) ? "." : "en."));
		}
	}

}
