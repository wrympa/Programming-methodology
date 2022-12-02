
/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int a = readInt("please enter a number ");
		int times = 0;
		if (a == 0 || a < 0) {
			println("please write a number larger than 0");
			run();
		} else {
			while (a != 1) {
				if (a % 2 == 0) {
					println(a + " is even, so I take half: " + a / 2);
					a = a / 2;
					times++;
				} else {
					println(a + " is odd, so I make: " + (3 * a + 1));
					a = 3 * a + 1;
					times++;
				}
			}
			println("The process took " + times + " to reach 1");
		}

	}
}
