package bearmaps.hw4;
import bearmaps.proj2ab.ArrayHeapMinPQ;

import java.util.HashMap;
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
