package edu.smith.cs.csc212.p1;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

public class Aquarium extends GFX {

	int fish1X = getWidth() + 100;
	int fish2X = getWidth() + 300;

	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());

		// Draw the fish!
		Creatures.drawFishFacingLeft(g, Color.yellow, fish1X, 200);
		// Draw the confused fish!
		Creatures.drawFishFacingRight(g, Color.green, fish2X, 300);

		// What if we wanted this little fish to swim, too?
		Creatures.drawSmallFishFacingLeft(g, Color.red, 200, 100);

		// Move the fish!
		fish1X -= 1;
		fish2X -= 2;
	}

	public static void main(String[] args) {
		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
