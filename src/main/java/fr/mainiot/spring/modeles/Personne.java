package fr.mainiot.spring.modeles;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = { "id" })
@Document(collection = "personnes")
public class Personne {

	@Id
	private String id;
	private String mail;
	private Adresse addresse;

	public Personne(final String mail, final Adresse addresse) {
		this.mail = mail;
		this.addresse = addresse;
	}
}
