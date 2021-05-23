package com.Control;

import com.Model.Inadimplencias;
import com.Repository.InadimplenciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static java.lang.Void.TYPE;

@RestController
@RequestMapping("/api/inadimplencias")
public class InadimplenciasController {

    private final InadimplenciasRepository repository;

    @Autowired
    public InadimplenciasController(InadimplenciasRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Inadimplencias salvar(@RequestBody Inadimplencias inadimplencias){
            return repository.save(inadimplencias);
    }

    @GetMapping("{id}")
    public Inadimplencias acharPorid(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(inadimplencias ->{
                    repository.delete(inadimplencias);
                    return TYPE;
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        }
        @PutMapping("{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void atualizar(@PathVariable Integer id, @RequestBody Inadimplencias inadimplenciasatualizado){
            repository
                    .findById(id)
                    .map(Inadimplencias ->{
                        inadimplenciasatualizado.setId(Inadimplencias.getId());
                        return repository.save(inadimplenciasatualizado);
                    })
                    .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));


        }

    }