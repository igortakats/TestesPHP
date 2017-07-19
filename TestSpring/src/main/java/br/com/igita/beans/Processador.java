package br.com.igita.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/*
	
	It's not being recommended acordding article published at address:
	
	https://tamasgyorfi.net/2014/02/18/springs-beanfactoryaware-dos-and-donts/
	
	The explanation is below:
	
	
	Do not inject the bean factory just to publish it to other beans. The injected bean 
	factory should never be published; if you end up writing a getter for it, that should ring the bell:


public class OneBean implements BeanFactoryAware {
 
    private BeanFactory beanFactory;
 
    //....
 
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
 
    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}

This should be avoided, as this anti-pattern does not encourage good dependency injection. 
In most of the cases dependencies should come through constructor arguments; in more rare 
cases through method parameters.

Do not inject the bean factory just for getting beans by their name.


public class OneBean implements BeanFactoryAware {
 
    private BeanFactory beanFactory;
 
    //....
 
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
 
    public void doAwesomeThings() {
        //...
        AwesomeBean awesomeBean = (AwesomeBean)beanFactory.getBean("myAwesomeBean");
        awesomeBean.doSomeWork();
        //...
    }
}

This – again – is not good practice. If you do this, it is not worth doing dependency injection, 
as the snipped above is not much better than creating objects with the new keyword. 
Not to mention the hardcoded bean name, which is an anti-pattern in itself, but leave that one for now.

So, when to inject the bean factory? Frankly, I cannot think of very many situations when 
injecting a bean factory is a good idea. The only acceptable situation that I can think of 
is when you have a group of similar beans and have to select the one to us after 
the container has started. Let’s take an example: You have support for several 
credit cards in your application. The user can select their card type through a user interface. 
In the business logic, you need the correct credit card handler. 
You cannot inject this dependency at start up time as you don’t know what to inject; you have 
to defer this decision until the user has made their selection. Now, you can have something like this:


public class CreditCardProcessorFactory implements BeanFactoryAware {
 
 private BeanFactory beanFactory;
 private static final String CARD_TYPE_SUFFIX = "CardHandler";
 //....
 
 public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
 this.beanFactory = beanFactory;
 }
 
 public CreditCardProcessor getCreditCardProcessor(String cardType) {
 return (CreditCardProcessor)beanFactory.getBean(cardType + CARD_TYPE_SUFFIX);
 }
}
This way you can avoid injecting all the credit card processors you support and use only one of them.

The process is very similar for ApplicationContextAware too. However, it should be even more rare 
when you need the whole ApplicationContext and not just the BeanFactory.
 
 
 */

public class Processador implements BeanFactoryAware{
	
	private FonteDados fonteDados;
	
	private Impressor impressor;
	
	private String arquivo;
	
	private BeanFactory beanFactory;
	
	public Processador(FonteDados fonteDados, Impressor impressor) {
		
		this.fonteDados = fonteDados;
		this.impressor = impressor;
		
	}

	public Processador() {
		super();
	}

	public void init() {
		System.out.println("Inicializei a classe " + this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("Finalizando a classe " + this.getClass().getName());
	}
	
	public FonteDados getFonteDados() {
		return fonteDados;
	}

	public void setFonteDados(FonteDados fonteDados) {
		this.fonteDados = fonteDados;
	}

	public Impressor getImpressor() {
		return impressor;
	}

	public void setImpressor(Impressor impressor) {
		this.impressor = impressor;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		this.beanFactory = beanFactory;
		
	}

	
}
