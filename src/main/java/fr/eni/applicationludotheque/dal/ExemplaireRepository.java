package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplaireRepository extends JpaRepository<Exemplaire, Long> {
}
