package co.simplon.model.role;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import co.simplon.model.utilisateur.Utilisateur;
import lombok.Data;
import lombok.ToString;


@ToString
@Data
@Entity
public class Rolestatut {
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire générée de façon automatique , La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données. Donc une auto-increment
	private Long id; //long : un entier relatif long (entre -9 223 372 036 854 775 808 et 9 223 372 036 854 775 807).
		
		
	private String name;

	protected Rolestatut() {}
//	
//	@OneToMany
//	private Set<Utilisateur> utilisateur = new HashSet<Utilisateur>();
	
//	@ManyToOne
//	private Utilisateur userroles;

	public Rolestatut(String name) {
		this.name = name;
	}

	
	
	
}
