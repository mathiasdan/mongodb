package fr.mainiot.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mainiot.spring.modeles.Personne;
import fr.mainiot.spring.repositories.PersonneRepository;

@RestController
@RequestMapping("/api")
public class PersonneController {

	@Autowired
	private PersonneRepository personneRepository;

	@RequestMapping("/personnes")
	public List<Personne> getPersonnes() {
		return personneRepository.findAll();
	}

}
