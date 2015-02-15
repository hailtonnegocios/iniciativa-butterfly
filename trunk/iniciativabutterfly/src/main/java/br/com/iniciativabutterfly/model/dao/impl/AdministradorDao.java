package br.com.iniciativabutterfly.model.dao.impl;

/**
* @author Vinicius Ribeiro
*
*/
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.iniciativabutterfly.model.entity.AdministradorModel;

public class AdministradorDao {

	private final EntityManager em;
	
	@Inject
	public AdministradorDao(EntityManager em) {
		this.em = em;
	}
	
	public AdministradorDao(){
		this(null); // para uso do CDI
	}

/**
 * @param administradorModel
 * @return Retorna se este usuario administrador ja existe
 */
	public boolean existe(AdministradorModel administradorModel) {
		return !em.createQuery("from administradormodel u where u.email = "
				+ ":email and u.senha = :senha", AdministradorModel.class)
			.setParameter("email", administradorModel.getEmail())
			.setParameter("senha", administradorModel.getSenha())
			.getResultList().isEmpty();
	}

	public void adiciona(AdministradorModel administradorModel) {
//		if (new AdministradorDao().existe(administradorModel) == true) {
			//Se o usuario nao existir eu adiciono ele no BD
			em.getTransaction().begin();
			em.persist(administradorModel);
			em.getTransaction().commit();
			em.close();
//		}
		System.out.println("Usuario ja cadastrado no sistema");
	}
	
	public void altera(AdministradorModel administradorModel) {
		em.getTransaction().begin();
		em.merge(administradorModel);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<AdministradorModel> lista() {
		List<AdministradorModel> lista = em.createQuery("from AdministradorModel as model order by model.id").getResultList();
		em.close();
		return lista;
	}
	
	public AdministradorModel buscaPorID(Long id) {
		return em.find(AdministradorModel.class, id);
	}
	
	public void remove(Long id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
		em.close();
	}
}
