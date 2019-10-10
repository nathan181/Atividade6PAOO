package br.usjt.veiculospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.veiculospringboot.model.Veiculo;
import br.usjt.veiculospringboot.repository.VeiculosRepository;

@Controller
public class VeiculosController {
	
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@GetMapping("/alunos")
	public ModelAndView listarVeiculos() {
		ModelAndView mv = new ModelAndView("lista_veiculos");
		
		List<Veiculo> veiculos = veiculosRepo.findAll();
		
		mv.addObject("veiculos", veiculos);
		
		return mv;
	}
	@PostMapping
	public String salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
		return"redirect:/veiculos";} 
}
