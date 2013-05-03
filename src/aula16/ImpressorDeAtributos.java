package aula16;

import java.lang.reflect.Field;

public class ImpressorDeAtributos {

	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Usuario usuario=new Usuario("r","abc123", 11);
		Endereco endereco=new Endereco("Rua 2");
		String representacao="";
		System.out.println("Endereço");
		representacao=imprimirAtributos(endereco);
		System.out.println(representacao);
		System.out.println("Usuario");
		representacao=imprimirAtributos(usuario);
		System.out.println(representacao);
		
		System.out.println(usuario);
	}

	private static String imprimirAtributos(Object obj) throws IllegalArgumentException, IllegalAccessException {
		StringBuilder builder=new StringBuilder();
		Class classe=obj.getClass();
		Field[] campos=classe.getDeclaredFields();
		for(Field c:campos){
			c.setAccessible(true);
			builder.append(c.getName());
			if("codigo".equals(c.getName())){
				c.set(obj, 21);
			}
			builder.append("=");
			
			String valor=c.get(obj).toString();
			builder.append(valor);
			builder.append("\n");
			
		}
		return builder.toString();
	}

}
