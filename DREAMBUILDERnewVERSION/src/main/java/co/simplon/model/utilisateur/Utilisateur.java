package co.simplon.model.utilisateur;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import co.simplon.model.annonce.Annonce;
import co.simplon.model.role.Role;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
@ToString
@Data
@Entity
public class Utilisateur {
	
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Long id;
	
	@Setter(AccessLevel.NONE)
	private LocalDateTime creationDate = LocalDateTime.now();	
	
	private Boolean actif;

	@NotEmpty
	@Size(min = 1, max = 90)
	private String nom;
	
	@NotEmpty
	@Size(min = 1, max = 90)
	private String prenom;
	
	@NotEmpty
	@Size(min = 1, max = 100)
	@Email
	private String email;
	
	@NotEmpty
	@Size(min = 1, max = 10)
	private String login;
	
	@NotEmpty
	@Size(min = 8, max = 8)
	private String password;
	
	@JoinColumn
	@OneToOne
	private Annonce annonce;
	
	@JoinColumn
	@OneToOne
	private Role role;
	
	protected Utilisateur() {}

	public Utilisateur(Long id, LocalDateTime creationDate, Boolean actif,
			@NotEmpty @Size(min = 1, max = 90) String nom, @NotEmpty @Size(min = 1, max = 90) String prenom,
			@NotEmpty @Size(min = 1, max = 100) @Email String email, @NotEmpty @Size(min = 1, max = 10) String login,
			@NotEmpty @Size(min = 8, max = 8) String password, Annonce annonce, Role role) {
		this.id = id;
		this.creationDate = creationDate;
		this.actif = actif;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.annonce = annonce;
		this.role = role;
	}
		
}
