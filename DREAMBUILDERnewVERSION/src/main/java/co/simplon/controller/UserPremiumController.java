package co.simplon.controller;


import java.util.Set;

//import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dto.UtilisateurDTO;
import co.simplon.service.IUtilisateurService;

//@PreAuthorize("hasRole('ROLE_normal')
@CrossOrigin(value="*")
@RestController
@RequestMapping(value = "/api")
public class UserPremiumController { 
	
//			Create = PUT
//			Retrieve = GET
//			Update = POST
//			Delete = DELETE	
	
// Ce controlleur concerne l'utilisateur du site
	
	
//	 @Autowired
//	 IUtilisateurRepository IUtilisateurRepositorysecond;
//	 @Autowired
//	 UtilisateurDTO utilisateurDTO;
	
	@Autowired
	IUtilisateurService utilisateurService;
	 
	//  Accède à une ressource dans ce cas la liste de tous les utilisateurs
	@GetMapping(value="/premium") //@Tracable
	 public ResponseEntity<?> getUsers() {
		Set<UtilisateurDTO> utilisateurs = utilisateurService.listAll();
	        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
	        } 
	
	

	// Accède à une ressource donc un utilisateur par son id
	@GetMapping (value="/premium/{id}")
	/*@Dto(UtilisateurDTO.class)*/
	public ResponseEntity<?> getUser(@PathVariable String id) {
			UtilisateurDTO utilisateur = utilisateurService.getById(id);
		        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
     }
	
	
		
	
	// Ajoute une ressource donc un utilisateur 
	    @PostMapping(value="/adduser")
	    public ResponseEntity<?> saveUser(@RequestBody UtilisateurDTO utilisateurDTO){
	    	
	    	UtilisateurDTO savedUtilisateurDTO= utilisateurService.saveOrUpdate(utilisateurDTO)/*null*/;
	    	if(utilisateurDTO.getId() == null);
////	  ligne a ne pas decommenter      return ResponseEntity.ok(utilisateurService.save(user));
	        return new ResponseEntity<>(savedUtilisateurDTO, HttpStatus.OK);
	    	
	    	  
		       
	    }
	    
	    
	    
	    
	    
	    
	    
	    // Met à jour une ressource complète en la remplaçant par une nouvelle version 
	    @PutMapping(value="/updateuser/{id}")
	    public ResponseEntity<?> updateUser(@PathVariable String id, @RequestBody UtilisateurDTO utilisateurDTO){
	        //Utilisateur userTest = IUtilisateurRepositorysecond.findById(id).get();
	        if(id.equals(utilisateurDTO.getId())){
	        	return new ResponseEntity<>(utilisateurService.saveOrUpdate(utilisateurDTO),HttpStatus.OK);	
	        }
			return null;
	    	
//	        utilisateurService.saveOrUpdate(utilisateurDTO); /// a effacer 
//	        return null;	     /// a effacer 
	       
	    }
	    
	    
	 // Pour supprimer un utilisateur
	    @DeleteMapping(value="/delete/{id}")
	    public ResponseEntity<?> deleteUser(@PathVariable String id){
	    	utilisateurService.delete(id);
	        return null;
	        
	    }

}