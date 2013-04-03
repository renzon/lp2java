package aula07;

public class TelefonerReal implements Telefone {

	public String telefonar(String numero) throws TelefoneErradoException {
		if (numero==null){
			return null;
		}else if(numero.length()!=9){
			throw new TelefoneErradoException();
		}
		System.out.println("******ESTOU LINGADO DE VDD, GASTANDO $$$$$$$");
		return "Ligando de verdade para o numero " +numero;
	}

}
