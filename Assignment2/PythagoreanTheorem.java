
/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter the values to compute pythagorean theorem");
		int a = readInt("Enter number 1 ");
		int b = readInt("Enter number 2 ");
		double y = (Math.sqrt(a * a + b * b));
		println("y= " + y);
	}

}
