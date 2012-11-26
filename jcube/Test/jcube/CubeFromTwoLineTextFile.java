package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromTwoLineTextFile {
	private Cube actualCube;
	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		this.actualCube = Cube.fromTextFile("templates/two-line-cube.txt");
		Cube expectedCube = (new Cube())
				.addFace("copier", "ctrl+c");	
		assertEquals(actualCube.equals(expectedCube));
	}

}
