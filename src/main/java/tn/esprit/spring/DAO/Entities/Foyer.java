package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "t_foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foyer") // Must match exact DB column name
    private Long id;
    
    @Column(name = "nom_foyer") // Must match exactly
    private String nom;
    
    @Column(name = "capacite_foyer") // Must match exactly
    private Long capacite;
    
    // Relationships
    @OneToOne(mappedBy = "foyer")
    @JsonIgnore
    private Universite universite;
    
    @OneToMany(mappedBy = "foyer")
    @JsonIgnore
    private List<Bloc> blocs = new ArrayList<>();
}
