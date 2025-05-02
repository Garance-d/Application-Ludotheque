package fr.eni.applicationludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table (name = "ADRESSES")
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Adresse {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_adresse;

    @NonNull
    @Column(nullable = false, length = 100)
    private String rue;

    @NonNull
    @Column(nullable = false, length = 5)
    private String code_postal;

    @NonNull
    @Column(nullable = false, length = 100)
    private String ville;

    @OneToOne(mappedBy = "adresse")
    private Client client;
}
