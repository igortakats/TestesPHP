package br.com.igita.beans.autowiring.DAO.base;

import java.io.Serializable;

import javax.inject.Inject;
import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;

public abstract class AbstractDAO implements Serializable{

	private static final long serialVersionUID = -8851003400702941323L;
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

//	@Autowired(required=true)
//	@Required @Autowired
	@Inject
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}