package co.simplon.model.annonce;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnnonceRepository extends JpaRepository<Annonce,Long>{
	Annonce findByid (Long id);
}
