package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromTwoLineTextFile {
	private Cube actualCube;
	
	@Test
	public void cubeShouldBeOneFaceWithCopierAndCtrl() throws IOException {
		this.actualCube = Cube.fromTextFile("templates/two-line-cube.txt");
		Cube expectedCube = (new Cube()).addFace("copier", "ctrl+c");	
		assertEquals(actualCube.getUneFace(),(expectedCube.getUneFace()));
	}
	
	@Test
	public void cubeShouldBeOneFaceWithUnAndDeuxAndTrois() throws IOException {
		this.actualCube = Cube.fromTextFile("templates/three-lines-cube.txt");
		Cube expectedCube = (new Cube()).addFace("un", "deux", "trois");	
		assertEquals(actualCube.getUneFace(),(expectedCube.getUneFace()));
	}

}
