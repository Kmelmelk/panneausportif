package equipe;

public class EquipeRugby extends EquipeAbstraite {
	public EquipeRugby(String nom) {
		super(nom,"rugby" );
}
@Override 
public void ajoutA()
{ 
	int score=super.getScore() + 2;
	super.setScore(score);
	System.out.println(super.getScore());
}
@Override 
public void ajoutB()
{ 
	int score=super.getScore() + 3;
	super.setScore(score);
	System.out.println(super.getScore());
}
@Override 
public void ajoutC()
{ 
	int score=super.getScore() + 5;
	super.setScore(score);
	System.out.println(super.getScore());
}


}
