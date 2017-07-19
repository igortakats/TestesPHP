package br.com.igita.beans.autowiring;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igita.beans.autowiring.DAO.DAOProduto;
import br.com.igita.beans.autowiring.DAO.DAOUsuario;
import br.com.igita.beans.autowiring.DAO.DAOVenda;

@Named("processador") //Colocado como exemplo, as tres anotacoes podem ser utilizadas: Component e Named
public class Processador implements Serializable {

	private static final long serialVersionUID = 7166532263669595271L;
	
	private DAOProduto daoProduto; 
	
	private DAOUsuario daoUsuario;
	
	private DAOVenda daoVenda;

	public DAOProduto getDaoProduto() {
		return daoProduto;
	}

	@Resource //Colocado como exemplo, as tres anotacoes podem ser utilizadas: Autowired, Resource, Inject
	public void setDaoProduto(DAOProduto daoProduto) {
		this.daoProduto = daoProduto;
	}

	public DAOUsuario getDaoUsuario() {
		return daoUsuario;
	}

	@Autowired //Colocado como exemplo, as tres anotacoes podem ser utilizadas: Autowired, Resource, Inject
	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

	public DAOVenda getDaoVenda() {
		return daoVenda;
	}

	public void setDaoVenda(DAOVenda daoVenda) {
		this.daoVenda = daoVenda;
	}


}