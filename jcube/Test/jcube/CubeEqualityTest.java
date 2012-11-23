package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class CubeEqualityTest {

	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git");
		Cube cubeSVN = (new Cube()).addFace("SVN");
		assertFalse(cubeGit.equals(cubeSVN));
	}
	
	@Test
	public void cubeShouldBeTwoFaces(){
		Cube cubeGit = (new Cube()).addFace("Git").addFace("bob");
		Cube cubeSVN = (new Cube()).addFace("SVN").addFace("bill");
		assertFalse(cubeGit.equals(cubeSVN));
	}
	
}
