package annikonenkov.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TryDate {

	public static void main(String[] args) {
		Date date = new Date(0);
		
		LocalDate ld = LocalDate.ofEpochDay(0);
		
		System.out.println(date);
		
		Date d = Date.from(ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(ld);
		System.out.println(d);
		
		

	}

}
