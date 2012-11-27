package jcube;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeEqualityTest {

	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git");
		Cube cubeSVN = (new Cube()).addFace("SVN");
		assertFalse(cubeGit.equals(cubeSVN));
	}

	@Test
	public void cubeShouldBeTwoFaces() {
		Cube cubeGit = (new Cube()).addFace("Git").addFace("bob");
		Cube cubeSVN = (new Cube()).addFace("SVN").addFace("bill");
		assertFalse(cubeGit.equals(cubeSVN));
	}

	@Test
	public void cubeShouldBeOneFaceWithOneTitleAndOneContent() {
		Cube unCube = (new Cube()).addFace("titre1", "contenue1");
		Cube unCube2 = (new Cube()).addFace("titre2", "contenue2");
		assertFalse(unCube.equals(unCube2));
	}

	@Test
	public void cubeShouldBeOneFaceWithOneTitleAndOneContentAndOneCheat() {
		Cube unCube = (new Cube()).addFace("titre1", "contenue1", "cheat1");
		Cube unCube2 = (new Cube()).addFace("titre2", "contenue2", "cheat2");
		assertFalse(unCube.equals(unCube2));
	}
}
