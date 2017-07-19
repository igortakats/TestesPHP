package br.com.igita.beans.autowiring.DAO;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

import br.com.igita.beans.autowiring.DAO.base.DataSource;

@Named("daoProduto")
public class DAOProduto implements Serializable {

	private static final long serialVersionUID = 5569472460375237472L;

	@Qualifier("dataSourceUsuario")
	private DataSource dataSource;
	
	@PostConstruct
	public void init() {
		
	}
	
	@PreDestroy
	public void destroy() {
		
	}
}
