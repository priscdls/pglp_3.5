package Priscille_DAOULAS.pglp_3_5;

import java.time.LocalDateTime;

public class UneClasseAffichage implements Affichage {
	
	public void afficheDebut()
	{
		System.out.println(LocalDateTime.now() + " : Début de uneMethodeMetier");
	}
	public void afficheFin()
	{
		System.out.println(LocalDateTime.now() + " : Fin de uneMethodeMetier");
	}
}
