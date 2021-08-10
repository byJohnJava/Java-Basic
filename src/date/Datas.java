package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		
		Date y1 = sdf1.parse("14/01/1998");
		Date y2 = sdf2.parse("30/10/2006 10:25:28");
		Date y3 = Date.from(Instant.parse("2020-06-10T20:20:05Z"));
		
		
		System.out.println("-GMT Brazil (-03-00)-");
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("X4: " + sdf2.format(x4));
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("Y3: " + sdf2.format(y3));
		System.out.println("-----GMT Default-----");
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("Y3: " + sdf3.format(y3));
		
	}

}
