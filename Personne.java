
/*Etape 1 : créer un nouveau projet Java dans Eclipse intitulé “Societe”*/

/*Etape 2 : créer une classe Personne*/
public class Personne {
/*Etape 3 : définir les caractéristiques suivantes pour une personne
le prénom : chaîne de caractères
le nom : chaîne de caractères
l’âge : entier */
public	int age;
public	String prenom;
public	String nom;

/*Etape 4 : mettre en place un constructeur permettant la création 
 d’une Personne à partir de son nom et de son prénom (dans cet ordre)*/

public Personne(String prenom, String nom) {
	//super();
	this.prenom = prenom;
	this.nom = nom;
	this.age=0;}

public Personne(String prenom, String nom, int age)
{this.prenom = prenom;
this.nom = nom;
this.age=age;}

/*Etape 5 : redéfinir la méthode public String toString() héritée (implicitement) de la classe mère (implicite) Object, l’objectif est d’afficher le prénom de la personne
suivi de son nom (les deux éléments étant séparés par un espace). Ex. : “Eric Siber” */
@Override
public String toString() {
	// TODO Auto-generated method stub
	return prenom + " " + nom + " " + age;
}

/*Etape 6 : créer une classe Programme dont l’objectif va être de créer / gérer un ensemble de personnes
inclure la méthode standard en Java permettant l’exécution d’un programme
dans la méthode principale, créer 2 personnes
le formateur, dont vous n’avez que le prénom et le nom
vous même, dont vous avez les 3 caractéristiques définissant une personne dans le système
pour chaque personne, afficher dans la sortie standard (console) la représentation textuelle mise en place à l’étape 5*/

}



/*Etape 7 : la confrontation à un premier jeu de données doit vous amener à mener des enrichissements sur votre classe Personne
inclure l’âge dans la méthode toString() de manière à inclure, lorsqu’il est disponible, l’âge dans la description textuelle renvoyée
simplifier la création d’une personne dont on connaît l’âge en ajoutant un nouveau constructeur*/



