package br.com.iniciativabutterfly.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.iniciativabutterfly.model.dao.impl.AdministradorDao;
import br.com.iniciativabutterfly.model.entity.AdministradorModel;
import br.com.iniciativabutterfly.util.GeraSenha;

@Controller
public class AdministradorController {

	@Inject
	private Validator validator;
	@Inject
	private Result result;
	@Inject
	private AdministradorDao dao;

//	@Inject
//	public AdministradorController(Result result,
//			AdministradorDao dao, Validator validator) {
//		this.result = result;
//		this.dao = dao;
//		this.validator = validator;
//	}
//
//	public AdministradorController() {
//		this(null, null, null);
//	}

	public void cadastro() {
	}

	// Estou dizendo que este metodo só recebe Post
	// @Post
	public void adiciona(@Valid AdministradorModel administradorModel) {

//		validator.check(administradorModel.getNome().isEmpty(), new SimpleMessage(
//				"administradorModel.nome", "Nome não pode estar vazio"));
//
//		validator.onErrorForwardTo(this).cadastro();
			final String geraSenha = new GeraSenha().geraSenhaAlfanumerica();
			administradorModel.setSenha(geraSenha);
			dao.adiciona(administradorModel);
			String mensagem = "Novo administrador "
					+ administradorModel.getNome() + " cadastrado com sucesso! "
					+ " sua nova senha é " + geraSenha;
			result.include("mensagem", mensagem);
			result.redirectTo(this).lista();
		
	}

	public void lista() {
		result.include("listaAdministradores", dao.lista());
	}
	
	public void editar(Long id) {
		result.include("administradorAlteracao", dao.buscaPorID(id));
	}
	
	public void atualiza(AdministradorModel administradorModel) {
		dao.altera(administradorModel);
		result.redirectTo(this).lista();
	}
	
	public void excluir(Long id) {
		dao.remove(id);
		result.redirectTo(this).lista();
	}

	public void buscaPorId(Long id) {
		result.include("resultado", dao.buscaPorID(id));
	}

}