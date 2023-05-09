package com.example.instrument.dto;

import java.util.Date;

import com.example.instrument.entities.Instrument;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstrumentDTO {
	private String nomInstrument;
	private int prixInstrument;
	private String serviceInstrument;
	private Date dateFondation;
	
}
