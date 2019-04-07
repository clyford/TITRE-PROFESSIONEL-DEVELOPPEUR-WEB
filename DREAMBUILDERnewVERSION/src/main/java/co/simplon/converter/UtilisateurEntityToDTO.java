package co.simplon.converter;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.simplon.dto.UtilisateurDTO;
import co.simplon.model.utilisateur.Utilisateur;

@Component
public class UtilisateurEntityToDTO {
	@Autowired 
	private ModelMapper modelMapper;
	
	public UtilisateurDTO convert(Utilisateur entity) {
        return modelMapper.map(entity, UtilisateurDTO.class);
    }
	
	public Set<UtilisateurDTO> convertList(Set<Utilisateur> Utilisateurs) {
        Set<UtilisateurDTO> UtilisateurDTOs = new HashSet<>();
        for(Utilisateur Utilisateur : Utilisateurs) {
            UtilisateurDTOs.add(convert(Utilisateur));
        }
        return UtilisateurDTOs;
    }
}
