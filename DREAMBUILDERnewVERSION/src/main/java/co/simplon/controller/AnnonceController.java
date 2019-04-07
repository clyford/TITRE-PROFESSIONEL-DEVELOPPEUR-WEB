package co.simplon.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dto.AnnonceDTO;
import co.simplon.service.IAnnonceService;





//@PreAuthorize("hasRole('ROLE_normal') or hasRole('ROLE_admin')")
@RestController
@CrossOrigin(value="*")
@RequestMapping(value = "/api")
public class AnnonceController {
	
	
//			Create = PUT
//			Retrieve = GET
//			Update = POST
//			Delete = DELETE
	
	@Autowired
	IAnnonceService annonceService;
	
//	@Autowired
//	AnnonceDTO annonceDTO;
	
	//  Accède à une ressource dans ce cas la liste de tous les Annonces
//		@GetMapping(value="/annonce") //@Tracable
//		 public List<Annonce> getAds() {
//		   return IAnnonceRepositorysecond.findAll();} 
		
		//@GetMapping(value="/annonce") //@Tracable
	@RequestMapping(value="/annonce", method = RequestMethod.GET)
		 public ResponseEntity<?> getAds() {
			Set<AnnonceDTO> annonces = annonceService.listAll();
		        return new ResponseEntity<>(annonces, HttpStatus.OK);
		        } 
		
		
		
		// Accède à une ressource donc une annonce par son id
		//@GetMapping (value="/annonce/{id}")
		@RequestMapping(value="/annonce/{id}", method = RequestMethod.GET)
		/*@Dto(UtilisateurDTO.class)*/
		public ResponseEntity<?> getAd(@PathVariable String id) {
			AnnonceDTO annonce = annonceService.getById(id);
			        return new ResponseEntity<>(annonce, HttpStatus.OK);
	     }
		
		//@PostMapping(value ="/postannonce")
		@RequestMapping(value="/postannonce", method = RequestMethod.POST)
	    public ResponseEntity<?> saveAd(@RequestBody AnnonceDTO annonceDTO){
	    	
	    	AnnonceDTO savedAnnonceDTO= annonceService.saveOrUpdate(annonceDTO)/*null*/;
	    	if(annonceDTO.getId() == null);
//	        return ResponseEntity.ok(utilisateurService.save(user));
	        return new ResponseEntity<>(savedAnnonceDTO, HttpStatus.OK);
	    }
	
		// Pour supprimer une annonce
		 //@DeleteMapping(value="/deleteAd/{id}")
		 @RequestMapping(value="/deleteAd/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<?> deleteAd(@PathVariable String id){
	    	annonceService.delete(id);
	        return null;
	        
	    }	
		
		
		
		
		// Met à jour une ressource complète en la remplaçant par une nouvelle version 
		 //@PutMapping(value="/updateannonce/{id}")
		 @RequestMapping(value="/updateannonce/{id}", method = RequestMethod.PUT)
		    public ResponseEntity<?> updateAd(@PathVariable String id, @RequestBody AnnonceDTO annonceDTO){
		        //Utilisateur userTest = IUtilisateurRepositorysecond.findById(id).get();
		        if(id.equals(annonceDTO.getId())){
		        	return new ResponseEntity<>(annonceService.saveOrUpdate(annonceDTO),HttpStatus.OK);	
		        }
		        	
		        return null;
		    }
		    
	    
	    
//	    // Met à jour une ressource complète en la remplaçant par une nouvelle version 
//	    @PutMapping(value="/updateannonce/{id}")
//	    public ResponseEntity<?> updateAd(@PathVariable Long id, @RequestBody Annonce ad){
//
//	        Optional<Annonce> adOptional = IAnnonceRepositorysecond.findById(id);
//	        if(!adOptional.isPresent()) {
//	            return ResponseEntity.notFound().build();
//	        }
//	        ad.setId(id);
//	        IAnnonceRepositorysecond.save(ad);
//	        return ResponseEntity.ok(ad);
//	    }
		 
		 
}

	
