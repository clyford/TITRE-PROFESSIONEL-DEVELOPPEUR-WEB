package co.simplon;

import java.time.LocalDateTime;



import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.simplon.model.annonce.Annonce;
import co.simplon.model.annonce.IAnnonceRepository;
import co.simplon.model.role.IRoleRepository;
import co.simplon.model.role.Role;
import co.simplon.model.simple_user.ISimple_userRepository;
import co.simplon.model.simple_user.Simple_user;
import co.simplon.model.utilisateur.IUtilisateurRepository;
import co.simplon.model.utilisateur.Utilisateur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DreambuildeRnewVersionApplicationTests {

	//private static final LocalDateTime LocalDateTime = null;

	@Autowired
	IRoleRepository role;


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

		/*Utilisateur Pierre = new Utilisateur(1l, true, "Pierre", "Louis", "jeandujardin@gmail.com", "piere90", "secret1014");
		user.save(Pierre);*/

		/*Utilisateur jean = new Utilisateur(0l, true, "Pierre", "Louis", "jeandujardin@gmail.com", "piere90", "secret1014");
		user.save(jean);*/
		/*Utilisateur herve = new Utilisateur(3l, true, "Pierre", "Louis", "jeandujardin@gmail.com", "piere90", "secret1014");
		user.save(herve);*/

		/*Utilisateur herve = new Utilisateur(31l, true, "Pierre", "Louis", "jeandujardin@gmail.com", "piere90", "secret1014");
		user.delete(herve);*/
		/*Utilisateur herv = new Utilisateur(31l, true, "Poo", "Lou", "jeandujardin@gmail.com", "KAKA90", "secret1014");
		user.save(herv);*/
		/*Utilisateur herv8 = new Utilisateur(31l, null, true, "Chienne", "pute", "jeandujardin@gmail.com", "KAKA90", "secret1014");
		user.save(herv8);*/

		/*Utilisateur herv18 = new Utilisateur(31l, null, true, "Chiennedeguerre", "putain", "jeandujardin@gmail.com", "KAKA9090", "secret1014", null);
		user.save(herv18);*/

		/*Annonce dessinateur = new Annonce(null, null, null, "", null, null);
		annonce.save(dessinateur);

		Annonce pierre = new Annonce(0l, null, true, "FF", "null", "null");
		annonce.save(pierre);

		Annonce a = new Annonce(1l, null, true, "CACA", "PIPI", "RESTAU");
		annonce.save(a);

		Annonce B = new Annonce(2l, null, true, "CACA", "PIOPI", "RESTAU");
		annonce.save(B);

		Annonce C = new Annonce(2l, null, true, "CACA", "PIOPI", "RESTAU");
		annonce.save(C);*/
		/*Annonce dessinateu = new Annonce(null, null, null, "", null, null);
		annonce.save(dessinateu);

		Annonce pirre = new Annonce(0l, null, true, "FF", "null", "null");
		annonce.save(pirre);

		Annonce aB = new Annonce(1l, null, true, "CACA", "PIPI", "RESTAU");
		annonce.save(aB);

		Annonce BB = new Annonce(2l, null, true, "CACA", "PIOPI", "RESTAU");
		annonce.save(BB);

		Annonce CB = new Annonce(3l, null, true, "CACA", "PIOPI", "RESTAU");
		annonce.save(CB);*/
		/*Role premium = new Role(10l, null, "null", "null", "java cest de la merede");
		role.save(premium);*/

		/*Annonce scenariste = new Annonce(10l, null, true,  "paris", "gchgkc","yesman");
		annonce.save(scenariste);
		
		Annonce newman = new Annonce(19l, null, true,  "MARSEILLE", "JAVA CEST NULL","DESINATEUR");
		annonce.save(newman);*/
		
		Utilisateur fenec = new Utilisateur(13l, null, true, "yeahk", "javscript", "htmlcss@gmail.com", "produit", "00000000",null, null);
		user.save(fenec);
		
		Role Premium= new Role(null, null, "", null, null);
		role.save(Premium);


	}
	
}

