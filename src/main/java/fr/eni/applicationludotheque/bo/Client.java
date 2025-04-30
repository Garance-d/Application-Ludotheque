package fr.eni.applicationludotheque.bo;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Table (name = "CLIENTS")
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

    @NonNull
    @Column(nullable = false, length = 100)
    private String nom;

    @NonNull
    @Column(nullable = false, length = 100)
    private String prenom;

    @Column(unique = true, length = 10)
    private String num_telephone;

    @NonNull
    @Column(nullable = false, length =40)
    private String email;
}
