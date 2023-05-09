package com.example.instrument.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.instrument.entities.Instrument;
import com.example.instrument.service.InstrumentService;


@Controller
public class InstrumentController {
	
	InstrumentService instrumentService;
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap) {
		modelMap.addAttribute("instrument", new Instrument());
		return "createInstrument";
	}
	
	@RequestMapping("/saveInstrument")
	public String saveInstrument(@Valid Instrument instrument,BindingResult bindingResult)
	
	{
		if (bindingResult.hasErrors()) return "formInstrument";				  
		
		instrumentService.saveInstrument(instrument);	
		return "formInstrument";
	}
	
	@RequestMapping("/ListeInstrument")
	public String listeInstruments(ModelMap modelMap,
			@RequestParam (name="type",defaultValue = "0") String type,
			@RequestParam (name="prix", defaultValue = "4") int prix)
	{
		Page<Instrument> prods = instrumentService.getAllProduitsParType(type, prix);
		modelMap.addAttribute("instrument", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", type);	
		return "listeInstrument";	
	}

	@RequestMapping("/supprimerInstrument")
	public String supprimerInstrument(@RequestParam("id") Long id,
			ModelMap modelMap,
			@RequestParam (name="type",defaultValue = "0") String type,
			@RequestParam (name="prix", defaultValue = "4") int prix)
	{
		instrumentService.deleteInstrumentById(id);
		Page<Instrument> prods = instrumentService.getAllProduitsParType(type, prix);
		modelMap.addAttribute("instrument", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", type);	
		modelMap.addAttribute("prix", prix);	
		return "listeInstrument";	
	}
	
	@RequestMapping("/modifierInstrument")
	public String editerInstrument(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Instrument p= 	instrumentService.getInstrument(id);
		modelMap.addAttribute("instrument", p);
		modelMap.addAttribute("mode", "edit");
		return "formInstrument";	
	}

	@RequestMapping("/updateInstrument")
	public String updateInstrument(@ModelAttribute("instrument") Instrument instrument,ModelMap modelMap) 
	{
		instrumentService.updateInstrument(instrument);
		  List<Instrument> prods = instrumentService.getAllInstruments();
		  modelMap.addAttribute("instrument", prods);	
		
		return "listeInstrument";
	}
}

