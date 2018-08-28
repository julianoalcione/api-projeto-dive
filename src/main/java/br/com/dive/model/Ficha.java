package br.com.dive.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="ficha")
public class Ficha {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String dataDeCadastro;
	private String observacoes;
	private boolean status;
	
	@ManyToMany
	private List<Animal> animais = new ArrayList<Animal>();
	
	public Ficha(){

	}
	
	public Ficha(Long id, String dataDeCadastro, String observacoes, boolean status, List<Animal> animais){
		this.id = id;
		this.dataDeCadastro = dataDeCadastro;
		this.observacoes = observacoes;
		this.status = status;
		this.animais = animais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDataDeCadastro() {
		return dataDeCadastro;
	}
	
	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public List<Animal> getAnimais() {
		return animais;
	}
	
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
}
