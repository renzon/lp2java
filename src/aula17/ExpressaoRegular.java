package aula17;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern padrao= Pattern.compile("ab");
		Matcher matcher=padrao.matcher("abacateab");
		while(matcher.find()){
			System.out.println("indice start: "+matcher.start());
			System.out.println("Grupo: "+matcher.group());
		}
		System.out.println("Metacaracteres ------------------");

		padrao= Pattern.compile("[^A-Z]");
		matcher=padrao.matcher("aba _1234657cateaBBKKHGHGFbasdffgsdfa");
		while(matcher.find()){
			System.out.println("indice start: "+matcher.start());
			System.out.println("Grupo: "+matcher.group());
		}
		
		
		System.out.println("Quantificadores ------------------");
		padrao= Pattern.compile("proj[^,]*");
		matcher=padrao.matcher("proj465.xls,pro.doc,projeto.ppt");
		while(matcher.find()){
			System.out.println("indice start: "+matcher.start());
			System.out.println("Grupo: "+matcher.group());
		}
		
		System.out.println("Validador email");
		
		padrao= Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z][a-zA-Z0-9]*\\.[a-zA-Z][a-zA-Z0-9]*");
		matcher=padrao.matcher("renzo@gmail.c");
		System.out.println(matcher.find());
		
		System.out.println("Split ------------------");
		System.out.println(Arrays.asList("1 #22233  #########232323".split(" #+")));
		

	}

}
