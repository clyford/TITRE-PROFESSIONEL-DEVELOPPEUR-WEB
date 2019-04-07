package co.simplon;

//import java.time.LocalDateTime;




import org.junit.After;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.simplon.model.annonce.Annonce;
import co.simplon.model.annonce.IAnnonceRepository;
import co.simplon.model.role.IRolestatutRepository;
import co.simplon.model.role.Rolestatut;
//import co.simplon.model.role.IRoleRepository;
//import co.simplon.model.role.Role;s
import co.simplon.model.utilisateur.IUtilisateurRepository;
import co.simplon.model.utilisateur.Utilisateur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DreambuildeRnewVersionApplicationTests {

	//private static final LocalDateTime LocalDateTime = null;

	@Autowired
	IRolestatutRepository rolestatut;


	@Autowired
	IAnnonceRepository annonce;

	@Autowired
	IUtilisateurRepository user;
	
	
	@Before
	public void setUp() throws Exception {	

	}

	@After
	public void tearDown() throws Exception {

	}
	@Test
	public void contextLoads() {
		
		Utilisateur pierot = new Utilisateur(null, false, "Storyboarder", "oeinull", "ninull", "lpiooalme@gmail.com", "nullos", "null0000");
		user.save(pierot);
		
		Utilisateur jiean = new Utilisateur(null, false, "Storyboarder", "oeinull", "ninull", "loniaoodopfe@gmail.com", "nullos", "null0000");
		user.save(jiean);
		
		Utilisateur frederick = new Utilisateur(null, false,  "Mamadou", "Mbele","MangaArtist", "rodrigueme@gmail.com", "nullos", "null0000");
		user.save(frederick);
		
		Utilisateur ronald = new Utilisateur(null, false, "Pierre", "dembele","Ecrivain",  "mariefe@gmail.com", "nullos", "null0000");
		user.save(ronald);
		
		Annonce mamadou= new Annonce("LILLE", "JPA Happy", "storyboarder", pierot);
		annonce.save(mamadou);
		
		Annonce dessinateur = new Annonce( "STRASBOURG", "innnn", "mangaartist", jiean);
		annonce.save(dessinateur);
		
		Annonce manga= new Annonce("LILLE", "JPA Happy", "storyboarder", ronald);
		annonce.save(manga);
		
		Annonce xavier = new Annonce( "STRASBOURG", "innnn", "mangaartist", frederick);
		annonce.save(xavier);

		
		
	
//		Rolestatut pierreot= new Rolestatut("administrateur");		rolestatut.save(pierreot);		
//		Rolestatut Premmiam= new Rolestatut( "premiumnormal");
//	rolestatut.save(Premmiam);
		
		
	}
	
}

