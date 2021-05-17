package com.Control;

import com.application.Model.Contas_Receber;
import com.application.Repository.Contas_ReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static java.lang.Void.TYPE;

@RestController
@RequestMapping("/api/contasreceber")
public class ClienteController {

    private final Contas_ReceberRepository repository;

    @Autowired
    public ContasReceberController(Contas_ReceberRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contas_Receber salvar(@RequestBody Contas_Receber contasreceber){
        return repository.save(contasreceber);
    }

    @GetMapping("{id}")
    public Contas_Receber acharPorid(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
   
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Cliente clienteatualizado){
        repository
                .findById(id)
                .map(cliente ->{
                    clienteatualizado.setId(cliente.getId());
                    return repository.save(clienteatualizado);
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

}
