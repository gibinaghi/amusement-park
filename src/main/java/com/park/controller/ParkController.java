package com.park.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//contolador de entrada para llamar endpoints que sirve para realizar el CRUD 
//de las operaciones del parque de diversiones

@RestController
@RequestMapping("/park")
public class ParkController {
	
	//test para saber si se llega al servicio
	@PostMapping
	public ResponseEntity<Void> test(){
		return ResponseEntity.ok().build();
	}
	
	//create: crear un nuevo juego para el parque
	@PostMapping("/game")
	public ResponseEntity<Void> createGame(Game request){
		return ResponseEntity.ok().build();
	}
}
