package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Jeu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class JeuRepositoryTest {

    @Autowired
    private JeuRepository repo;

    @Test
    public void testCreationJeu(){
        // Arrange
        Jeu jeu = new Jeu("Courtisans", "CAT080CO", 3);
        jeu.setAge_min(8);
        jeu.setDescription("Ce soir a lieu le banquet de la reine. Un évènement majeur où les familles du royaume veulent se montrer à leur avantage. Les manœuvres vont bon train et tous les coups sont permis pour placer son favori sur le devant de la scène.");
        jeu.setDuree(20);

        // ACT
        Jeu jeuSaved = repo.save(jeu);

        // Assert
        Jeu jeuBD = repo.findById(jeuSaved.getId_jeu()).orElse(null);

        assertThat(jeuBD).isNotNull();
        assertThat(jeuBD.getId_jeu()).isNotNull();
        assertThat(jeuBD.getTitre()).isEqualTo("Courtisans");
        assertThat(jeuBD.getReference()).isEqualTo("CAT080CO");
        assertThat(jeuBD.getAge_min()).isEqualTo(8);
        assertThat(jeuBD.getDescription()).isEqualTo("Ce soir a lieu le banquet de la reine. Un évènement majeur où les familles du royaume veulent se montrer à leur avantage. Les manœuvres vont bon train et tous les coups sont permis pour placer son favori sur le devant de la scène.");
        assertThat(jeuBD.getDuree()).isEqualTo(20);
        assertThat(jeuBD.getTarif_jour()).isEqualTo(3);
    }
}
