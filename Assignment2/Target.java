
/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.GOval;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	private static final int R_out = 72; // Gare wris radiusi
	int n = 3; // wreta raodenoba

	public void run() {

		for (int i = 1; i < n + 1; i++) {
			if (i % 2 != 0) {
				GOval outer = new GOval(((R_out * (n + 1 - i)) / n), ((R_out * (n + 1 - i)) / n));
				outer.setFilled(true);
				outer.setColor(Color.RED);
				add(outer, (getWidth() - ((R_out * (n + 1 - i)) / n)) / 2,
						(getHeight() - ((R_out * (n + 1 - i)) / n)) / 2);
			} else if (i % 2 == 0) {
				GOval outer = new GOval(((R_out * (n + 1 - i)) / n), ((R_out * (n + 1 - i)) / n));
				outer.setFilled(true);
				outer.setColor(Color.white);
				add(outer, (getWidth() - ((R_out * (n + 1 - i)) / n)) / 2,
						(getHeight() - ((R_out * (n + 1 - i)) / n)) / 2);
			}
		}
	}
}
