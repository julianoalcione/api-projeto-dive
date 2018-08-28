package br.com.dive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dive.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
	
}