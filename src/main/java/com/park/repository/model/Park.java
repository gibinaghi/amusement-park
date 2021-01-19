package com.park.repository.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//defino la entidad de la tabla park
@Entity

//si la clase es park y la tabla es game pongo
//@Table(name = "game")

public class Park implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//asi cuando el nombre de variable es distinto a la base de datos
	//@Column(name = "id_game")
	
	//genero los id atomaticamente en secuencia
	@Id
	@GeneratedValue(generator = "gen_seq_park", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "seq_park", allocationSize = 1,
	      name = "gen_seq_park")
	private Integer id;
	
	private String name;
	private double price;
	
	//no es buena practica definirlos asi
	//se hace con lombok 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
