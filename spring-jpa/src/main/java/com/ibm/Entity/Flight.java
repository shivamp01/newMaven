package com.ibm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="flights")
@NamedQueries({@NamedQuery(name="allFlights",query="from Flight"),@NamedQuery(name="fbc",query="from Flight where carrier=:car")})


public class Flight {
	
	@Id
	private String code;
	@Column(length=20, name="source")
	private String from;
	@Column(length=20, name="destination")
	private String to;
	private String carrier;
	
	public Flight() {
		
	}

	public Flight(String code, String from, String to, String carrier) {
		this.code = code;
		this.from = from;
		this.to = to;
		this.carrier = carrier;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	@Override
	public String toString() {
		return "Flight{code:" + code + ", from:" + from + ", to:" + to + ", carrier:" + carrier + "}";
	}
	
	

}
