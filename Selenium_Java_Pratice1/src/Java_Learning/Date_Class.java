package Java_Learning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("mm/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("mm/d/yyyy hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		System.out.println(sd.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
	}

}
