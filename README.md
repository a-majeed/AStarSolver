# AStarSolver

## Introduction 

This is an artificial intelligence program that can solve arbitrary state space traversal problems. Specifically, given a graph of possible states, it will find the optimal route from the start state to a goal state.

This AI can be used for a wide variety of problems, including finding driving directions, solving a 15 puzzle, and finding word ladders!

All of this is done by using the A* algorithm!

## Example Solutions

Here are different solutions depending on the problem given: 

### Shortest Path

The goal is to find the shortest path. This means to find a path from your start state to your end state with minimal weight (cost).

<img src="images/path.jpg" width="60%" height="40%" />

### Integer Hop Puzzle

The goal is to get from a starting integer to a goal integer at a minimum cost.

Possible transitions are as follows:

Add or subtract 1. This costs 1 (i.e. has weight 1).

Multiple or divide by 2. This costs 5.

Square the number. This costs 10.


So for example, if we start at 1 and want to get to 5, the lowest cost path is 1 => 2 => 3 => 4 => 5, with a total cost of 4.

As another example, if we start at 1 and want to get to 20, the lowest cost path is 1 => 2 => 3 => 4 => 5 => 20, with a total cost of 14.

As a last example, if we start at 17 and want to get to 111, the lowest cost path is 17 => 16 => 15 => 225 => 112 => 111, with total cost 18.


<img src="images/integerhop.jpg" width="60%" height="40%" />

### Word Ladder Puzzle

In a Word Ladder puzzle, we try to convert one word in English to another by either changing, adding, or removing letters such that every transition results in a valid English word. 

Suppose we start with the word “horse” and we want to turn it into “nurse”. To do this, we could perform the following transitions: horse -> hose -> hole -> cole -> core -> cure -> pure -> purse -> nurse, for a total word ladder length of 9 words.


<img src="images/wordladder.jpg" width="60%" height="40%" />

### Sliding Puzzle

The 15 puzzle is a puzzle invented and popularized by Noyes Palmer Chapman in the 1870s (though bizarrely, the famous puzzle creator Sam Loyd falsely claimed to have invented it, along with other scams). 

The original version is played on a 4-by-4 grid with 15 square tiles labeled 1 through 15 and a blank square, though there are also 2-by-2 and 4-by-4 variants. The goal of this puzzle is to rearrange the tiles so that they are in order, using as few moves as possible. The player is permitted to slide tiles horizontally or vertically into the blank square.


<img src="images/slidingpuzzle.jpg" width="60%" height="40%" />

