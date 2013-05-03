package aula16;

public class Usuario {
	public Usuario(String login, String senha, int codigo) {
		super();
		this.login = login;
		this.senha = senha;
		this.codigo = codigo;
	}
	public String login;
	public String senha;
	private int codigo;
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", codigo="
				+ codigo + "]";
	}
	
	private String teste(String arg){
		return "Metodo da classe Usuario "+arg;
	}
	
	

}
