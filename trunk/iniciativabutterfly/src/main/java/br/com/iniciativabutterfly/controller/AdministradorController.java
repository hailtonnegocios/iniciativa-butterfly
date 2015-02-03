package br.com.iniciativabutterfly.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.iniciativabutterfly.model.dao.impl.AdministradorDao;
import br.com.iniciativabutterfly.model.entity.AdministradorModel;
import br.com.iniciativabutterfly.util.GeraSenha;

@Controller
public class AdministradorController {

	private final Validator validation;
	private final Result result;
	private final EntityManager em;
	private final AdministradorDao dao;
	
	@Inject
	public AdministradorController(Result result, EntityManager em, AdministradorDao dao, Validator validator) {
		this.result = result;
		this.em = em;
		this.dao = dao;
		this.validation = validator;
	}
	
	public AdministradorController() {
		this(null, null, null, null);
	}
	
	public void cadastro() {
	}
	
//Estou dizendo que este metodo só recebe Post
//	@Post
	public void adiciona(@Valid AdministradorModel administradorModel) {
		validation.onErrorForwardTo(this).cadastro();{
		final String geraSenha = new GeraSenha().geraSenhaAlfanumerica();
		administradorModel.setSenha(geraSenha);
		dao.adiciona(administradorModel);
		result.include("novaSenha", geraSenha);
		result.include("novoAdministrador", administradorModel);
		}}
	
	public void lista() {
		result.include("listaAdministradores", dao.lista());
	}
	
	public void buscaPorId(AdministradorModel administradorModel) {
		result.include("resultado", dao.buscaPorID(administradorModel));
	}

}