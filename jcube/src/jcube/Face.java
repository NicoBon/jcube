package jcube;

public class Face {
	private String titre;
	private String contenue;
	private String cheat;
	

	public Face(String titre, String contenue, String cheat) {
		this.titre = titre;
		this.contenue = contenue;
		this.cheat = cheat;
	}
	public boolean equals(Object other){
		Face otherFace = (Face)other;
		return this.titre.equals(otherFace.titre) &&
				this.contenue.equals(otherFace.contenue) &&
				this.cheat.equals(otherFace.cheat);
	}
}
