package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@ToString
@Document(collection="Ventas")
public class Sale{
	
	private int id;
	private int cedula;
	private double ivaVenta;
	private double totalVenta;
	private double valorVenta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public double getIvaVenta() {
		return ivaVenta;
	}
	public void setIvaVenta(double ivaVenta) {
		this.ivaVenta = ivaVenta;
	}
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
}
