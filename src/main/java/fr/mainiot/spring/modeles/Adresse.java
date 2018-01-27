
package fr.mainiot.spring.modeles;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Adresse {

	private String addresseLigneUn;
	private String addresseLigneDeux;
	private String ville;

	public Adresse(final String addresseLigneUn, final String addresseLigneDeux, final String ville) {
		this.addresseLigneUn = addresseLigneUn;
		this.addresseLigneDeux = addresseLigneDeux;
		this.ville = ville;
	}
}
