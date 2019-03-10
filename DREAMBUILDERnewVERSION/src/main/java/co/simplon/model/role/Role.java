package co.simplon.model.role;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import co.simplon.model.utilisateur.Utilisateur;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
@ToString
@Data
@Entity
public class Role {
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire générée de façon automatique , La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données. Donc une auto-increment
	@Setter(AccessLevel.NONE)
	private Long id; //long : un entier relatif long (entre -9 223 372 036 854 775 808 et 9 223 372 036 854 775 807).
	
	@Setter(AccessLevel.NONE)
	private LocalDateTime creationDate = LocalDateTime.now();	
	
	private String Admin;
	
	private String UserPremium;
	

	private String UserNormal;
	
	protected Role() {}

	public Role(Long id, LocalDateTime creationDate, String admin, String userPremium, String userNormal) {
		this.id = id;
		this.creationDate = creationDate;
		Admin = admin;
		UserPremium = userPremium;
		UserNormal = userNormal;
	}
}
