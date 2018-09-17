package edu.smith.cs.csc212.p1;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;
import me.jjfoley.gfx.IntPoint;

public class Aquarium extends GFX {
	
	Submarine ringo = new Submarine(250, 250, Color.yellow);

	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());

		ringo.draw(g);
		
		IntPoint maybeClick = this.processClick();
		if (maybeClick != null) {
			ringo.destX = maybeClick.x;
			ringo.destY = maybeClick.y;
		}
	}

	public static void main(String[] args) {
		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
