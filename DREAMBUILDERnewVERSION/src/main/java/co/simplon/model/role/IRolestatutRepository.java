package co.simplon.model.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
//@CrossOrigin
@Repository
public interface IRolestatutRepository extends JpaRepository<Rolestatut, Long>{
}
