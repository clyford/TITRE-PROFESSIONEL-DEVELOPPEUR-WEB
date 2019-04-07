//package co.simplon.controller;
//import java.util.List;
//import java.util.Optional;
//
//import javax.management.relation.RoleList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import co.simplon.model.annonce.Annonce;
//import co.simplon.model.role.IRolestatutRepository;
//import co.simplon.model.role.Rolestatut;
//
///*@CrossOrigin(origins = "http://localhost:9999/")*/
////@PreAuthorize("hasRole('ROLE_normal') or hasRole('ROLE_admin')")
//@RestController
//@CrossOrigin(value="*")
//@RequestMapping(value = "/api")
//public class RoleController {
//	
//	@Autowired
//	IRolestatutRepository IRolestatutRepositorygood;
//	
////  Accède à une ressource dans ce cas la liste des roles
//		@GetMapping(value="/role") //@Tracable
//		 public List<Rolestatut> getmesroles() {
//		   return IRolestatutRepositorygood.findAll();} 
//		
//		
//		// Accède à une ressource donc un role par son id
//		@GetMapping (value="/role/{id}")
//		public ResponseEntity<?> getAd(@PathVariable Long id) {
//			Optional<Rolestatut> mesroles = IRolestatutRepositorygood.findById(id);
//			if(!mesroles.isPresent())
//			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
//			return ResponseEntity.ok(mesroles); }
//
//		// Ajoute une ressource donc un role
//				@PostMapping("/postroles")
//			    public ResponseEntity<?> savemonroles(@RequestBody Rolestatut mesroles ){
//			        return ResponseEntity.ok(IRolestatutRepositorygood.save(mesroles));
//			        //return new ResponseEntity<>(HttpStatus.OK);
//			    }
//				// Met à jour une ressource complète en la remplaçant par une nouvelle version 
//			    @PutMapping(value="/updaterole/{id}")
//			    public ResponseEntity<?> updateAd(@PathVariable Long id, @RequestBody Rolestatut mesroles){
//
//			        Optional<Rolestatut> adOptional = IRolestatutRepositorygood.findById(id);
//			        if(!adOptional.isPresent()) {
//			            return ResponseEntity.notFound().build();
//			        }
//			        mesroles.setId(id);
//			        IRolestatutRepositorygood.save(mesroles);
//			        return ResponseEntity.ok(mesroles);
//			    }
//		
//		// Pour supprimer un role
//	    @DeleteMapping(value="/deleterole/{id}")
//	    public ResponseEntity<?> deletemesroles(@PathVariable Long id){
//
//	    	IRolestatutRepositorygood.deleteById(id);
//	        return new ResponseEntity<>(HttpStatus.OK);
//	    }
//}
//
