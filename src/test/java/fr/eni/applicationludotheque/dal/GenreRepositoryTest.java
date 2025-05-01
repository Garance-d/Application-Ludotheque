package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Genre;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class GenreRepositoryTest {

    @Autowired
    private GenreRepository repo;

    @Test
    public void testCreationGenre(){
        // Arrange
        Genre genre = new Genre("Collection");

        // ACT
        Genre genreSaved = repo.save(genre);

        // Assert
        Genre genreBD = repo.findById(genreSaved.getId_genre()).orElse(null);

        assertThat(genreBD).isNotNull();
        assertThat(genreBD.getId_genre()).isNotNull();
        assertThat(genreBD.getLibelle()).isEqualTo("Collection");
    }
}
