
public class Programme {

	/*
	 * Etape 6 : créer une classe Programme dont l’objectif va être de créer /
	 * gérer un ensemble de personnes inclure la méthode standard en Java
	 * permettant l’exécution d’un programme dans la méthode principale, créer 2
	 * personnes le formateur, dont vous n’avez que le prénom et le nom vous
	 * même, dont vous avez les 3 caractéristiques définissant une personne dans
	 * le système pour chaque personne, afficher dans la sortie standard
	 * (console) la représentation textuelle mise en place à l’étape 5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne Eric = new Personne("eric", "Siber");
		System.out.println(Eric.toString());
		Personne Anne = new Personne("anne-marie", "tamtam", 39);
		System.out.println(Anne.toString());

		// afficher le prénom suite à l'encapsulation
		System.out.println(Anne.getPrenom());
		

// simplifier la création d’une personne dont
// on connaît l’âge en ajoutant un nouveau constructeur


//ajouter un réfugié dans la classe Programme (création et affichage)*/

	Refugie momo = new Refugie("Momo","Mama",40,false);  
	System.out.println(momo.toString());
	  
	Refugie titi = new Refugie("TITI","tutu");
	System.out.println(titi.toString());
	
	System.out.println(titi.regulariser("simplon"));
	
	
	System.out.println(momo.regulariser("SIMPLON"));

	System.out.println(momo.regulariser("simplon"));
	}
	}
	
	


