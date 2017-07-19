package br.com.igita.beans;

public class HelloSpring implements HelloSpringIntf {

	String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void hello() {
		
		System.out.printf("Oi %s, bem vendo ao Spring!", this.nome);

	}

}
