package com.park.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.repository.ParkRepository;

//implementacion los metodos 
@Service
public class ParkImpl implements Park{
	
	//me creo una variable que inyecta(le meto) la clase del repositorio
	//con @Autowired se entera q tiene q ir a buscar metodos de esa clase
	
	
	private ParkRepository repository; 
	
	//tambien se puede hacer con constructor sin autowired
	//es mas facil hacer los test de la clase
	@Autowired
	public ParkImpl(ParkRepository repository) {
		//super(); lo saco si pongo autowired
		this.repository = repository;
	}


	//significa que sobreescribo el metodo para poner la funcionalidad
	@Override
	public void create() {
		//llama base de datos y guarda la entidad q le paso
		repository.save(null);
	}

}
