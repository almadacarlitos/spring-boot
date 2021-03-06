package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;

@Controller
public class SuscritoControllerV1 {
	
	//Inicializa y carga dentro del contexto de spring
	public SuscritoRepository suscritoRepository;
		
	
	
	@RequestMapping("/formulario")
	public String acceder() {
		
		System.out.println("Accedio al formulario");
		
		return "suscrito/formulario";
	}
	
	@RequestMapping("/registrar")
	                
	                                 //request
	public String registrar(Suscrito suscrito) {
		
		System.out.println("Accedio a registrar");
		
		suscritoRepository.save(suscrito);
		
		
		 //response
		//retorna la siguiente pagina 
		return "suscrito/ formulrio";
	}

}
