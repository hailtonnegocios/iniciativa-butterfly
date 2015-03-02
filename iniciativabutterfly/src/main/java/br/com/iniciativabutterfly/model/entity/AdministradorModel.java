package br.com.iniciativabutterfly.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class AdministradorModel {

	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Id
	private long id;
	
	@NotNull(message="{administrador.nome.vazio}")
	@Size(min=3, max = 60)
	private String nome;

	@NotNull(message = "{administrador.trello.vazio}")
	@Size(min=5, max = 60)
	private String trello;

	@NotNull(message = "{administrador.github.vazio}")
	@Size(min=5,max = 60)
	private String github;

	@NotNull(message = "{administrador.objetivo.vazio}")
	@Size(min=5, max = 500)
	private String objetivo;

	@NotNull(message = "{administrador.email.vazio}")
	@Size(min=5, max = 60)
	@Pattern(regexp =
	"^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$")
	private String email;

	@NotNull(message = "{administrador.skype.vazio}")
    @Size(min=5, max = 60)
	private String skype;

	private String disponibilidade;

	private String senha;


}