package aula16;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ExecutorDeMetodos {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Usuario usuario=new Usuario("r","abc123", 11);
		Endereco endereco=new Endereco("Rua 2");
		executarMetodoTesteSeHourver(endereco);
		executarMetodoTesteSeHourver(usuario);
		
	}

	private static void executarMetodoTesteSeHourver(Object obj) throws  SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class classe=obj.getClass();
		Method method;
		try {
			System.out.println("Metodos declarados na classe "+classe.getSimpleName());
			System.out.println(Arrays.asList(classe.getDeclaredMethods()));
			System.out.println("Metodos acessiveis na classe "+classe.getSimpleName());
			System.out.println(Arrays.asList(classe.getMethods()));
			method = classe.getDeclaredMethod("teste", String.class);
			method.setAccessible(true);
			String retorno=method.invoke(obj, "Reflection").toString();
			System.out.println("Retorno do metodo teste: "+retorno);
		} catch (NoSuchMethodException e) {
			System.out.println("não existe metodo teste na classe "+classe.getSimpleName());
		}
		
		
	}

}
