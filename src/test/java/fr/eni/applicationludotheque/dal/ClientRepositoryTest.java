package fr.eni.applicationludotheque.dal;


import fr.eni.applicationludotheque.bo.Adresse;
import fr.eni.applicationludotheque.bo.Client;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository repo;

    @Test
    @Transactional
    public void testCreationClient() {

        //Arrange

        Adresse adresse = new Adresse("rue de Comorans", "44444", "Nantes");
        Client client = new Client("Smith", "Bob", "Smith@gmail.com", adresse);
        client.setNum_telephone("0123456789");

        //ACT

        Client clientSaved = repo.save(client);

        //Assert

        Client clientBD = repo.findById(clientSaved.getId_client()).orElse(null);

        assertThat(clientBD).isNotNull();
        assertThat(clientBD.getId_client()).isNotNull();
        assertThat(clientBD.getNum_telephone()).isEqualTo("0123456789");
        assertThat(clientBD.getNom()).isEqualTo("Smith");
        assertThat(clientBD.getPrenom()).isEqualTo("Bob");
        assertThat(clientBD.getEmail()).isEqualTo("Smith@gmail.com");
        assertNotNull(clientBD.getAdresse().getNum_adresse());
        assertEquals(adresse, clientBD.getAdresse());
    }


}
