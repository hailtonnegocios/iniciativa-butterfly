package br.com.iniciativabutterfly.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode @ToString
public class TesteVraptor {
	
	@Id
	@Getter	@Setter
	private String nomeFramework;
	
	@Getter	@Setter
	private String descricaoFramework;

	@Getter	@Setter
	private String version;
	
}
