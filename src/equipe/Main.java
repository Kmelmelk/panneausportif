package equipe;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame fenetre = new JFrame();
		    fenetre.setVisible(true);
		    
		    //D�finit un titre pour notre fen�tre
		    fenetre.setTitle("Controle du panneau");
		    //D�finit sa taille : 400 pixels de large et 100 pixels de haut
		    fenetre.setSize(500, 300);
		    //Nous demandons maintenant � notre objet de se positionner au centre
		    fenetre.setLocationRelativeTo(null);
		    //Termine le processus lorsqu'on clique sur la croix rouge
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //Et enfin, la rendre visible        
		    fenetre.setVisible(true);
	}

}
