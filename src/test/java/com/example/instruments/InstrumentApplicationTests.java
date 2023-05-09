package com.example.instruments;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.instrument.entities.Categorie;
import com.example.instrument.entities.Instrument;
import com.example.instrument.repos.InstrumentRepository;


@SpringBootTest
class InstrumentsApplicationTests {

	@Autowired
	private InstrumentRepository instrumentRepository;
	
	@Test
	public void testCreateInstrument() {
	Instrument Inst1 = new Instrument("Violon",220.000,new Date());
	instrumentRepository.save(Inst1);
	}
	
	@Test
	public void testFindinstrument()
	{
	Instrument p = instrumentRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateInstrument()
	{
	Instrument p = instrumentRepository.findById(1L).get();
	p.setPrixInstrument(2000.0);
	instrumentRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteInstrument()
	{
		instrumentRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllInstruments()
	{
		List<Instrument> insts = instrumentRepository.findAll();
		
		for (Instrument p:insts)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindInstrumentByNom()
	{
	List<Instrument> insts = instrumentRepository.findByNomInstrument("PS 4");
	
	for (Instrument p:insts)
		 System.out.println(p);
	
	}
	
	@Test
	public void testFindInstrumentByNomContains()
	{
	List<Instrument> insts = instrumentRepository.findByNomInstrumentContains("P");
	
	for (Instrument p:insts)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Instrument> insts = instrumentRepository.findByNomPrix("PS 4", 1000.0);
		for (Instrument p : insts)
			{
				System.out.println(p);
			}
	}
	
	
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	
	List<Instrument> insts = instrumentRepository.findByCategorie(cat);
	for (Instrument p : insts)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByCategorieIdCat()
	{
	List<Instrument> insts = instrumentRepository.findByCategorieIdCat(1L);
	for (Instrument p : insts)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomInstrumentAsc()
	{
	List<Instrument> insts =  instrumentRepository.findByOrderByNomInstrumentAsc();
	for (Instrument p : insts)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierInstrumentNomsPrix()
	{
	List<Instrument> insts = instrumentRepository.trierInstrumentsNomsPrix();
	for (Instrument p : insts)
	{
	System.out.println(p);
	}
	}
	
	
}
