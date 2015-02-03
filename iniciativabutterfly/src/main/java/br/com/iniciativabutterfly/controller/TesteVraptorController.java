package br.com.iniciativabutterfly.controller;


import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.iniciativabutterfly.model.dao.impl.TesteVraptorDao;
import br.com.iniciativabutterfly.model.entity.TesteVraptor;

@Controller
public class TesteVraptorController{

	@Inject
    private Result result;
	
	@Inject
	private TesteVraptor tv;

	@Inject
	private TesteVraptorDao dao;
	
	
	@Path("/adiciona")
	public void adiciona() {
//		tv.setNomeFramework("Vraptor");
//		TV.SETDESCRICAOFRAMEWORK(" TECNOLOGIAS ( CDI + JBOSS WILDFLY 8.0 + JPA(HIBERNATE) + POSTGRES + ECLIPSE MARS");
//		tv.setVersion("version 4.x");

		dao.adiciona(tv);
		
		result.include("tv",tv);
		
		//result.include("tv",tv).forwardTo("/WEB-INF/jsp/index/adiciona.jsp");
		//result.redirectTo("teste3");

    }

	

	
//	public void teste1(){
//	}
//	
//	
//	@Path("/teste3")
//	public void index2() {
//		tv.setNomeFramework("Vraptor");
//		tv.setDescricaoFramework("- CDI + JBOSS+ 2");
//		//result.include("tv",tv).forwardTo("/WEB-INF/jsp/index/teste1.jsp");
//		result.include("tv",tv).redirectTo(this).teste1();
//    }

	
	
}
