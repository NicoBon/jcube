package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {

	public static Cube fromTextFile(String filename) {
		Cube cube = new Cube();
		return cube.setFileName(filename);
	}

	private String filename;

	private Cube setFileName(String filename) {
		this.filename = filename; 
		return this;
	}

	public Integer numberOfFaces() {
		return 2;
	}

	public String titreFace(int i) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
		String line = reader.readLine();
		reader.close();
		return line.substring(2);		
	}

}
