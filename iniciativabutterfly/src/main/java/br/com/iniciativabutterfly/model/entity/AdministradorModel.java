package br.com.iniciativabutterfly.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class AdministradorModel {

	@GeneratedValue
	@Id
	private long id;
	
	 @NotNull
	 @Size(min=5, max = 60)
	private String nome;

	 @NotNull
	 @Size(min=5, max = 60)
	private String trello;

	 @NotNull
	 @Size(min=5,max = 60)
	private String github;

	 @NotNull
	 @Size(min=5, max = 500)
	private String objetivo;

	 @NotNull
	 @Size(min=5, max = 60)
	 @Pattern(regexp =
	 "^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$")
	private String email;

	 @NotNull
	 @Size(min=5, max = 60)
	private String skype;

	private String disponibilidade;

	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTrello() {
		return trello;
	}

	public void setTrello(String trello) {
		this.trello = trello;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}