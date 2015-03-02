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

	private final Validator validator;

	@Inject
	private Result result;
	@Inject
	private AdministradorDao dao;
	
    protected AdministradorController() {
        this(null);
    }
	
	@Inject
	public AdministradorController(Validator validator) {
		this.validator = validator;
	}
	
	public void cadastro() {
	}
	
	public void adiciona(@Valid AdministradorModel administradorModel) {
		
			validator.onErrorRedirectTo(this).cadastro();
//			validator.onErrorUsePageOf(this).cadastro();

		
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