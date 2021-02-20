package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //indica que é uma entidade do JPA Hibernate
@Table(name = "postagem")//indica qual a tabela no SQL
public class Postagem {
	
	@Id //indica que é equivalente dp id da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHorario = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataHorario() {
		return dataHorario;
	}

	public void setDate(Date dataHorario) {
		this.dataHorario = dataHorario;
	}
	
	
}
