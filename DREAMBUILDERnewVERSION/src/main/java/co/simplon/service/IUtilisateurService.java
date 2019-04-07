package co.simplon.service;

import java.util.Set;

import co.simplon.dto.UtilisateurDTO;


public interface IUtilisateurService {


	
	Set<UtilisateurDTO> listAll();
    
    UtilisateurDTO getById(String id);
    
    UtilisateurDTO getByEmail(String email);
    
    UtilisateurDTO saveOrUpdate(UtilisateurDTO utilisateurDTO); 
    
    void delete(String id);
    
    
    
}
