package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeEqualityTest {
	private Cube cube1, cube2;

	@Before
	public void createCube() throws IOException{
		this.cube1 = (new Cube()).addFace("Git", "", "");
		this.cube2 = (new Cube()).addFace("SVN", "", "");
	}
	
	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		assertFalse(this.cube1.equals(this.cube2));
	}

	@Test
	public void cubeShouldBeTwoFaces() {
		assertFalse(this.cube1.addFace("bob", "", "").equals(this.cube2.addFace("bill", "", "")));
	}

	@Test
	public void cubeShouldBeOneFaceWithOneTitleAndOneContent() {
		assertFalse(this.cube1.addFace("titre1", "contenue1", "").equals(this.cube2.addFace("titre2", "contenue2", "")));
	}

	@Test
	public void cubeShouldBeOneFaceWithOneTitleAndOneContentAndOneCheat() {		
		assertFalse(this.cube1.addFace("titre1", "contenue1", "cheat1").equals(this.cube2.addFace("titre2", "contenue2", "cheat2")));
	}
}
