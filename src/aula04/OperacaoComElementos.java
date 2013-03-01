package aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperacaoComElementos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] v={0,1,2};
		List<Integer> inteiros=Arrays.asList(v);
		List<Integer> nova=new ArrayList<Integer>();
		for(int i:inteiros){
			nova.add(i+1);	
		}
		System.out.println(nova);

	}

}
