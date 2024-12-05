

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
	//你继承了 GregorianCalendar 类，并在类中定义了新的方法。
	//类中的属性 cours 和方法 creation(), afficher(), duree()
}
	private boolean cours; //私有属性
	//使用 private 修饰符来定义属性（或字段）是一种常见的封装技术，
//**私有属性（private）**确保只能通过类的内部代码访问这些属性，而外部代码无法直接访问和修改这些属性。这可以防止错误地修改对象的状态，确保对象的完整性和一致性。
//比如，你可能希望限制某个属性（如 cours）的值只能在特定条件下被修改，这样可以避免外部代码直接修改属性，从而影响类的状态。
	public void creation(){
	//**方法（函数）**通常用于定义类的行为，供外部代码访问。通过公开（public）方法，外部代码可以与对象进行交互。
	//afficher() 方法可能用于显示当前的日期和时间，duree() 方法可能用于计算时间差。这些方法需要公开，以便外部代码能够调用它们。如果你将方法设置为 private，则外部无法访问该方法，这将导致外部代码无法使用该类的功能。通常，我们将方法设置为 public，是因为方法是对象和外部代码之间交互的桥梁。
	}
	public void afficher() {
	}
	public void duree() {
}