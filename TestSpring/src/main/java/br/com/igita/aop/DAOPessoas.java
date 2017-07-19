package br.com.igita.aop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAOPessoas {

    public void persistir(Pessoa[] pessoas, File arquivo) throws IOException {

    	int i = 1/0;
    	
        if (pessoas == null || pessoas.length == 0) {
            throw new IllegalArgumentException("Lisa de pessoas nula ou vazia");
        }

        if (arquivo == null) {
            throw new IllegalArgumentException("Arquivo nulo.");
        }
        
        if (arquivo.exists()) {
        	throw new IllegalArgumentException("O arquivo ja existe e nao pode ser sobrescrito");
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));

        oos.writeObject(pessoas);
        oos.close();
    }
    
	public Pessoa[] ler(File arquivo) throws IOException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));

        Pessoa[] resultado = null;

        try {
            resultado = (Pessoa[]) ois.readObject();
        } catch(ClassNotFoundException e) {
            throw new IOException("Deu pau!");
        } finally {
			ois.close();
		}

        return resultado;
    }

}
