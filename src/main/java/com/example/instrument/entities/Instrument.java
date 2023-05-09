package com.example.instrument.entities;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Instrument {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idInstrument;
	@NotNull
	    @Size (min = 4,max = 15)
	private String nomInstrument;
	private Double prixInstrument;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreation;


	public Instrument() {
		super();
	}
	
	
	public Instrument(String nomInstrument, Double prixInstrument, Date dateCreation) {
		super();
		this.nomInstrument = nomInstrument;
		this.prixInstrument= prixInstrument;
		this.dateCreation = dateCreation;
	}


	public Long getIdInstrument() {
		return idInstrument;
	}
	public void setIdInstrument(Long idInstrument) {
		this.idInstrument = idInstrument;
	}
	public String getNomInstrument() {
		return nomInstrument;
	}
	public void setNomInstrument(String nomInstrument) {
		this.nomInstrument = nomInstrument;
	}
	public Double getPrixInstrument() {
		return prixInstrument;
	}
	public void setPrixInstrument(Double prixInstrument) {
		this.prixInstrument = prixInstrument;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Instrument [idInstrument=" + idInstrument + ", nomInstrument=" + nomInstrument + ", prixInstrument=" + prixInstrument
				+ ", dateCreation=" + dateCreation + "]";
	}


	public void setPrixInstrument(double d) {
		// TODO Auto-generated method stub
		
	}
	
	

}
