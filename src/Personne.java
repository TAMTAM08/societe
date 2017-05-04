
/*Etape 1 : cr�er un nouveau projet Java dans Eclipse intitul� �Societe�*/

/*Etape 2 : cr�er une classe Personne*/
public class Personne {
	/*
	 * Etape 3 : d�finir les caract�ristiques suivantes pour une personne le
	 * pr�nom : cha�ne de caract�res le nom : cha�ne de caract�res l��ge :
	 * entier
	 */
	/*public int age;
	public String prenom;
	public String nom;*/
	
	
	private int age;
	private String prenom;
	private String nom;

	/*
	 * Etape 4 : mettre en place un constructeur permettant la cr�ation d�une
	 * Personne � partir de son nom et de son pr�nom (dans cet ordre)
	 * Utilisation du polymorphisme*/

	public Personne(String prenomsouhaite, String nomsouhaite) {
		// super();
		this.prenom = prenomsouhaite;
		this.nom = nomsouhaite;
		this.age = 0;
	}

	public Personne(String prenomsouhaite, String nomsouhaite, int agesouhaite) {
		this.prenom = prenomsouhaite;
		this.nom = nomsouhaite;
		this.age = agesouhaite;
	}

	/*
	 * Etape 5 : red�finir la m�thode public String toString() h�rit�e
	 * (implicitement) de la classe m�re (implicite) Object, l�objectif est
	 * d�afficher le pr�nom de la personne suivi de son nom (les deux �l�ments
	 * �tant s�par�s par un espace). Ex. : �Eric Siber�
	 */
	@Override
	/*
	 * public String toString() {
	 * 
	 * // TODO Auto-generated method stub return prenom + " " + nom + " " +
	 * age;}
	 */

	/*
	 * : la confrontation � un premier jeu de donn�es doit vous amener � mener
	 * des enrichissements sur votre classe Personne inclure l��ge dans la
	 * m�thode toString() de mani�re � inclure, lorsqu�il est disponible
	 */

	public String toString() {
		if (age == 0) {
			return prenom + " " + nom;
		} else {
			return prenom + " " + nom + " " + age;
		}

		// TODO Auto-generated method stub

		/*
		 * Etape 6 : cr�er une classe Programme dont l�objectif va �tre de cr�er
		 * / g�rer un ensemble de personnes inclure la m�thode standard en Java
		 * permettant l�ex�cution d�un programme dans la m�thode principale,
		 * cr�er 2 personnes le formateur, dont vous n�avez que le pr�nom et le
		 * nom vous m�me, dont vous avez les 3 caract�ristiques d�finissant une
		 * personne dans le syst�me pour chaque personne, afficher dans la
		 * sortie standard (console) la repr�sentation textuelle mise en place �
		 * l��tape 5
		 */

	}

/*Etape 9 : faire �voluer la d�finition de la classe Personne afin de mettre en place les m�canismes standard d'encapsulation
lien d'aide : https://www.tutorialspoint.com/java/java_encapsulation.htm
impacter le reste du projet en cons�quence */

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	//public void setPrenom(String prenom) {
		//this.prenom = prenom;
	

	public String getNom() {
		return nom;
	}

//	empeche l'acc�s � la modification la cr�ation ayant lieu avec le constructeur 
	public void setNom(String nom) {
//		this.nom = nom;
	}

     
}

/*
 * Etape 7 : la confrontation � un premier jeu de donn�es doit vous amener �
 * mener des enrichissements sur votre classe Personne inclure l��ge dans la
 * m�thode toString() de mani�re � inclure, lorsqu�il est disponible, l��ge dans
 * la description textuelle renvoy�e simplifier la cr�ation d�une personne dont
 * on conna�t l��ge en ajoutant un nouveau constructeur
 */
// Utilisation du polymorphisme

 




/*Etape 10 : le cycle de vie d'une personne dans le syst�me nous 
 * interdit de modifier son nom et son pr�nom une fois la personne cr��e. 
 * Impacter la classe personne en cons�quence





Etape 13 : introduire, tant pour la notion de Personne que pour la notion de Refugie, les caract�ristiques suivantes qui d�crivent l'adresse postale
les �l�ments attendus sont les suivants (toutes facultatives dans le cycle de vie de cr�ation) :
le num�ro de voie : cha�ne de caract�re
le nom de voie : cha�ne de caract�re
le code postal : entier
la ville : cha�ne de caract�re
enrichir le programme de fa�on arbitraire pour associer des caract�ristiques d'adresse partielles ou compl�tes aux personnes / r�fugi�s g�r�s
Etape 14 : les r�gles de gestion interdisent la modification directe d'�l�ments d'adresse pour un r�fugi� non r�gularis� apr�s sa cr�ation dans le syst�me
impacter le code afin de permettre la modification des caract�ristiques d'adresse pour une Personne mais pas pour un Refugie (tout en permettant la d�finition d'une adresse � la cr�ation)
mettre en place le processus de d�m�nagement suivant :
la signature de la m�thode est la suivante : boolean demenager(String numeroDeVoie, String nomDeVoie, int codePostal, String ville)
le comportement a pour effet de mettre � jour les caract�ristiques d'adresse si les changements sont autoris�s (cf. interdiction pour un r�fugi� non r�gularis�) et de renvoyer "vrai" si les modifications ont �t� faite ou "faux" dans le cas contraire
int�grer des sc�narios de d�m�nagement dans le programme principal tant sur une personne que sur un r�fugi� r�gularis� ou non
Etape 15 : afin d'all�ger le code, faire une abstraction des caract�ristiques d'une adresse en r�alisant une extraction de ces derni�res vers une classe Adresse qui sera donc utilis�e en remplacement dans le code
�tapes ult�rieures : si quelqu�un m�en demande*/

