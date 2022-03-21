package programa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hora {

	public static void main(String[] args) {

		SimpleDateFormat SDF1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss ");

		Date x1 = new Date();
		Date x2 = new Date();


		Calendar cal = Calendar.getInstance();
		cal.setTime(x2);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		x2 = cal.getTime();
		
		System.out.println("Data atual x1: " + SDF1.format(x1));
		System.out.println();
		System.out.println("4 horas a mais do horário local x2: " + SDF1.format(x2));

	}

}
