package br.com.timtec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.timtec.model.Hotel;
import br.com.timtec.repositories.HotelRepository;

@RestController
public class HoteisService {
	
	
	
	@Autowired
	private HotelRepository hotelRepository;
	
	
	
	@RequestMapping("/services/hoteis")
	public List<Hotel> findByCidade(String cidade) {
		
		return hotelRepository.findByCidade(cidade);
		
	}

}
