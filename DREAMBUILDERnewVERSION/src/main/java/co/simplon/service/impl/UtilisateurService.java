package co.simplon.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.converter.UtilisateurDTOToEntity;
import co.simplon.converter.UtilisateurEntityToDTO;
import co.simplon.dto.UtilisateurDTO;
import co.simplon.model.utilisateur.IUtilisateurRepository;
import co.simplon.model.utilisateur.Utilisateur;
import co.simplon.service.IUtilisateurService;

@Service
public class UtilisateurService implements IUtilisateurService{
		
	
	@Autowired // c'est une injection de dependance
	 IUtilisateurRepository utilisateurRepository;
	
	@Autowired
	UtilisateurDTOToEntity utilisateurDTOToEntity;
	
	@Autowired
	UtilisateurEntityToDTO utilisateurEntityToDTO;


	@Override
	public Set<UtilisateurDTO> listAll(){
		Set<Utilisateur> utilisateurs = new HashSet<>();
		utilisateurRepository.findAll().forEach(utilisateurs::add);
        return utilisateurEntityToDTO.convertList(utilisateurs);
	}

	@Override
	public UtilisateurDTO getById(String id) {
		 if((id != null) && (!id.isEmpty()) && (utilisateurRepository.existsById(Long.valueOf(id)))) {
	            return utilisateurEntityToDTO.convert(utilisateurRepository.findById(Long.valueOf(id)).orElse(null));
	        }
	        return null;
	}

	@Override
	public UtilisateurDTO saveOrUpdate(UtilisateurDTO utilisateurDTO) {
	        Utilisateur utilisateur = utilisateurRepository.save(utilisateurDTOToEntity.convert(utilisateurDTO));
	        return utilisateurEntityToDTO.convert(utilisateur);
	}

	@Override
	public void delete(String id) {
		 if((id != null) && (!id.isEmpty()) && (utilisateurRepository.existsById(Long.valueOf(id)))) {
	            utilisateurRepository.deleteById(Long.valueOf(id));
	        }
		
	}

	@Override
	public UtilisateurDTO getByEmail(String email) {
		 if(utilisateurRepository.findByEmail(email) != null) {
	            return utilisateurEntityToDTO.convert(utilisateurRepository.findByEmail(email));
	        }
	        return null;
	}
	
}
