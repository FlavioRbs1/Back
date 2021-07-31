package com.Controller;
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
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Object> busca(@PathVariable(name="id",required = false)Integer id) {
		return ResponseEntity.ok(repository.findById(id));
	}

	@PutMapping (value = "/{id}")
	public Metrica replace(@PathVariable Integer id,@RequestBody Metrica metrica) {
		return repository.save(metrica);
		
	}
}
