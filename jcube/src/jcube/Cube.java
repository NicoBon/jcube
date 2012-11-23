package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class Cube {
	private String faceOne;
	
	public static Cube fromTextFile(String filepath) throws IOException {
		return (new CubeTextFile(filepath)).newCube();		
		//Cube cube = new Cube();
		//return cube.loadFromFile(filepath);
	}
	

	public Cube addFace(String string) {
		this.faceOne = string;
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.faceOne.equals(otherCube.faceOne);
	}

	public XMLDocument toSVG(String string) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		XMLDocument cubeSVG = (new XMLDocument()).loadXMLFile(string);
		Element blocNode = cubeSVG.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent("Comment sortir du cours plus tot");
		return cubeSVG;
	}
	
}
