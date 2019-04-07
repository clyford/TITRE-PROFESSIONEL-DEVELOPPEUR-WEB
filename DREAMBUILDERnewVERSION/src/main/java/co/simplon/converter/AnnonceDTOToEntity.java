package co.simplon.converter;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.simplon.dto.AnnonceDTO;
import co.simplon.model.annonce.Annonce;

@Component
public class AnnonceDTOToEntity {

	@Autowired 
	private ModelMapper modelMapper;
	
	public Annonce convert(AnnonceDTO dto) {
        return modelMapper.map(dto, Annonce.class);
    }
	
	public Set<Annonce> convertList(Set<AnnonceDTO> AnnonceDTOs) {
        Set<Annonce> Annonces = new HashSet<>();
        for(AnnonceDTO AnnonceDTO : AnnonceDTOs) {
            Annonces.add(convert(AnnonceDTO));
        }
        return Annonces;
    }
}
