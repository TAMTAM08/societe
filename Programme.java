
public class Programme  {

	/*Etape 6 : cr�er une classe Programme dont l�objectif va �tre de cr�er / g�rer un ensemble de personnes
	inclure la m�thode standard en Java permettant l�ex�cution d�un programme
	dans la m�thode principale, cr�er 2 personnes
	le formateur, dont vous n�avez que le pr�nom et le nom
	vous m�me, dont vous avez les 3 caract�ristiques d�finissant une personne dans le syst�me
	pour chaque personne, afficher dans la sortie standard (console) la repr�sentation textuelle mise en place � l��tape 5*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Personne Eric=new Personne ("eric","Siber");
		System.out.println(Eric);
Personne Anne= new Personne("anne-marie","tamtam",39);
		System.out.println(Anne);
	}

}
