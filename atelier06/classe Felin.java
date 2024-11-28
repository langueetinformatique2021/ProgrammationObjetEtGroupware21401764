//L’objectif de cette partie est de créer votre première arborescence de classes. 
//Soit une classe abstraite Animal, avec 2 attributs, 1 constructeur et 2 méthodes 

/** Création et gestion d'animaux */
package atelier06;

public abstract class Animal{ 
private String espèce; 
private int nb_pattes = 0; 
/** création d'une nouvelle instance de la classe Animal
* @param type nom de l'espèce
* @param pattes nombre de pattes
*/
public Animal(String type, int pattes) { 
 espèce=type; 
 nb_pattes = pattes; 
 } 
/** présentation des caractéristiques de l'animal */
public void présente() { 
 System.out.println("je suis un représentant de l'espèce des " +espèce+ 
" et j'ai "+nb_pattes+ " pattes" ); 
 } 
/** cri de l'animal */
public abstract void crie(); 
} 
/** Création et gestion de félins */
public class Félin extends Animal { 
// ajout d'attributs propres à la sous-classe
protected boolean domestique = false; 
/** le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
public Félin(String type) { // les félins ont 4 pattes 
……………
 } 
/** présentation des caractéristiques du félin */
public void présente() { 
// appel de la méthode de la sur-classe
……………
 String etat = (domestique) ? "domestique" : "sauvage"; 
 System.out.println("je suis vraiment un animal " + etat) ; 
 } 
/** cri du félin */
……………
}
