package com.example.instrument.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.instrument.entities.Instrument;
import com.example.instrument.service.InstrumentService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
	
	@Autowired
	InstrumentService instrumentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Instrument> getAllProduits()
	{
		return instrumentService.getAllInstruments();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Instrument getProduitById(@PathVariable("id") Long id) {
		return instrumentService.getInstrument(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Instrument createInstrument(@RequestBody Instrument instrument) {
			return instrumentService.saveInstrument(instrument);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Instrument updateProduit(@RequestBody Instrument inst) {
		return instrumentService.updateInstrument(inst);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		instrumentService.deleteInstrumentById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Instrument> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
		return instrumentService.findByCategorieIdCat(idCat);
	}

	
	
	


}
