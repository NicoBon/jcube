package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromTwoLineTextFile {
	private Cube expectedCube;
	
	@Before
	public void createCube() {
		this.expectedCube = new Cube();
	}
	
	@Test
	public void cubeShouldBeOneFaceWithCopierAndCtrl() throws IOException {
		assertEquals(Cube.fromTextFile("templates/two-line-cube.txt"), 
					expectedCube.addFace("copier", "ctrl+c", ""));
	}

	@Test
	public void cubeShouldBeOneFaceWithUnAndDeuxAndTrois() throws IOException {
		assertEquals(Cube.fromTextFile("templates/three-lines-cube.txt"), 
					expectedCube.addFace("un", "deux", "trois"));
	}

}
