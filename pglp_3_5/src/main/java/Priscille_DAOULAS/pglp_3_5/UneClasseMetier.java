package Priscille_DAOULAS.pglp_3_5;

public class UneClasseMetier {
	UneClasseAffichage uca;
	
	public UneClasseMetier()
	{
		uca = new UneClasseAffichage();
		
	}
	public void unMethodeMetier()
	{
		uca.afficheDebut();
		uca.afficheFin();
	}
}
