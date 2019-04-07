package co.simplon.service;

import java.util.Set;

import co.simplon.dto.AnnonceDTO;

public interface IAnnonceService {

	
//	
//	Annonce findByAnnonceidName(Long Idname);
//    
//    Collection<Annonce> getAllAnnonces();
//    
//    Stream<Annonce> getAllAnnoncesStream();
	
	Set<AnnonceDTO> listAll();
	AnnonceDTO getById( String id);
	//AnnonceDTO getByTitle();
	AnnonceDTO saveOrUpdate(AnnonceDTO annonce);
	
	void delete (String id);
	
}
