package aula12;

public class BreakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			System.out.println();
			System.out.println(i);
			if (i==4){
				break;
			}else if(i==1){
				continue;
			}
			System.out.println("Exec fim do for");
		}

	}

}
