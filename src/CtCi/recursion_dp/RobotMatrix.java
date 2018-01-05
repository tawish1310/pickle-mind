package CtCi.recursion_dp;
/**
 * Problem Statement: Imagine a Robot sitting on left upper corner of a grid with
 * rows and cols. Robot can move in only 2 directions (down and right).
 *  Design a algorithm to find a path for the robot from top to bottom right
 * @author tnaqvi
 *
 *Solution: Smallest Subproblem: Robot needs to reach the lastpoint(arr.length-1,arr[0].length-1)
 *Store the result in a HashMap<PointVisited,Boolean>
 *Recurse until row=0 &&Col=0
 */
public class RobotMatrix {

}
