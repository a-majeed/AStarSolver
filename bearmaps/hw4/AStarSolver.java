package bearmaps.hw4;
import bearmaps.proj2ab.ArrayHeapMinPQ;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class AStarSolver<Vertex> implements ShortestPathsSolver <Vertex> {
    private ArrayHeapMinPQ<Vertex> fringes;  // the PQ stores vertices to be visited
    private HashMap<Vertex, Double> distTo;  // distance from the start vertex
    private HashMap<Vertex, Vertex> edgeTo;  // edge leading to the vertices
    private int numStatesExplored;           // number of vertices visited
    private SolverOutcome outcome;           // problem solve outcome
    private List<Vertex> solution;           // vertices of the shortest path in order
    private double solutionWeight;           // total weight of the shortest path
    private double timeSpent;                // total time to find the shortest path

}

public ASTarSolver(AStarGraph<Vertex> input, Vertex start, Vertex end, double timeout){

    fringes = new ArrayHeapMinPQ<>();
    distTo = new HashMap<>();
    edgeTo = new HashMap<>();
    solution = new LinkedList<>();
    numStatesExplored = 0;
    solutionWeight = 0;
    timeSpent = 0;


    fringes.add(start, input.estimatedDistancetoGoal(start,end));
    distTo.put(start, 0.0);

    long startTime = system.currentTimeMillis();

    while (fringes.size() != 0){

        Vertex p = fringes.removeSmallest();
        timeSpent = (System.currentTimeMillis() - startTime)/1000.0;
        numStatesExplored++;

        if (p.equal(end)){
            outcome = SolverOutcome.SOLVED;
            updateSolution(start, end);
            solutionWeight = distTo.get(end);
            return;

        }

        if (timeSpent > timeout){
            outcome = SolverOutcome.TIMEOUT;
            return;
        }

        // need to relax outgoing edges


    }


}
