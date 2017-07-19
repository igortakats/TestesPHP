package br.com.igita.beans;

import java.io.Serializable;

public class Impressor implements Serializable{
	
	private static final long serialVersionUID = 343840261702765553L;
	
	private String impressor;
	private String fonteDados;
	
	public void init() {
		System.out.println("Inicializei a classe " + this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("Finalizando a classe " + this.getClass().getName());
	}
	
	public String getImpressor() {
		return impressor;
	}
	public void setImpressor(String impressor) {
		this.impressor = impressor;
	}
	public String getFonteDados() {
		return fonteDados;
	}
	public void setFonteDados(String fonteDados) {
		this.fonteDados = fonteDados;
	}

}
