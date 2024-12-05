//Ecrire un programme exécutable, utilisant les deux classes, 
//permettant d’afficher la date et l’heure de la création d’un objet de type GregorianCalendar


package atelier07;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.SimpleTimeZone;
import java.util.Date;
//Calendar：提供用于操作日期和时间的功能的抽象类。
//GregorianCalendar：是 Calendar 类的一个子类，使用公历（格里历）来表示日期和时间。
//TimeZone：用于表示时区。
//SimpleTimeZone：TimeZone 类的一个实现，允许定义具体的时区和夏令时规则。
//Date：表示一个特定的瞬间，精确到毫秒
public class testGregorianCalendar {
	
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		 // get the supported ids for GMT-08:00 (Pacific Standard Time)
		 String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
		 //这里通过传递时区偏移量（GMT-08:00，即太平洋标准时间）来获取所有支持该时区的 ID。-8 * 60 * 60 * 1000 表示太平洋标准时区的 UTC 偏移量为 -8 小时（即 GMT-08:00）。
		 // if no ids were returned, something is wrong. get out.
		 if (ids.length == 0)
		     System.exit(0);
		
		  // begin output
		 System.out.println("Current Time");
		
		 // create a Pacific Standard Time time zone
		 //创建一个 SimpleTimeZone 对象，表示太平洋夏令时（PDT），并根据所选的时区 ID 设置它。
		 SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
		
		 // set up rules for Daylight Saving Time
		 pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		 pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		//这段代码设置了夏令时的开始和结束规则：开始规则：每年 4 月的第一个星期日，时间推迟 2 小时（即进入夏令时）。结束规则：每年 10 月的最后一个星期日，时间恢复正常。
		 // create a GregorianCalendar with the Pacific Daylight time zone
		 // and the current date and time
		 Calendar calendar = new GregorianCalendar(pdt);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);
	//使用 SimpleTimeZone 对象创建 GregorianCalendar 实例。 使用 Date 类获取当前的日期和时间，并将其设置到 calendar 对象中。	
		 // print out a bunch of interesting things
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		                    + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		 System.out.println("DST_OFFSET: "
		                    + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
	//这段代码逐一打印出 calendar 中存储的时间和日期的各种属性：

//calendar.get(Calendar.ERA)：表示纪元（公元前或公元后）。
//calendar.get(Calendar.YEAR)：当前年份。
//calendar.get(Calendar.MONTH)：当前月份（从 0 开始）。
//calendar.get(Calendar.WEEK_OF_YEAR)：当前年份中的第几周。
//calendar.get(Calendar.DATE)：当前日期。
//calendar.get(Calendar.DAY_OF_MONTH)：当前日期是当月的第几天。
//calendar.get(Calendar.DAY_OF_WEEK)：星期几（1 - 7，1 是星期天）。
//calendar.get(Calendar.AM_PM)：AM 或 PM。
//calendar.get(Calendar.HOUR)：12 小时制的小时数。
//calendar.get(Calendar.HOUR_OF_DAY)：24 小时制的小时数。
//calendar.get(Calendar.MINUTE)：分钟。
//calendar.get(Calendar.SECOND)：秒。
//calendar.get(Calendar.MILLISECOND)：毫秒。
//calendar.get(Calendar.ZONE_OFFSET)：时区偏移量（单位为毫秒）。
//calendar.get(Calendar.DST_OFFSET)：夏令时偏移量（单位为毫秒）	
		 System.out.println("Current Time, with hour reset to 3");
		 calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
		 calendar.set(Calendar.HOUR, 3)
//这段代码清除 calendar 中的小时字段，然后设置小时为 3，接着打印当前时间的各个字段。
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		        + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
		 System.out.println("DST_OFFSET: "
		        + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
	}
	

}
