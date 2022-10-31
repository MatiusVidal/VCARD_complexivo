package com.ista.springboot.di.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ista.springboot.di.app.models.domain.Empleado;



@Component
public class Vcard {
	
	@Autowired
	private List<Empleado> empleado;
	
	@Value("${card.titulo}")
	private String titulo;
	
	@Value("${card.empresa}")
	private String empresa;
	
	@Value("${card.email}")
	private String email;
	
	@Value("${card.direccion}")
	private String direccion;

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
