package fr.mainiot.spring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.mainiot.spring.modeles.Personne;

@Repository
public interface PersonneRepository extends MongoRepository<Personne, String> {

}
