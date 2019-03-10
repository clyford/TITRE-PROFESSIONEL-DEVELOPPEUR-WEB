package co.simplon.model.annonce;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import co.simplon.model.utilisateur.Utilisateur;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Entity
public class Annonce {
	@Id //pour generer une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Long id;
	
	@Setter(AccessLevel.NONE)
	private LocalDateTime creationDate = LocalDateTime.now();
	
	private Boolean actif;
	
	@NotEmpty
	@Size(min = 1, max = 90)
	private String ville;
	
	@NotEmpty
	@Size(min = 1, max = 4000)
	private String texte;
	
	@NotEmpty
	@Size(min = 1, max = 90)
	private String metier;

	protected Annonce() {}

	public Annonce(Long id, LocalDateTime creationDate, Boolean actif, @NotEmpty @Size(min = 1, max = 90) String ville,
			@NotEmpty @Size(min = 1, max = 4000) String texte, @NotEmpty @Size(min = 1, max = 90) String metier) {
		this.id = id;
		this.creationDate = creationDate;
		this.actif = actif;
		this.ville = ville;
		this.texte = texte;
		this.metier = metier;
	}
	
}
