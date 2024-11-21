package atelier06;// 声明当前文件属于 atelier06 包

/** Création et gestion de félins */
public class Felin extends Animal {
// 创建一个名为 Felin 的类
//通过 extends Animal 表示 Felin 是 Animal 类的子类，继承其所有属性和方法

	
	
// ajout d'attributs propres à la sous-classe
    protected boolean domestique = false;
// protected 关键字：允许该属性在当前类及其子类中访问
// 定义一个布尔类型的属性 domestique，表示猫科动物是否是驯化的
//初始值:默认为 false，表示猫科动物默认是野生的

//le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
//“猫科动物类（Félins）的构造函数会调用其父类（超类）的构造函数。”
//在面向对象编程中，“构造函数” 是用来初始化对象的特殊方法。子类（如 Felin）可以继承父类（如 Animal）的属性和方法，但在初始化子类对象时，也需要确保父类的部分内容能够正确初始化。因此，子类构造函数通常需要通过调用父类构造函数（super() 关键字实现）来完成这项任务
// @param type :le type du félin


    public Felin(String type) { // les félins ont 4 pattes
    super(type,4)  // Appel au constructeur de la classe parente
    }
// super(type)：调用父类 Animal 的构造函数，传递一个 type 参数（比如“tigre”或“lion”）。确保父类的属性和逻辑被正确初始化   
// 猫科动物默认有 4 条腿  
    
/** présentation des caractéristiques du félin 该方法的功能:展示猫科动物的特性*/
    public void présente() {
// appel de la méthode de la sur-classe
        super.presente();
// super est la methode
//super.présente(); 调用父类 Animal 的 présente() 方法，显示父类的基本信息
 // Détermine si le félin est domestique ou sauvage
        String etat = (domestique) ? "domestique" : "sauvage";
        System.out.println("je suis vraiment un animal " + etat) ;
    }
/** cri du félin */
    public void crier() {
    	System.out.printlin("Je suis un felin !");
    }
}
// la fonction abstract : il faut implementer une methode
// chaque classe contient un constructeur 
// il faut appeler le constructeur de la classe superieure
// ex sert a comprendre la relation entre la classe et la classe superieure