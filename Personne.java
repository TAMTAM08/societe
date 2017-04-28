
/*Etape 1 : cr�er un nouveau projet Java dans Eclipse intitul� �Societe�*/

/*Etape 2 : cr�er une classe Personne*/
public class Personne {
/*Etape 3 : d�finir les caract�ristiques suivantes pour une personne
le pr�nom : cha�ne de caract�res
le nom : cha�ne de caract�res
l��ge : entier */
public	int age;
public	String prenom;
public	String nom;

/*Etape 4 : mettre en place un constructeur permettant la cr�ation 
 d�une Personne � partir de son nom et de son pr�nom (dans cet ordre)*/

public Personne(String prenom, String nom) {
	//super();
	this.prenom = prenom;
	this.nom = nom;
	this.age=0;}

public Personne(String prenom, String nom, int age)
{this.prenom = prenom;
this.nom = nom;
this.age=age;}

/*Etape 5 : red�finir la m�thode public String toString() h�rit�e (implicitement) de la classe m�re (implicite) Object, l�objectif est d�afficher le pr�nom de la personne
suivi de son nom (les deux �l�ments �tant s�par�s par un espace). Ex. : �Eric Siber� */
@Override
public String toString() {
	// TODO Auto-generated method stub
	return prenom + " " + nom + " " + age;
}

/*Etape 6 : cr�er une classe Programme dont l�objectif va �tre de cr�er / g�rer un ensemble de personnes
inclure la m�thode standard en Java permettant l�ex�cution d�un programme
dans la m�thode principale, cr�er 2 personnes
le formateur, dont vous n�avez que le pr�nom et le nom
vous m�me, dont vous avez les 3 caract�ristiques d�finissant une personne dans le syst�me
pour chaque personne, afficher dans la sortie standard (console) la repr�sentation textuelle mise en place � l��tape 5*/

}



/*Etape 7 : la confrontation � un premier jeu de donn�es doit vous amener � mener des enrichissements sur votre classe Personne
inclure l��ge dans la m�thode toString() de mani�re � inclure, lorsqu�il est disponible, l��ge dans la description textuelle renvoy�e
simplifier la cr�ation d�une personne dont on conna�t l��ge en ajoutant un nouveau constructeur*/



