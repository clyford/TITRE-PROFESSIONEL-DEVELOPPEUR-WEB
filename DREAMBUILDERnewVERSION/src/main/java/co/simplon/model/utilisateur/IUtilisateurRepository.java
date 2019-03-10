package co.simplon.model.utilisateur;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	

	//Utilisateur findByemail(String email);
	
	

	boolean existsByLogin(String login);

	Utilisateur findByLogin(String login);

	//User findByApiToken(String apiToken);

	Utilisateur findByEmail(String email);

	//User findByLastIp(String ip);

	//User findByValidationCode(String code);

	/*List<User> findByRolesContains(Role role);

	List<User> findByEnabledTrueOrderByLoginAsc();

	List<User> findByEnabledFalseOrderByLoginAsc();

	List<User> findByLastAccessDateBetweenOrderByLoginAsc(LocalDateTime debut, LocalDateTime fin);

	List<User> findByApiTokenExpirationDateBetweenOrderByLoginAsc(LocalDateTime debut, LocalDateTime fin);*/
}
