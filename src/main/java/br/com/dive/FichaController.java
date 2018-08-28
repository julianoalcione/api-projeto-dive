package br.com.dive;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dive.model.Ficha;
import br.com.dive.repository.FichaRepository;

@CrossOrigin
@RestController
public class FichaController {
	
	@Autowired
    FichaRepository fichaRepository;
	
	@RequestMapping(value = "/fichas", method = RequestMethod.GET)
	public List<Ficha> listar() {
		return fichaRepository.findAll();
	}
	
	@RequestMapping(value = "/salvar-ficha", method = RequestMethod.POST)
	public Ficha atualizarFicha(@RequestBody Ficha novaFicha) {
		return fichaRepository.save(novaFicha);
	}
	
	@RequestMapping(value = "/remover-ficha", method = RequestMethod.POST)
	public boolean removerFicha(@RequestBody Ficha ficha) {
		boolean status;
		
		try {
			fichaRepository.delete(ficha);
			status = true;
		}catch (Exception e) {
			status = false;
		}
		
		return status;
	}
}
