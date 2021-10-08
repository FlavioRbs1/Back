package com.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Model.Metrica;
import com.Repository.MetricaRepository;

@RestController
@RequestMapping("/api/metrica")
public class MetricaController {
	
	@Autowired
	MetricaRepository repository;
	
	@PostMapping(value ="/save")
	public Metrica save(@RequestBody Metrica metrica) {
		return repository.save(metrica);
	}

	@GetMapping(value="/vermelho")
	public Double buscaClassificacaoCpfVermelho() {
		return repository.getClassificacaoCpfVermelho();
	}

	@GetMapping(value="/verde")
	public Double buscaClassificacaoCpfVerde() {
		return repository.getClassificacaoCpfVerde();
	}

	@GetMapping(value="/amarelo")
	public Double buscaClassificacaoCpfAmarelo() {
		return repository.getClassificacaoCpfAmarelo();
	}

	@GetMapping(value="/azul")
	public Double buscaPendenciasAzul() {
		return repository.getPendenciasAzul();
	}
	
	@GetMapping(value="/rendaAzul")
	public Double buscaRendaAzul() {
		return repository.rendaAzul();
	}

	@GetMapping(value="/rendaAmarelo")
	public Double buscaRendaAmarelo() {
		return repository.rendaAmarelo();
	}

	@GetMapping(value="/rendaVerde")
	public Double buscaRendaVerde() {
		return repository.rendaVerde();
	}

	@GetMapping(value="/rendaVermelho")
	public Double buscaRendaVermelho() {
		return repository.rendaVermelho();
	}
	
	@GetMapping(value="/perc")
	public Double buscaPercentual() {
		return repository.getPercentual();
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Object> lista(@PathVariable(name="id")Integer id) {
		return ResponseEntity.ok(repository.findByid(id));
	}
	
	@PutMapping (value = "/{id}")
	public Metrica replace(@PathVariable Integer id,@RequestBody Metrica metrica) {
		return repository.save(metrica);
		
	}
}
