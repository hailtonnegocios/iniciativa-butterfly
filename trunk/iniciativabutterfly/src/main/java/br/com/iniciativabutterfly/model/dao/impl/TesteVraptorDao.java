package br.com.iniciativabutterfly.model.dao.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.iniciativabutterfly.model.dao.inter.InterfaceIniciativaButterFly;
import br.com.iniciativabutterfly.model.entity.TesteVraptor;

public class TesteVraptorDao implements InterfaceIniciativaButterFly {
	
	@Inject
	private EntityManager manager;

	public void adiciona(TesteVraptor tv) {
		manager.getTransaction().begin();
		manager.persist(tv);
		manager.getTransaction().commit();
	}
}
