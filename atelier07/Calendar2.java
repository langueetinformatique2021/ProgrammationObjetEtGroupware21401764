//Créer la classe Calendar2 dérivée de Calendar implémentant  attribut cours et trois nouvelles est de type boolean et contient vrai si l’objet est cré
//méthode creation() affichera la date et l’heure de la création de l’objet., la 
//afficher() la date et l’heure courante, la méthode duree() le nombre de secondes depuis la 
//création de l’objet.

//创建一个名为 Calendar2 的类，继承自 Calendar 类。该类需要包含以下功能：
//属性 cours：是一个布尔类型的属性，表示对象是否已经创建，如果已创建则值为 true，否则为 false。
//方法 creation()：显示对象创建的日期和时间。
//方法 afficher()：显示当前的日期和时间。
//方法 duree()：计算从对象创建到当前时间经过的秒数。

package atelier07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


public class Calendar2 extends GregorianCalendar {
	private boolean cours;

	public void creation(){
	}
	public void afficher() {
	}
	public void duree() {
}