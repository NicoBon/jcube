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

public class ReplaceCubeSVGSousTitreEtAstuce {
	private XMLDocument cubeSVG;
	private XMLDocument readCubeSVG;
			
	@Before
	public void createNewNoeud() throws SAXException, IOException,ParserConfigurationException, XPathExpressionException,TransformerFactoryConfigurationError, TransformerException {
		this.cubeSVG = (new XMLDocument()).loadXMLFile("templates/cube.svg");
		this.readCubeSVG = new XMLDocument();
		
		Element title = this.cubeSVG.createElement("tspan");
		Element content = this.cubeSVG.createElement("tspan");

		Element blocNode1 = cubeSVG.getFirstNodeFromXPath("//text[contains(text(), \"$text1\")]");

		title.setTextContent("deux");
		title.setAttribute("style", "font-weight:bold");

		content.setTextContent("trois");

		blocNode1.appendChild(title);
		blocNode1.appendChild(content);
	}

	@Test
	public void replaceNodeContentShouldBeDeux() throws SAXException,IOException, ParserConfigurationException,XPathExpressionException, TransformerFactoryConfigurationError,TransformerException {
		this.readCubeSVG.loadXMLString(cubeSVG.asXMLString());
		assertTrue(readCubeSVG.match("//tspan[contains(text(), \"deux\")]"));
	}

	@Test
	public void replaceNodeContentShouldBeTrois() throws SAXException,IOException, ParserConfigurationException,XPathExpressionException, TransformerFactoryConfigurationError,TransformerException {
		this.readCubeSVG.loadXMLString(cubeSVG.asXMLString());
		assertTrue(readCubeSVG.match("//tspan[contains(text(), \"trois\")]"));
	}

}
