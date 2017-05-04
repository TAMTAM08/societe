
/*Etape 1 : créer un nouveau projet Java dans Eclipse intitulé “Societe”*/

/*Etape 2 : créer une classe Personne*/
public class Personne {
	/*
	 * Etape 3 : définir les caractéristiques suivantes pour une personne le
	 * prénom : chaîne de caractères le nom : chaîne de caractères l’âge :
	 * entier
	 */
	/*public int age;
	public String prenom;
	public String nom;*/
	
	
	private int age;
	private String prenom;
	private String nom;

	/*
	 * Etape 4 : mettre en place un constructeur permettant la création d’une
	 * Personne à partir de son nom et de son prénom (dans cet ordre)
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
	 * Etape 5 : redéfinir la méthode public String toString() héritée
	 * (implicitement) de la classe mère (implicite) Object, l’objectif est
	 * d’afficher le prénom de la personne suivi de son nom (les deux éléments
	 * étant séparés par un espace). Ex. : “Eric Siber”
	 */
	@Override
	/*
	 * public String toString() {
	 * 
	 * // TODO Auto-generated method stub return prenom + " " + nom + " " +
	 * age;}
	 */

	/*
	 * : la confrontation à un premier jeu de données doit vous amener à mener
	 * des enrichissements sur votre classe Personne inclure l’âge dans la
	 * méthode toString() de manière à inclure, lorsqu’il est disponible
	 */

	public String toString() {
		if (age == 0) {
			return prenom + " " + nom;
		} else {
			return prenom + " " + nom + " " + age;
		}

		// TODO Auto-generated method stub

		/*
		 * Etape 6 : créer une classe Programme dont l’objectif va être de créer
		 * / gérer un ensemble de personnes inclure la méthode standard en Java
		 * permettant l’exécution d’un programme dans la méthode principale,
		 * créer 2 personnes le formateur, dont vous n’avez que le prénom et le
		 * nom vous même, dont vous avez les 3 caractéristiques définissant une
		 * personne dans le système pour chaque personne, afficher dans la
		 * sortie standard (console) la représentation textuelle mise en place à
		 * l’étape 5
		 */

	}

/*Etape 9 : faire évoluer la définition de la classe Personne afin de mettre en place les mécanismes standard d'encapsulation
lien d'aide : https://www.tutorialspoint.com/java/java_encapsulation.htm
impacter le reste du projet en conséquence */

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

//	empeche l'accès à la modification la création ayant lieu avec le constructeur 
	public void setNom(String nom) {
//		this.nom = nom;
	}

     
}

/*
 * Etape 7 : la confrontation à un premier jeu de données doit vous amener à
 * mener des enrichissements sur votre classe Personne inclure l’âge dans la
 * méthode toString() de manière à inclure, lorsqu’il est disponible, l’âge dans
 * la description textuelle renvoyée simplifier la création d’une personne dont
 * on connaît l’âge en ajoutant un nouveau constructeur
 */
// Utilisation du polymorphisme

 




/*Etape 10 : le cycle de vie d'une personne dans le système nous 
 * interdit de modifier son nom et son prénom une fois la personne créée. 
 * Impacter la classe personne en conséquence





Etape 13 : introduire, tant pour la notion de Personne que pour la notion de Refugie, les caractéristiques suivantes qui décrivent l'adresse postale
les éléments attendus sont les suivants (toutes facultatives dans le cycle de vie de création) :
le numéro de voie : chaîne de caractère
le nom de voie : chaîne de caractère
le code postal : entier
la ville : chaîne de caractère
enrichir le programme de façon arbitraire pour associer des caractéristiques d'adresse partielles ou complètes aux personnes / réfugiés gérés
Etape 14 : les règles de gestion interdisent la modification directe d'éléments d'adresse pour un réfugié non régularisé après sa création dans le système
impacter le code afin de permettre la modification des caractéristiques d'adresse pour une Personne mais pas pour un Refugie (tout en permettant la définition d'une adresse à la création)
mettre en place le processus de déménagement suivant :
la signature de la méthode est la suivante : boolean demenager(String numeroDeVoie, String nomDeVoie, int codePostal, String ville)
le comportement a pour effet de mettre à jour les caractéristiques d'adresse si les changements sont autorisés (cf. interdiction pour un réfugié non régularisé) et de renvoyer "vrai" si les modifications ont été faite ou "faux" dans le cas contraire
intégrer des scénarios de déménagement dans le programme principal tant sur une personne que sur un réfugié régularisé ou non
Etape 15 : afin d'alléger le code, faire une abstraction des caractéristiques d'une adresse en réalisant une extraction de ces dernières vers une classe Adresse qui sera donc utilisée en remplacement dans le code
Étapes ultérieures : si quelqu’un m’en demande*/

