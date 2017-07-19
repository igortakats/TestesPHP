package br.com.igita.beans;

public class FonteDados implements FonteDadosIntf {

	private static final long serialVersionUID = -1764349061876402672L;
	
	private String arquivo;

	public void init() {
		System.out.println("Inicializei a classe " + this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("Finalizando a classe " + this.getClass().getName());
	}
	
	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
}
