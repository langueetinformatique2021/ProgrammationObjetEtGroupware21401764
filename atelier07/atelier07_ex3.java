package atelier07;

import java.util.Calendar;
//这行代码导入了 Calendar 类，它是 Java 中用于处理日期和时间的类。Calendar 可以获取当前的日期和时间，也可以进行一些日期计算操作
import java.text.SimpleDateFormat;
//这行代码导入了 SimpleDateFormat 类，它是 Java 中用于格式化日期和时间的类。通过 SimpleDateFormat，我们可以自定义日期和时间的格式，使其显示为我们想要的样式。
public class DateTimeDisplay {
//这是类的声明部分。我们创建了一个名为 DateTimeDisplay 的类。这个类的作用是获取当前的日期和时间，并将其打印出来。
    // Method to display current date and time
    public static void displayDateTime() {
  //这里定义了一个公共的静态方法 displayDateTime()，它不接受任何参数，也不返回值。这个方法的作用是获取并显示当前的日期和时间。
    //public 表示这个方法可以被其他类访问。
    //static 表示这个方法是静态的，可以在没有创建类实例的情况下调用 
        // Create a Calendar object to get the current date and time
        Calendar calendar = Calendar.getInstance();
        //这行代码通过调用 Calendar.getInstance() 来创建一个 Calendar 对象。这个对象包含了当前的日期和时间信息。
        // Use SimpleDateFormat to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //这行代码创建了一个 SimpleDateFormat 对象 dateFormat，它将日期格式化为 "dd/MM/yyyy"，即 日/月/年 格式。
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
       //这行代码创建了另一个 SimpleDateFormat 对象 timeFormat，它将时间格式化为 "HH:mm:ss"，即 小时:分钟:秒 格式。 
        // Print the formatted date and time
        System.out.println("Current Date: " + dateFormat.format(calendar.getTime()));
        //这行代码使用 dateFormat.format(calendar.getTime()) 将 calendar 中的日期格式化为字符串，并打印出当前的日期。calendar.getTime() 返回的是当前的日期和时间（Date 对象）。
        System.out.println("Current Time: " + timeFormat.format(calendar.getTime()));
        //这行代码使用 timeFormat.format(calendar.getTime()) 将 calendar 中的时间格式化为字符串，并打印出当前的时间。
    }

    public static void main(String[] args) {
    	//这是程序的入口点，main 方法是 Java 程序执行的起始位置。每当我们运行这个程序时，main 方法会被执行。
        // Call the method to display current date and time
        displayDateTime(); //在 main 方法中，我们调用了 displayDateTime() 方法来显示当前的日期和时间。
    }
}// 这是类和方法的结束括号，标志着类和方法的结束。
