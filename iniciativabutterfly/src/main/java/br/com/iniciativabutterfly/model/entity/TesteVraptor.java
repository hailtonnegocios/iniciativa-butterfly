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
@EqualsAndHashCode
@ToString
public class TesteVraptor {

	@Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private String nomeFramework;

	@Getter
	@Setter
	private String descricaoFramework;

	@Getter
	@Setter
	private String version;

}
