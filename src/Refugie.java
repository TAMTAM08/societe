/*Etape 11 : notre système s'enrichit avec la notion de Réfugié,
 créer une nouvelle classe Refugie matérialisant cette notion
un réfugié partage les mêmes caractéristiques et contraintes qu'une personne
un réfugié dispose d'une information supplémentaire qui consiste à indiquer si la personne est
 régularisée ou non
employer un type de donnée approprié pour définir cette caractéristique propre à la notion de réfugié
définir les constructeurs appropriés sachant qu'en l'absence d'information sur le statut de la régularisation,
 le système devra considérer que le réfugié n'est pas régularisé*/

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
	 * redéfinir la méthode toString() pour un réfugié en incluant l'information
	 * sur la régularisation ajouter un réfugié dans la classe Programme
	 * (création et affichage)
	 */

	public String toString() {
		if (getAge() == 0) {
			return getPrenom() + " " + getNom() + " " + regularise;
		} else {
			return getPrenom() + " " + getNom() + " " + getAge() + " " + regularise;
		}

	}

	

	/*
	 * Etape 12 : la réglementation définit un process particulier pour la
	 * régularisation d'un réfugié, en effet il ne doit pas être permis de
	 * modifier directement cette information sur la représentation du réfugié
	 * dans le système, le changement passe par la mise en place d'une méthode
	 * regulariser la signature de la méthode est la suivante : boolean 
	 * regulariser(String motDePasse) le fonctionnement attendu est le suivant :
	 * si le motDePasse est correct, le réfugié devient régularisé et "vrai" est
	 * renvoyé en retour. Dans le cas contraire, le réfugié n'est pas régularisé
	 * et "faux" est renvoyé en retour le motDePasse attendu est "simplon"
	 * enrichir le programme afin de faire une première tentative de
	 * régularisation en échec sur un réfugié, suivie d'une seconde tentative
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
