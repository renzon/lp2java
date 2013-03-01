package aula04;

import java.util.HashMap;
import java.util.Map;

public class MapaTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> algarismos=new HashMap<Integer, String>();
		algarismos.put(0, "zero");
		algarismos.put(1, "um");
		
		System.out.println(algarismos.get(1));
		String celular="1010100001";
		for(int i=0;i<celular.length();i++){
			String c=""+celular.charAt(i);
			int a=Integer.parseInt(c);
			System.out.println(algarismos.get(a)+",");
		}
		
		
		for(int k: algarismos.keySet()){
			System.out.println("Chave: "+k+". Valor: "+algarismos.get(k));
		}
		

	}

}
