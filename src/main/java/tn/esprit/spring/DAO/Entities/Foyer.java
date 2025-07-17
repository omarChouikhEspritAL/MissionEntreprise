package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "t_foyer")
@Getter @Setter 
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foyer")
    private Long idFoyer;
    
    @Column(name = "nom_foyer")
    private String nomFoyer;  // This field exists
    
    @Column(name = "capacite_foyer")
    private Long capaciteFoyer;
    
    // Relationships
    @OneToOne(mappedBy = "foyer")
    Universite universite;
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs= new ArrayList<>();
}
