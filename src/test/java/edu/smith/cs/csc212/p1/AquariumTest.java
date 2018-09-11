package edu.smith.cs.csc212.p1;

import org.junit.Test;

import me.jjfoley.gfx.GFX;

/**
 * In later assignments, we will have more things to test.
 * I'm putting it here so that you have an opportunity to see it.
 * There is nothing you need to do in this file.
 * @author jfoley
 *
 */
public class AquariumTest {

	@Test
	public void testAquariumIsGFX() {
		Aquarium app = new Aquarium();
		assert(app instanceof GFX);
	}
}
