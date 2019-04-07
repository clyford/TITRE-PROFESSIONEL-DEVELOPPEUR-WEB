package co.simplon.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.converter.AnnonceDTOToEntity;
import co.simplon.converter.AnnonceEntityToDTO;
import co.simplon.dto.AnnonceDTO;
import co.simplon.model.annonce.Annonce;
import co.simplon.model.annonce.IAnnonceRepository;
import co.simplon.service.IAnnonceService;

@Service
class AnnonceService implements IAnnonceService{
	@Autowired
	IAnnonceRepository annonceRepository;
	
	@Autowired
	AnnonceDTOToEntity annonceDTOToEntity;
	
	@Autowired
	AnnonceEntityToDTO annonceEntityToDTO;

	
	
	@Override
	public Set<AnnonceDTO> listAll() {
		Set<Annonce> annonces = new HashSet<>();
		annonceRepository.findAll().forEach(annonces::add);
        return annonceEntityToDTO.convertList(annonces);
	}

	@Override
	public AnnonceDTO getById(String id) {
		 if((id != null) && (!id.isEmpty()) && (annonceRepository.existsById(Long.valueOf(id)))) {
	            return annonceEntityToDTO.convert(annonceRepository.findById(Long.valueOf(id)).orElse(null));
	        }
	        return null;
	}

	@Override
	public AnnonceDTO saveOrUpdate(AnnonceDTO annonceDTO) {
	        Annonce annonce = annonceRepository.save(annonceDTOToEntity.convert(annonceDTO));
	        return annonceEntityToDTO.convert(annonce);
	}

	@Override
	public void delete(String id) {
		 if((id != null) && (!id.isEmpty()) && (annonceRepository.existsById(Long.valueOf(id)))) {
	            annonceRepository.deleteById(Long.valueOf(id));
	        }
		
	}

}
