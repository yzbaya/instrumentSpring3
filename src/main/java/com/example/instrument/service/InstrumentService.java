package com.example.instrument.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.instrument.entities.*;
import com.example.instrument.entities.Categorie;
import com.example.instrument.entities.Instrument;
import com.nadhem.produits.entities.Produit;


public interface InstrumentService {
	Instrument saveInstrument(Instrument p);
	Instrument updateInstrument(Instrument p);
	void deleteInstrument(Instrument p);
	void deleteInstrumentById(Long id);
	Instrument getInstrument(Long id);
	List<Instrument> getAllInstruments();
	List<Instrument> findByNomInstrument(String nom);
	List<Instrument> findByNomInstrumentContains(String nom);
	List<Instrument> findByNomPrix (String nom, Double prix);
	List<Instrument> findByCategorie (Categorie categorie);
	List<Instrument> findByCategorieIdCat(Long id);
	List<Instrument> findByOrderByNomInstrumentAsc();
	List<Instrument> trierInstrumentsNomsPrix();
	Page<Instrument> getAllProduitsParType(String type, int prix);

}
//Produit saveProduit(Produit p);
//Produit updateProduit(Produit p);
//void deleteProduit(Produit p);
//void deleteProduitById(Long id);
//Produit getProduit(Long id);
//List<Produit> getAllProduits();
//List<Produit> findByNomProduit(String nom);
//List<Produit> findByNomProduitContains(String nom);
//List<Produit> findByNomPrix (String nom, Double prix);
//List<Produit> findByCategorie (Categorie categorie);
//List<Produit> findByCategorieIdCat(Long id);
//List<Produit> findByOrderByNomProduitAsc();
//List<Produit> trierProduitsNomsPrix();