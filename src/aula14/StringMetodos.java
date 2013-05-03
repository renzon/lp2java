package aula14;

import java.util.Arrays;

public class StringMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String renzo="Renzo";
		System.out.println(renzo.charAt(0));
		System.out.println(renzo.concat( " Nuccitelli"));
		System.out.println(renzo.equalsIgnoreCase("reNzO"));
		System.out.println(renzo.length());
		System.out.println(renzo.replaceFirst("Re", "rE"));
		System.out.println(renzo.substring(1));
		System.out.println(renzo.substring(1,4));
		System.out.println(renzo.toLowerCase());
		System.out.println(renzo.toUpperCase());
		System.out.println("."+"    espaços    ".trim()+".");
		System.out.println(Arrays.asList(renzo.split("n")));
		System.out.println(Arrays.asList("r.jpg,blah.png,z.gif".split(",")));
		

	}

}
