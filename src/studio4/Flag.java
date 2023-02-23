package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(176, 0, 250);
		StdDraw.circle(.7, .7, 0.2);
		StdDraw.setPenColor(255, 0, 255);
		StdDraw.circle(0.5, 0.5, 0.3);
		StdDraw.setPenColor(255, 0, 176);
		double[] x = {0.1,0.2, 0.3};
		double[] y = {0.5,0.7, 0.3};
		StdDraw.filledPolygon(x, y);
	}
}