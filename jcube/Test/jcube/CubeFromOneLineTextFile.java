package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CubeFromOneLineTextFile {
	private Cube actualCube;

	@Before
	public void loadCubeFromTextFile() throws IOException{
		this.actualCube = Cube.fromTextFile("templates/one-line-cube.txt");
	}
	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tot", "");
		assertFalse(expectedCube.equals(actualCube));	
	}
	
	@Test
	public void comparerUnXMLEtUnCube() throws Exception{
		XMLDocument xml = actualCube.toSVG("templates/cube.svg");		
		//XMLDocument  readCubeSVG = (new XMLDocument()).loadXMLString(xml.asXMLString());
		assertTrue(xml.match("//tspan[contains(text(), \"Comment sortir du cours plus tot\")]"));
	}
}
