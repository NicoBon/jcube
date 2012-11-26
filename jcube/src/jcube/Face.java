package jcube;

public class Face {
	private String titre;
	private String contenu;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Object getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	public boolean equalsF(Object other) {
		Face otherFace = (Face)other;
		return this.equalsF(otherFace);
	}

}
