package equipe;

public abstract class EquipeAbstraite {
	private int score;
	private String sport,nom;
	
	public int getScore() {
		
		
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public EquipeAbstraite(String nom, String sport)
	{
			this.nom=nom;
			this.sport=sport;
	}
	public abstract void ajoutA();
	public abstract void ajoutB();
	public abstract void ajoutC();
	
}
