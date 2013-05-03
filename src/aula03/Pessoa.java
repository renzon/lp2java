package aula03;






public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}



	public Pessoa(String nome, int idade) {
		System.out.println("Construtor 2 args de pessoa");
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(){
		this("Renzo",30);
		System.out.println("Construtor vazio de pessoa");
		
	}

	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String cumprimentar(){
		return "Olá eu sou o(a) "+this.nome;
	}



	@Override
	public int compareTo(Pessoa o) {
		if (o==null || this.getNome()==null){
			return -1;
		}
		
		if(this.getNome().equals(o.getNome())){
			Integer minhaIdade=getIdade();
			Integer outraIdade=o.getIdade();
			return minhaIdade.compareTo(outraIdade);
		}
		return getNome().compareTo(o.getNome());
	}

}
