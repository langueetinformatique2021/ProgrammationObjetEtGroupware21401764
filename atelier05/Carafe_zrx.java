/*  水罐问题
水罐问题的目标是利用两个水罐，分别具有7升和4升的容量，通过操作获得一个含有5升水的水罐。初始状态下，两个水罐都是空的。允许的操作只有：清空一个水罐、完全填满一个水罐、将一个水罐中的水倒入另一个水罐。
我们建议将水罐视为一个包含两个私有属性（contenu_ 和 capacite_）的对象，并提供以下接口，包含这些操作（Remplir、Vider、Contenu、Capacite 和 Transvaser）。
 * 题目
练习1：创建 Carafe.java 类。声明其属性并编写构造函数的代码。

练习2：写出两个用于写入的访问器方法是什么？编写它们的代码。

练习3：写出两个用于读取的访问器方法是什么？编写它们的代码。

练习4：最后一个方法是什么？它有哪些参数？编写其代码。

练习5：为您的类编写 Javadoc 注释并生成文档。
 */
// commander tjs le code

package atelier05;

public class Carafe {
	private int contenu_, capacite_;
	//private int contenu_;  // 水壶当前的水量  on met des attributs en debut private:que objet peut modifier ces attributs
    //private final int capacite_;  // 水壶的最大容量
    //les constructeur sertent a initialiser les attributs
	
	
	
	
// 构造函数，初始化水壶容量，并将水量设为0
// Création d'une carafe vide
//@param capacite capacité en litres de la carafe */
// "Vider" et "Remplir" sont des accesseurs en eciture, ils modifient directement leurs attributs
// chaque attribut a un accesseur
	public Carafe(int capacite) {
		this.capacite_ = capacite;
        //this.contenu_ = 0;  // 初始为空	
		Vider(); // il faut jamais dupliquer le code
	}
	
	
	
	
	
// Rmplir une carafe pleine completement
	 // 方法：将水壶填满
	public void Remplir() {
		this.contenu_ = capacite_; //"this" sert a assurer ceci est un attribut de objet
//在 Java 中，this 关键字是一个引用变量，指向当前对象的实例。它在类的构造函数、方法和属性中使用
//this.contenu_ = capacite_; this.contenu 指的是当前对象的实例变量，而 capacite（没有 this）是构造函数的参数。通过 this.contenu = capacite;，将参数值赋给当前对象的实例变量。
	  
	}
	
// Vider une carafe complete
    // 方法：清空水壶
	public void Vider() {
		this.contenu_ = 0;
	}
	
	
	
	
	
//"Contenu" et "Capacite" sont des accessseur en lecture
	// 获取当前水量
	public int Contenu() {
		return this.contenu_;
	}
	// 获取水壶最大容量
	public int Capacite() {
		return this.capacite_;
	}
	
	
//imaginer qu'on a deux carafes, un est 5 litrs,autre est 7 litres, carafe de 5 litres sera vide
//@para c carafe a transvaser
// dans le cadre de class, on a deux objets et un parametres	
// transvaser la carafe c dans la carafe this	
    // 假设有两个水壶，一个是5升的空水壶，另一个是7升的水壶。5升的水壶将被倒空。
	// @param c 指定的目标水壶，将当前水壶的水倒入该水壶中。
	// 方法：将当前水壶的水倒入目标水壶 c 中，不超过目标水壶的容量。

	public void Transvaser(Carafe c) {
// 计算可以转移的水量（取当前水壶中水量和目标水壶剩余容量的较小值）
		int transferAmount = Math.min(this.contenu_,  c.capacite_ - c.contenu_);
		 // 从当前水壶中减少转移的水量
		this.contenu_ -= transferAmount;
		 // 将转移的水量增加到目标水壶中
	    c.contenu_ += transferAmount;
	}
	
	
}
