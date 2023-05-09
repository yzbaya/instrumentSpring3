package com.example.instrument.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.instrument.entities.Categorie;
import com.example.instrument.entities.Instrument;


@RepositoryRestResource(path = "rest")
public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
	
	List<Instrument> findByNomInstrument(String nom);
	List<Instrument> findByNomInstrumentContains(String nom);
	
	/*@Query("select p from Instrument p where p.nomProduit like %?1 and p.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Instrument> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Produit p where p.categorie = ?1")
	List<Instrument> findByCategorie (Categorie categorie);
	
	List<Instrument> findByCategorieIdCat(Long id);
	
	List<Instrument> findByOrderByNomInstrumentAsc();
	
	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Instrument> trierInstrumentsNomsPrix ();

}
