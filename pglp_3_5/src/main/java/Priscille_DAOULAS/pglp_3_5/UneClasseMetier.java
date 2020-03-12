package Priscille_DAOULAS.pglp_3_5;
/**
 * Classe uneClasseMetier.
 */
public class UneClasseMetier {
    /**
     * Attribut UneClasseAffichage permettant d'utiliser ses fonctions.
     */
    UneClasseAffichage uca;
    /**
     * Constructeur par défaut.
     */
    public UneClasseMetier() {
        this.uca = new UneClasseAffichage();
    }
    /**
     * Constructeur.
     * @param aff Initialise l'affichage.
     */
    public UneClasseMetier(final UneClasseAffichage aff) {
        this.uca = aff;
    }
    /**
     * Fonction affichant son temps de début et de fin.
     */
    public void unMethodeMetier() {
        uca.afficheDebut();
        uca.afficheFin();
    }
}
