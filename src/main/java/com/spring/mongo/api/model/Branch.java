package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@ToString
@Document(collection="Sucursales")
public class Branch {
	
	private int id;
	private String ciudad;
	private double totalVentas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
}
