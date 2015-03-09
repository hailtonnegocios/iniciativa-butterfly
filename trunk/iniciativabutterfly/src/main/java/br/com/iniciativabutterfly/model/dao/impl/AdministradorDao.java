package br.com.iniciativabutterfly.model.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.iniciativabutterfly.model.entity.AdministradorModel;

public class AdministradorDao {

	@Inject
	private EntityManager em;

	public boolean existe(AdministradorModel administradorModel) {
		return !em.createQuery("from administradormodel u where u.email = "
				+ ":email and u.senha = :senha", AdministradorModel.class)
			.setParameter("email", administradorModel.getEmail())
			.setParameter("senha", administradorModel.getSenha())
			.getResultList().isEmpty();
	}

	public void adiciona(AdministradorModel administradorModel) {
			em.getTransaction().begin();
			em.persist(administradorModel);
			em.getTransaction().commit();
			System.out.println("Usuario ja cadastrado no sistema");
	}
	
	public void altera(AdministradorModel administradorModel) {
		em.getTransaction().begin();
		em.merge(administradorModel);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<AdministradorModel> lista() {
		List<AdministradorModel> lista = em.createQuery("from AdministradorModel as model order by model.id").getResultList();
		return lista;
	}
	
	public AdministradorModel buscaPorID(Long id) {
		return em.find(AdministradorModel.class, id);
	}
	
	public void remove(Long id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}
}
