package com.example.instrument.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.instrument.entities.Instrument;
import com.example.instrument.repos.*;



public abstract class InstrumentServiceImpl implements InstrumentService{

	@Autowired
	InstrumentRepository instrumentRepository;
	
	@Override
	public Instrument saveInstrument(Instrument p) {
		return instrumentRepository.save(p);
	}

	@Override
	public Instrument updateInstrument(Instrument p) {
		return instrumentRepository.save(p);
	}

	@Override
	public void deleteInstrument(Instrument p) {
		instrumentRepository.delete(p);
		
	}

	@Override
	public void deleteInstrumentById(Long id) {
		instrumentRepository.deleteById(id);
		
	}

	@Override
	public Instrument getInstrument(Long id) {
		return instrumentRepository.findById(id).get();
	}

	@Override
	public List<Instrument> getAllInstruments() {
		
		return instrumentRepository.findAll();
	}
	
	

}
