package br.com.iniciativabutterfly.connectionfactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionEntityManager {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("IniciativaButterfly");

	@Produces @RequestScoped
	public EntityManager getEntityManager() {
		System.out.println("inciou uma conexão com o banco de dados !");
		return emf.createEntityManager();
	}
	
	public void close(@Disposes EntityManager manager){
		System.out.println("encerrou a conexão com o banco de dados !");
		manager.close(); 
	}

}
