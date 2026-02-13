package sn.edu.isepat.eboutique.Init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.entities.Categorie;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;

@Component
public class InitCategorie implements CommandLineRunner {
    private final CategorieRepository categorieRepository;

    public InitCategorie(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("### Init Categorie ###");

        Categorie cat =  new Categorie();
        cat.setNom("ELECTROMENAGER-Thiombane-BayeMarame");
        categorieRepository.save(cat);
    }

}
