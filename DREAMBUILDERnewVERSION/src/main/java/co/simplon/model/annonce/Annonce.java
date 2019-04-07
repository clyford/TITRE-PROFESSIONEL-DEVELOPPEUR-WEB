package co.simplon.model.annonce;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.simplon.model.utilisateur.Utilisateur;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Entity
public class Annonce {
	//@Setter(AccessLevel.NONE)
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Setter(AccessLevel.NONE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDateTime creationDate = LocalDateTime.now();
	
	private Boolean actif;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String ville;
	
	/*@NotEmpty
	@Size(min = 1, max = 10090)*/
	private String texte;
	
	/*@NotEmpty
	@Size(min = 1, max = 90)*/
	private String metier;
	
	//@NotNull
	@JsonIgnore
	@ManyToOne
	private Utilisateur utilisateur;
	

	protected Annonce() {}


	public Annonce(String ville, String texte, String metier, Utilisateur utilisateur) {
		this.ville = ville;
		this.texte = texte;
		this.metier = metier;
		this.utilisateur = utilisateur;
	}

	

	
}
