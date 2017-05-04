
public class Programme  {

	/*Etape 6 : créer une classe Programme dont l’objectif va être de créer / gérer un ensemble de personnes
	inclure la méthode standard en Java permettant l’exécution d’un programme
	dans la méthode principale, créer 2 personnes
	le formateur, dont vous n’avez que le prénom et le nom
	vous même, dont vous avez les 3 caractéristiques définissant une personne dans le système
	pour chaque personne, afficher dans la sortie standard (console) la représentation textuelle mise en place à l’étape 5*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Personne Eric=new Personne ("eric","Siber");
		System.out.println(Eric);
Personne Anne= new Personne("anne-marie","tamtam",39);
		System.out.println(Anne);
	}

}
