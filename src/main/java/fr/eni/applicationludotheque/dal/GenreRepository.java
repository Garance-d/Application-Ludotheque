package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
