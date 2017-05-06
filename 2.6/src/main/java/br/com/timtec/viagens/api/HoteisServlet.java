package br.com.timtec.viagens.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.timtec.viagens.model.Hotel;


@WebServlet("/hoteis/*")
public class HoteisServlet extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Hotel hotel = new Hotel();
		hotel.setId(1);
		hotel.setNome("Ibis");
		hotel.setEndereco("Avenida Paulista, 1234");
		
		objectMapper.writeValue(resp.getOutputStream(), hotel);
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Hotel hotel = objectMapper.readValue(req.getInputStream(), Hotel.class);
		
		System.out.println(hotel.getId());
		System.out.println(hotel.getNome());
		System.out.println(hotel.getEndereco());
		
	}

}
