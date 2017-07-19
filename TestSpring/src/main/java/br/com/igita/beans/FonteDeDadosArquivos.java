package br.com.igita.beans;

import java.io.File;
import java.util.List;
import java.util.Map;

public class FonteDeDadosArquivos implements FonteDadosIntf{

	private static final long serialVersionUID = 8966487946784336018L;

	private String arquivo;
	
	private List<String> arquivos;
	
	private List<File> arquivosFileIO;
	
	private Map<String, String> arquivosMap;

	public List<String> getArquivos() {
		return arquivos;
	}

	public void init() {
		System.out.println("Inicializei a classe " + this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("Finalizando a classe " + this.getClass().getName());
	}
	
	public void setArquivos(List<String> arquivos) {
		this.arquivos = arquivos;
	}

	public List<File> getArquivosFileIO() {
		return arquivosFileIO;
	}

	public void setArquivosFileIO(List<File> arquivosFileIO) {
		this.arquivosFileIO = arquivosFileIO;
	}

	public Map<String, String> getArquivosMap() {
		return arquivosMap;
	}

	public void setArquivosMap(Map<String, String> arquivosMap) {
		this.arquivosMap = arquivosMap;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	

}
