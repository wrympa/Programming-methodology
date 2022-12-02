
/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	private static final long serialVersionUID = 1L;

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 15;

	private void drawPyramid() {
		for (int a = 0; a < BRICKS_IN_BASE; a++) {
			for (int i = 0; i < (BRICKS_IN_BASE - a); i++) {
				GRect rect = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
				rect.setColor(Color.BLACK);
				add(rect, (BRICK_WIDTH / 2) * a + i * BRICK_WIDTH + (getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2,
						getHeight() - BRICK_HEIGHT * a);
			}
		}

	}

	public void run() {
		drawPyramid();
	}

}
