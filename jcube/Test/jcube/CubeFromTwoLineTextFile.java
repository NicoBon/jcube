package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromTwoLineTextFile {
	private Cube actualCube;
	private Cube expectedCube = new Cube();

	@Test
	public void cubeShouldBeOneFaceWithCopierAndCtrl() throws IOException {
		this.actualCube = Cube.fromTextFile("templates/two-line-cube.txt");
		this.expectedCube.addFace("copier", "ctrl+c", "");
		assertEquals(actualCube,expectedCube);
	}

	@Test
	public void cubeShouldBeOneFaceWithUnAndDeuxAndTrois() throws IOException {
		this.actualCube = Cube.fromTextFile("templates/three-lines-cube.txt");
		this.expectedCube.addFace("un", "deux", "trois");
		assertEquals(actualCube, expectedCube);
	}

}
