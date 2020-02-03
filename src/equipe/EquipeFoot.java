package equipe;

public class EquipeFoot extends EquipeAbstraite {

	public EquipeFoot(String nom) {
		super(nom,"foot");
	}

	@Override
	public void ajoutA() {
		int score=super.getScore() + 1;
		super.setScore(score);
		System.out.println(super.getScore());	
		
	}

	@Override
	public void ajoutB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajoutC() {
		// TODO Auto-generated method stub
		
	}



	
}
