package com.Control;


import com.Model.Enderecos;
import com.Repository.EnderecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/api/enderecos")
public class EnderecosController {

    private final EnderecosRepository repository;

    @Autowired
    public EnderecosController(EnderecosRepository repository){
        this.repository = repository;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Enderecos salvar(@RequestBody Enderecos enderecos){
        return  repository.save(enderecos);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Enderecos enderecoatualizado){
        repository
                .findById(id)
                .map(enderecos -> {
                    enderecoatualizado.setId(enderecos.getId());
                    return  repository.save(enderecoatualizado);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }



}
