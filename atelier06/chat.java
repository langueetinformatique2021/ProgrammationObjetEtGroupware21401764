package atelier06;

public class chat extends Felin implements Domesticable{
	private String nom;
	//le constructeur de chat fait appel au constructeur de la sur-classe  Félin*/
	//“猫科动物类（Félins）的构造函数会调用其父类（超类）的构造函数。”
	//在面向对象编程中，“构造函数” 是用来初始化对象的特殊方法。子类（如 Felin）可以继承父类（如 Animal）的属性和方法，但在初始化子类对象时，也需要确保父类的部分内容能够正确初始化。因此，子类构造函数通常需要通过调用父类构造函数（super() 关键字实现）来完成这项任务
	// @param type :le type du chat


	public Chat(String type) { // les chats ont 4 pattes
	        super(type);  // Appel au constructeur de la classe parente
	}
	
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	public void domestiquer(String nom) {
		domestique = true;
		this.nom = nom;
	}
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	public String nom() {
		return nom;
		
	   
		
		
	}
	
	} 