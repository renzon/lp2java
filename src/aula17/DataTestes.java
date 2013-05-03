package aula17;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class DataTestes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt","BR"));
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(new Date().getTime()-d.getTime());
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(Calendar.DAY_OF_MONTH, -35);
		System.out.println(calendar.getTime());
		DateFormat format=DateFormat.getDateInstance(DateFormat.SHORT);
		String dataFormatada=format.format(d);
		System.out.println(dataFormatada);
		format=DateFormat.getDateInstance(DateFormat.MEDIUM,new Locale("it"));
		dataFormatada=format.format(d);
		System.out.println(dataFormatada);
		format=DateFormat.getDateInstance(DateFormat.LONG);
		dataFormatada=format.format(d);
		System.out.println(dataFormatada);
		
		format=DateFormat.getDateInstance(DateFormat.FULL);
		dataFormatada=format.format(d);
		System.out.println(dataFormatada);
		
		
		

	}

}
