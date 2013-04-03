package aula07;

public class TelefoneDeBrinquedo implements Telefone {

	@Override
	public String telefonar(String numero) {
		if (numero==null){
			return null;
		}else if(numero.length()!=9){
			throw new TelefoneErradoException();
		}
		return "Ligando de verdade para o numero " +numero;
	}

}
