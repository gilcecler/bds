package com.devsuperior.desafio.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;

	@OneToMany(mappedBy = "categoria")
	private List<Atividade> atividades = new ArrayList<>();

	public Categoria() {
	}

	public Categoria(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return descricao;
	}

	public void setName(String name) {
		this.descricao = name;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Categoria category = (Categoria) o;

		return Objects.equals(id, category.id);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
