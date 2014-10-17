package graphColouring;

public class GraphColourerFactory {
	
	static IGraphColourer graphColourerBrutefore = new GraphColourerBruteforce();
	static IGraphColourer graphColourerBackTracking = new GraphColourerBacktracking();
	
	static IGraphColourer create(GraphColourerType type){
		if(type == GraphColourerType.BRUTEFORCE){
			return graphColourerBrutefore;
		} else {
			return graphColourerBackTracking;
		}
	}
}
