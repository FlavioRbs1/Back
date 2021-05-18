package com.Control;

import com.Model.Contas_Receber;
import com.Repository.Contas_ReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static java.lang.Void.TYPE;

@RestController
@RequestMapping("/api/contasreceber")
public class ContasReceberController {

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
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(contasreceber ->{
                    repository.delete(contasreceber);
                    return TYPE;
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Contas_Receber contasreceberatualizado){
        repository
                .findById(id)
                .map(contasreceber ->{
                    contasreceberatualizado.setId(contasreceber.getId());
                    return repository.save(contasreceberatualizado);
                })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

}
