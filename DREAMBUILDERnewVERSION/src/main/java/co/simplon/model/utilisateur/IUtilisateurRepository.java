package co.simplon.model.utilisateur;

//import java.time.LocalDateTime;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.CrossOrigin;


//@CrossOrigin
@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	
	boolean existsByEmail(String email);
	
	Utilisateur findByEmail(String email);

	
}
