package co.simplon.model.simple_user;

import javax.persistence.Entity;

import co.simplon.model.utilisateur.Utilisateur;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@ToString
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Simple_user extends Utilisateur{
	
	private String metiers;
	private Boolean actif;
	protected Simple_user() {}
	public Simple_user(String metiers, Boolean actif) {
		this.metiers = metiers;
		this.actif = actif;
	}
	
}
