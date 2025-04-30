package fr.eni.applicationludotheque.dal;


import fr.eni.applicationludotheque.bo.Client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository repo;

    @Test
    public void testCreationClient() {

        //Arrange

        Client client = new Client("Smith", "Bob", "Smith@gmail.com");
        client.setNum_telephone("0123465789");


        //ACT

        Client clientSaved = repo.save(client);

        //Assert

        Client clientBD = repo.findById(clientSaved.getId_client()).orElse(null);

        assertThat(clientBD).isNotNull();
        assertThat(clientBD.getId_client()).isNotNull();
        assertThat(clientBD.getNum_telephone()).isEqualTo("0123456789");
        assertThat(clientBD.getNom()).isEqualTo("Smith");
        assertThat(clientBD.getPrenom()).isEqualTo("Bob");
    }


}
