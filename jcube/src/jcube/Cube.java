package jcube;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Cube {
	private Face uneFace = new Face("", "", "");

	public static Cube fromTextFile(String filepath) throws IOException {
		return (new CubeTextFile(filepath)).newCube();
	}

	public boolean equals(Object other) {
		Cube otherCube = (Cube) other;
		return this.uneFace.equals(otherCube.uneFace);
	}

	public XMLDocument toSVG(String string) throws SAXException, IOException,ParserConfigurationException, XPathExpressionException {
		XMLDocument cubeSVG = (new XMLDocument()).loadXMLFile(string);
		Element blocNode = cubeSVG.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent("Comment sortir du cours plus tot");
		return cubeSVG;
	}

	public Cube addFace(String titre, String contenue, String cheat) {
		this.uneFace = new Face(titre, contenue, cheat);
		return this;
	}

}
