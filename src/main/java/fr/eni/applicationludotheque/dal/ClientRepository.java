package fr.eni.applicationludotheque.dal;

import fr.eni.applicationludotheque.bo.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
