
/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 *  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - 
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {
	private static final int RectW = (200);
	private static final int RectH = (50);
	private static final int Line_Y = (100);

	private void drawBoxes() {
		GRect rect = new GRect(RectW, RectH);
		rect.setColor(Color.BLACK);
		add(rect, getWidth() / 2 - RectW / 2, (getHeight() - RectH * 2 - Line_Y) / 2);

		for (int i = 0; i < 3; i++) {
			GRect rect1 = new GRect(RectW, RectH);
			rect1.setColor(Color.BLACK);
			add(rect1, getWidth() / 2 - RectW / 2 + (i - 1) * (getWidth() / 4 + RectW / 4),
					(getHeight() - RectH * 2 - Line_Y) / 2 + RectH + Line_Y);
		}
	}

	private void drawLines() {
		for (int a = 0; a < 3; a++) {
			GLine line = new GLine(getWidth() / 2, (getHeight() - RectH * 2) / 2,
					getWidth() / 2 - RectW / 2 + (a - 1) * (getWidth() / 4 + RectW / 4) + RectW / 2,
					(getHeight() - RectH * 2 - Line_Y) / 2 + RectH + Line_Y);
			add(line);
		}
	}

	private void drawText() {
		GLabel top = new GLabel("Program");
		double lineW = (top.getWidth());
		double lineH = (top.getHeight());
		add(top, getWidth() / 2 - lineW / 2, (getHeight() - RectH * 2 - Line_Y) / 2 + RectH / 2 + lineH / 3);

		GLabel left = new GLabel("GraphicsProgram");
		double LlineW = (left.getWidth());
		double LlineH = (left.getHeight());
		add(left, getWidth() / 2 - LlineW / 2 - (getWidth() / 4 + RectW / 4),
				(getHeight() - RectH * 2 - Line_Y) / 2 + RectH + RectH / 2 + Line_Y + LlineH / 3);

		GLabel mid = new GLabel("ConsoleProgram");
		double MlineW = (mid.getWidth());
		double MlineH = (mid.getHeight());
		add(mid, getWidth() / 2 - MlineW / 2,
				(getHeight() - RectH * 2 - Line_Y) / 2 + RectH + RectH / 2 + Line_Y + MlineH / 3);

		GLabel right = new GLabel("DialogProgram");
		double RlineW = (right.getWidth());
		double RlineH = (right.getHeight());
		add(right, getWidth() / 2 - RlineW / 2 + (getWidth() / 4 + RectW / 4),
				(getHeight() - RectH * 2 - Line_Y) / 2 + RectH + RectH / 2 + Line_Y + RlineH / 3);
	}

	public void run() {

		drawBoxes();
		drawLines();
		drawText();

	}
}
