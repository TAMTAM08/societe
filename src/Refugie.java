/*Etape 11 : notre syst�me s'enrichit avec la notion de R�fugi�,
 cr�er une nouvelle classe Refugie mat�rialisant cette notion
un r�fugi� partage les m�mes caract�ristiques et contraintes qu'une personne
un r�fugi� dispose d'une information suppl�mentaire qui consiste � indiquer si la personne est
 r�gularis�e ou non
employer un type de donn�e appropri� pour d�finir cette caract�ristique propre � la notion de r�fugi�
d�finir les constructeurs appropri�s sachant qu'en l'absence d'information sur le statut de la r�gularisation,
 le syst�me devra consid�rer que le r�fugi� n'est pas r�gularis�*/

public class Refugie extends Personne {
	boolean regularise;

	public Refugie(String nom, String prenom, int age, boolean pregularise) {
		super(nom, prenom, age);
		this.regularise = pregularise;

	}

	public Refugie(String nom, String prenom) {
		super(nom, prenom);
		this.regularise = false;
	}

	/*
	 * red�finir la m�thode toString() pour un r�fugi� en incluant l'information
	 * sur la r�gularisation ajouter un r�fugi� dans la classe Programme
	 * (cr�ation et affichage)
	 */

	public String toString() {
		if (getAge() == 0) {
			return getPrenom() + " " + getNom() + " " + regularise;
		} else {
			return getPrenom() + " " + getNom() + " " + getAge() + " " + regularise;
		}

	}

	

	/*
	 * Etape 12 : la r�glementation d�finit un process particulier pour la
	 * r�gularisation d'un r�fugi�, en effet il ne doit pas �tre permis de
	 * modifier directement cette information sur la repr�sentation du r�fugi�
	 * dans le syst�me, le changement passe par la mise en place d'une m�thode
	 * regulariser la signature de la m�thode est la suivante : boolean 
	 * regulariser(String motDePasse) le fonctionnement attendu est le suivant :
	 * si le motDePasse est correct, le r�fugi� devient r�gularis� et "vrai" est
	 * renvoy� en retour. Dans le cas contraire, le r�fugi� n'est pas r�gularis�
	 * et "faux" est renvoy� en retour le motDePasse attendu est "simplon"
	 * enrichir le programme afin de faire une premi�re tentative de
	 * r�gularisation en �chec sur un r�fugi�, suivie d'une seconde tentative
	 * avec le bon mot de passe
	 */

	public boolean regulariser(String motDePasse){
	if (motDePasse=="simplon")
	{regularise=true;
	return true;
	}else
		return false;
	
	
			
	}
	
}
