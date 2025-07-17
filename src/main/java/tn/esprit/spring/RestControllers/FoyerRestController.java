package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.Etudiant.IEtudiantService;
import tn.esprit.spring.Services.Foyer.IFoyerService;
import tn.esprit.spring.DAO.Repositories.FoyerRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("foyer")
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService service;
    private final FoyerRepository repository;

    @PostMapping("/addOrUpdate")
    public ResponseEntity<Foyer> addOrUpdate(@RequestBody Foyer foyer) {
        System.out.println("Saving foyer: " + foyer.getNomFoyer());
        Foyer saved = repository.save(foyer);
        return ResponseEntity.ok(saved);
    }


    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        System.out.println("Fetching all foyers...");
        List<Foyer> result = repository.findAll();
        System.out.println("Found " + result.size() + " foyers");
        return ResponseEntity.ok(result);
    }

    @GetMapping("findById")
    Foyer findById(@RequestParam long id) {
        return service.findById(id);
    }

    @DeleteMapping("delete")
    void delete(@RequestBody Foyer f) {
        service.delete(f);
    }

    @DeleteMapping("deleteById")
    void deleteById(@RequestParam long id) {
        service.deleteById(id);
    }

    @PutMapping("affecterFoyerAUniversite")
    Universite affecterFoyerAUniversite(@RequestParam long idFoyer, @RequestParam String nomUniversite) {
        return service.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("desaffecterFoyerAUniversite")
    Universite desaffecterFoyerAUniversite(@RequestParam long idUniversite){
        return service.desaffecterFoyerAUniversite(idUniversite);
    }

    @PostMapping("ajouterFoyerEtAffecterAUniversite")
    Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,@RequestParam long idUniversite) {
        return service.ajouterFoyerEtAffecterAUniversite(foyer,idUniversite);
    }

    @PutMapping("affecterFoyerAUniversite/{idF}/{idU}")
    Universite affecterFoyerAUniversite(@PathVariable long idF,@PathVariable long idU){
        return service.affecterFoyerAUniversite(idF,idU);
    }
}
