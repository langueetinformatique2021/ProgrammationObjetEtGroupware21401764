package atelier06;
/** Création et gestion de félins */
public class Felin extends Animal {
// ajout d'attributs propres à la sous-classe
    protected boolean domestique = false;


/** le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
// @param type le type du félin




    public Felin(String type) { // les félins ont 4 pattes
    super(type,4)  // Appel au constructeur de la classe parente
    }
    
    
/** présentation des caractéristiques du félin */
    public void présente() {
// appel de la méthode de la sur-classe
        super.presente();
 // Détermine si le félin est domestique ou sauvage
        String etat = (domestique) ? "domestique" : "sauvage";
        System.out.println("je suis vraiment un animal " + etat) ;
    }
/** cri du félin */
    public void crier() {
    	System.out.printlin("Le felin sugit !");
    }
}
// chaque classe contient un constructeur 
// il faut appeler le constructeur de la classe superieure
// ex sert a comprendre la relation entre la classe et la classe superieure