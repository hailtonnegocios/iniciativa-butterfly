package br.com.iniciativabutterfly.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode @ToString
public class TesteVraptor {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "teste_id_seq")
	@SequenceGenerator(name = "teste_id_seq", sequenceName = "teste_id_seq")
	@Getter	@Setter
	private String nomeFramework;
	
	@Getter	@Setter
	private String descricaoFramework;

	@Getter	@Setter
	private String version;
	
}
