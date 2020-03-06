package Priscille_DAOULAS.pglp_3_5;

import java.time.LocalDateTime;
/**
 * Classe une ClasseAffichage
 * qui implémente l'interface Affichage.
 *
 */
public class UneClasseAffichage implements Affichage {
	/**
	 * Fonction affichant le temps du début de uneMethodeMetier.
	 */
	public void afficheDebut() {
		System.out.println(LocalDateTime.now()
				+ " : Début de uneMethodeMetier");
	}
	/**
	 * Fonction affichant le temps de fin de uneMethodeMetier.
	 */
	public void afficheFin() {
		System.out.println(LocalDateTime.now()
				+ " : Fin de uneMethodeMetier");
	}
}
