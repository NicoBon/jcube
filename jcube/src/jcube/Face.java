package jcube;

public class Face {
	private String titre;
	private String contenue;
	

	public Face(String titre, String contenue) {
		this.titre = titre;
		this.contenue = contenue;
	}
	public boolean equals(Object other) {
		Face otherFace = (Face)other;
		return this.titre.equals(otherFace.titre) &&
				this.contenue.equals(otherFace.contenue);
	}
}
