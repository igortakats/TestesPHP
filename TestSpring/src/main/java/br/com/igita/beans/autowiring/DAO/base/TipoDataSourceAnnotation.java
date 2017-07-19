package br.com.igita.beans.autowiring.DAO.base;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RUNTIME)
@Target({ FIELD, PARAMETER })
@Qualifier
public @interface TipoDataSourceAnnotation {

	String valor();
	
}
