package com.auth0.samples.bootfaces.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@Entity(name="producto")
public class Producto implements java.io.Serializable{
	
	private static final long serialVersionUID = -4028957248092398020L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name="native",strategy="native")
	private int id;

	@NotBlank(message="El código es obligatorio")
	@Size(max=11, message="Maxímo 11 carácteres permitidos")
	private String codigo;
	
	private String nombre;
	
	private int cantidad;
	
	private String rutaArchivo;
	
	private String descripcion;
	
	private double vlrCosto;
	
	private double pct_iva;
	
	private double vlrVenta;
	
	private String unidadMedida;
	
	private String material;
}
