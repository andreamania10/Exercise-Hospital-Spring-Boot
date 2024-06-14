package com.hospitalgeneral.ejercicio;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id; 
private String nombre; 
private Date fechaAltaInicial;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Date getFechaAltaInicial() {
	return fechaAltaInicial;
}
public void setFechaAltaInicial(Date fechaAltaInicial) {
	this.fechaAltaInicial = fechaAltaInicial;
} 


}
