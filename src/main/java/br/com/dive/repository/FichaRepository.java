package br.com.dive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dive.model.Ficha;

public interface FichaRepository extends JpaRepository<Ficha, Long> {
	
}