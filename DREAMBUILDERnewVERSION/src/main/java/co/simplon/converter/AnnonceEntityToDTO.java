package co.simplon.converter;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.simplon.dto.AnnonceDTO;
import co.simplon.model.annonce.Annonce;
@Component
public class AnnonceEntityToDTO {
	@Autowired 
	private ModelMapper modelMapper;
	
	public AnnonceDTO convert(Annonce entity) {
        return modelMapper.map(entity, AnnonceDTO.class);
    }
	
	public Set<AnnonceDTO> convertList(Set<Annonce> Annonces) {
        Set<AnnonceDTO> AnnonceDTOs = new HashSet<>();
        for(Annonce Annonce : Annonces) {
            AnnonceDTOs.add(convert(Annonce));
        }
        return AnnonceDTOs;
    }
}
