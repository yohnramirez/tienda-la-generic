package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Getter
@Setter
@ToString
@Document(collection="Clientes")
public class Client {
	
	private int id;
	private String direccion;
	private String email;
	private String nombre;
	private String telefono;
	
	public int getId() {
		return id;
	}
	public void setCedula(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
