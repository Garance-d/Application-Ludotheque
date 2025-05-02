package fr.eni.applicationludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "JEUX")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jeu;

    @NonNull
    @Column(nullable = false, length = 50)
    private String titre;

    @NonNull
    @Column(nullable = false, length = 50)
    private String reference;

    @Column(length = 2)
    private int age_min;

    @Column(length = 300)
    private String description;

    @Column(length = 3)
    private int duree;

    @NonNull
    @Column(nullable = false)
    private int tarif_jour;
}
