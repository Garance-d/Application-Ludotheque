package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JeuRepository extends JpaRepository<Jeu, Long> {
}
