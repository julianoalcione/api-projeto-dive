package br.com.dive;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dive.model.Animal;
import br.com.dive.repository.AnimalRepository;

@CrossOrigin
@RestController
public class AnimalController {
	
	@Autowired
    AnimalRepository animalRepository;
	
	@RequestMapping(value = "/animais", method = RequestMethod.GET)
	public List<Animal> listar() {
		return animalRepository.findAll();
	}
	
	@RequestMapping(value = "/salvar-animal", method = RequestMethod.POST)
	public Animal atualizarFicha(@RequestBody Animal novoAnimal) {
		return animalRepository.save(novoAnimal);
	}
	
	@RequestMapping(value = "/remover-animal", method = RequestMethod.POST)
	public boolean removerFicha(@RequestBody Animal animal) {
		boolean status;
		
		try {
			animalRepository.delete(animal);
			status = true;
		}catch (Exception e) {
			status = false;
		}
		
		return status;
	}
}