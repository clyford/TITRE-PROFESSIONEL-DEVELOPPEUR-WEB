package co.simplon.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.model.annonce.IAnnonceRepository;
import co.simplon.model.utilisateur.IUtilisateurRepository;
import co.simplon.model.utilisateur.Utilisateur;
//@CrossOrigin/*(origins = "http://localhost:9999/")*/
@RestController
//@PreAuthorize("hasRole('ROLE_admin')")
@CrossOrigin(value="*")
@RequestMapping(value="admin/")
public class ControllerAdmin {
	@Autowired
	IAnnonceRepository Annonce;
	@Autowired
	 IUtilisateurRepository useraccount;

	
	
	
//  Accède à une ressource dans ce cas la liste de tous les utilisateurs
	@GetMapping(value="/premium") //@Tracable
	 public List<Utilisateur> getUsers() {

	        return useraccount.findAll();} 
	
	// Accède à une ressource donc un utilisateur par son id
		@GetMapping (value="/premium/{id}")
		public ResponseEntity<?> getUser(@PathVariable Long id) {
				Optional<Utilisateur> user = useraccount.findById(id);
		        if(!user.isPresent())
		            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		        return ResponseEntity.ok(user); }
	
	
	// Pour supprimer une annonce d'un utilisateur
    @DeleteMapping(value="/deleteAd/{id}")
    public ResponseEntity<?> deleteAd(/*variable qui va changer @PathVariable*/ @PathVariable Long id){

    	Annonce.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    // Pour supprimer le compte d'un utilisateur
    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
    	useraccount.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    	}
}
