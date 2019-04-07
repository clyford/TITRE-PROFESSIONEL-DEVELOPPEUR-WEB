package co.simplon.converter;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.simplon.dto.UtilisateurDTO;
import co.simplon.model.utilisateur.Utilisateur;

@Component
public class UtilisateurDTOToEntity {
	@Autowired 
	private ModelMapper modelMapper;
	
	public Utilisateur convert(UtilisateurDTO dto) {
        return modelMapper.map(dto, Utilisateur.class);
    }
	
	public Set<Utilisateur> convertList(Set<UtilisateurDTO> UtilisateurDTOs) {
        Set<Utilisateur> Utilisateurs = new HashSet<>();
        for(UtilisateurDTO UtilisateurDTO : UtilisateurDTOs) {
            Utilisateurs.add(convert(UtilisateurDTO));
        }
        return Utilisateurs;
    }
}
