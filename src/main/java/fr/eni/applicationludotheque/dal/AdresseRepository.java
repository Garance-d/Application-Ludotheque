package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
