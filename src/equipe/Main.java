package equipe;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame fenetre = new JFrame();
		    fenetre.setVisible(true);
		    
		    //Définit un titre pour notre fenêtre
		    fenetre.setTitle("Controle du panneau");
		    //Définit sa taille : 400 pixels de large et 100 pixels de haut
		    fenetre.setSize(500, 300);
		    //Nous demandons maintenant à notre objet de se positionner au centre
		    fenetre.setLocationRelativeTo(null);
		    //Termine le processus lorsqu'on clique sur la croix rouge
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //Et enfin, la rendre visible        
		    fenetre.setVisible(true);
	}

}
