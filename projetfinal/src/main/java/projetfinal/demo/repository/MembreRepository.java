package projetfinal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetfinal.demo.model.Membre;

public interface MembreRepository extends JpaRepository<Membre, Long> {

}
