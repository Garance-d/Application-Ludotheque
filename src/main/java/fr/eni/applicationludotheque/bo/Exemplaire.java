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
@Table(name = "EXEMPLAIRES")
public class Exemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exemplaire;

    @NonNull
    @Column(nullable = false, length = 5)
    private int code_barre;

    @NonNull
    @Column(nullable = false)
    private boolean louable;
}
