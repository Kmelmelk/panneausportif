package equipe;

public class EquipeBasket extends EquipeAbstraite {
	

	public EquipeBasket(String nom) {
		super(nom,"basket" );
}
@Override 
public void ajoutA()
{ 
	int score=super.getScore() + 1;
	super.setScore(score);
	System.out.println(super.getScore());
}
@Override 
public void ajoutB()
{ 
	int score=super.getScore() + 2;
	super.setScore(score);
	System.out.println(super.getScore());
}
@Override 
public void ajoutC()
{ 
	int score=super.getScore() + 3;
	super.setScore(score);
	System.out.println(super.getScore());
}



	public static void main (String[]args) {
		EquipeBasket GS = new EquipeBasket("Golden States");
		System.out.println("L\'équipe s\'appelle : "+GS.getNom());
		System.out.println("Son score est : "+GS.getScore());
		System.out.println("Son nouveau score est : "+GS.getScore());
		
		
	}
	
	
}

