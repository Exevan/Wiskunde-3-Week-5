package graphColouring;

import java.util.Arrays;

public class GraphColouringDriver {

	public static void main(String[] args) {
		boolean[][] graph1 = {{false, true, false}, 
							 {true, false, true},
							 {false, true, false}};
				
		test(graph1, 2, GraphColourerType.BRUTEFORCE);		
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
