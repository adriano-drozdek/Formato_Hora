package programa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {

	public static void main(String[] args) {

		SimpleDateFormat SDF1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss ");

		Date x1 = new Date();

		System.out.println("Data atual x1: " + SDF1.format(x1));
	}

}
