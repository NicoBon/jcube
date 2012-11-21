package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {

	private Cube cube;

	@Before
	public void createCubeFromOneLineTextFile() {
	this.cube = Cube.fromTextFile("templates/template-cube.txt");
	}
	@Test
	public void cubeShouldHaveOneFace() {
		assertEquals(new Integer(2), this.cube.numberOfFaces());	
	}
	
	@Test
	public void titreFaceShouldBeBlabla() throws IOException{
		assertEquals("blabla", this.cube.titreFace(0));	
	}
	
	
	

}
