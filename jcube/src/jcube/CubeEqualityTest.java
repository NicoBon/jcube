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
	public void comparerUnXMLEtUnCube() throws XPathExpressionException, SAXException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException{
		Cube cube = Cube.fromTextFile("templates/template-cube2.txt");
		XMLDocument xml = cube.toSVG("templates/cube.svg");
		
		XMLDocument  readCubeSVG = (new XMLDocument()).loadXMLString(xml.asXMLString());
		assertTrue(readCubeSVG.match("//tspan[contains(text(), \"Comment sortir du cours plus tot\")]"));
	}
}
