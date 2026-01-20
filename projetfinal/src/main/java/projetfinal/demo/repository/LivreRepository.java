package projetfinal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetfinal.demo.model.Livre;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
}
