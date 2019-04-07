package co.simplon.model.utilisateur;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import co.simplon.model.annonce.Annonce;
import lombok.Getter;
import lombok.Setter;
//import lombok.Setter;
//import lombok.ToString;
//@ToString
@Getter
@Setter
@Entity
public class Utilisateur {
	
	//@Setter(AccessLevel.NONE)
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Setter(AccessLevel.NONE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDateTime creationDate;// = LocalDateTime.now();	
	
	private Boolean actif;
	
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String nom;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String prenom;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String metiers;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)
	@Column(unique=true)*/
	@Email
	private String email;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String login;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String password;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Annonce> annonces;
	
//	@OneToMany(mappedBy="rolestatut")
//	private List<Rolestatut> roles;
	
//	@OneToMany 
//	private Set<Rolestatut> role = new HashSet<Rolestatut>();
	
	protected Utilisateur() {}

	public Utilisateur(LocalDateTime creationDate, Boolean actif, String nom, String prenom, String metiers,
		@Email String email, String login, String password) {
	this.creationDate = creationDate;
	this.actif = actif;
	this.nom = nom;
	this.prenom = prenom;
	this.metiers = metiers;
	this.email = email;
	this.login = login;
	this.password = password;
	}

//public Utilisateur(Boolean actif, String nom, String prenom, String metiers,
//		@Email String email, String login, String password) {
//	this(creationDate, actif, login, password, email, password, password, password);
//	if (roles != null) {
//		for (Rolestatut role : roles) {				
//			this.addRolestatut(role);
//		}
//	}
//}
//
//public void addRolestatut(Rolestatut role) {
//	if (role != null)
//		this.roles.add(role);
//}
//
//public void removeRole(Rolestatut role) {
//	if (role != null)
//		this.roles.remove(role);
//}
//
//public List<Rolestatut> getRoles() {	
//	return new ArrayList<Rolestatut>(roles);
//}	
	}

		
