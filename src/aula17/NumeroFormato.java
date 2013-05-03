package aula17;

import java.text.NumberFormat;
import java.util.Locale;

public class NumeroFormato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double  d=14456789.15;
		Locale.setDefault(new Locale("it"));
		NumberFormat format=NumberFormat.getCurrencyInstance();
		String numeroFormatado=format.format(d);
		System.out.println(numeroFormatado);
		
		format=NumberFormat.getInstance();
		numeroFormatado=format.format(d);
		System.out.println(numeroFormatado);

	}

}
