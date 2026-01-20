package projetfinal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetfinal.demo.model.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}
