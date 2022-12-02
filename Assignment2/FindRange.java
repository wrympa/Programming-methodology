
/*
 * File: FindRange.java
 * Name: 

/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	int MAX = 0;
	int MIN = 0;
	int times = 0;
	int symbol = 0;
	boolean passed = false;
	boolean done = false;
	boolean entrd = false;
	boolean failsafe = false;

	public void function() {
		for (int i = 1; i > 0; i++) {
			if (passed == false) {
				println("This program finds the largest and smalles numbers.");
			}
			if (done == false) {
				int a = readInt("please enter your number: ");

				if (a == symbol && entrd == false) {
					println("please enter a number that isn't " + symbol);
					passed = true;
					function();
				} else if (a == symbol && entrd == true) {
					done = true;
					passed = true;
					break;
				}

				if (a > MAX) {
					MAX = a;
					times++;
					entrd = true;
					if (times < 2) {
						MIN = a;
					}
					passed = true;
				} else if (a < MIN) {
					MIN = a;
					times++;
					entrd = true;
					if (times < 2) {
						MAX = a;
					}
					passed = true;
				}
			}
		}
		if (failsafe == false) {
			println("Largest Number: " + MAX);
			println("Smallest Number: " + MIN);
			done = true;
			failsafe = true;
		}
	}

	public void run() {
		function();
	}
}