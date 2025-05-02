package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Exemplaire;
import fr.eni.applicationludotheque.bo.Jeu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ExemplaireRepositoryTest {

    @Autowired
    private ExemplaireRepository repo;

    @Test
    public void testCreationExemplaire() {
        // Arrange
        Exemplaire exemplaire = new Exemplaire(55555, true);

        // ACT
        Exemplaire exemplaireSaved = repo.save(exemplaire);

        // Assert
        Exemplaire exemplaireBD = repo.findById(exemplaireSaved.getId_exemplaire()).orElse(null);

        assertThat(exemplaireBD).isNotNull();
        assertThat(exemplaireBD.getId_exemplaire()).isNotNull();
        assertThat(exemplaireBD.getCode_barre()).isEqualTo(55555);
        assertThat(exemplaireBD.isLouable()).isTrue();
    }
}
