package br.com.igita.beans;

import java.io.Serializable;

public interface FactoryFonteDadosIntf extends Serializable{
	
	public abstract FonteDados criarFonteDados(String nomeFonteDados);
	
	public static FonteDados criarEstatico(String nomeFonteDados) {
		return null;
	}

	public abstract Object criarFonteDadosSemConstrutor();
}
