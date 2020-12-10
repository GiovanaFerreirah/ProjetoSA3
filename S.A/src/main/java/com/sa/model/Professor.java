package com.sa.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
@DiscriminatorValue(value = "P")
public class Professor extends Usuario{

	
	@ManyToMany
	@JoinTable(
			name="professor_materia",
			joinColumns=@JoinColumn(name="professor_id"),
			inverseJoinColumns=@JoinColumn(name="materia_id")
			)
	private List<Materia> materiasLecionadas;
	
	@ManyToMany(mappedBy = "professores")
	private List<Sala> salas;
	
	@ManyToMany
	@JoinTable(
			name="instituicaoP",
			joinColumns=@JoinColumn(name="professor_id"),
			inverseJoinColumns=@JoinColumn(name="instituicao_id")
			)   
	private List<Instituicao> instituicaoP;

	

	public List<Materia> getMateriasLecionadas() {
		return materiasLecionadas;
	}

	public void setMateriasLecionadas(List<Materia> materiasLecionadas) {
		this.materiasLecionadas = materiasLecionadas;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public List<Instituicao> getInstituicaoP() {
		return instituicaoP;
	}

	public void setInstituicaoP(List<Instituicao> instituicaoP) {
		this.instituicaoP = instituicaoP;
	}

	

	
	
	
}
