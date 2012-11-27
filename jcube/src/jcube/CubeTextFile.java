package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CubeTextFile {
	private String filepath;
	
	public CubeTextFile(String filepath){
		this.filepath = filepath;
	}
	
	public Cube newCube() throws IOException{
		Cube cube = new Cube();		
		BufferedReader reader = new BufferedReader(new FileReader(new File(filepath)));
		
		String ligne1 = reader.readLine().substring(2);
		
		String ligne2Test = reader.readLine();
		String ligne2;
		
		String ligne3Test = reader.readLine();
		String ligne3;
		
		if(ligne2Test==null)
			ligne2 = "";
		else ligne2=ligne2Test.substring(3);
		
		if(ligne3Test==null)
			ligne3 = "";
		else ligne3=ligne3Test.substring(4);
		
		
		cube.addFace(ligne1, ligne2, ligne3);
		reader.close();
		return cube;
	}
}