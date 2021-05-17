package com.Control;

import com.application.Model.Pedidos;
import com.application.Repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static java.lang.Void.TYPE;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {

    private final PedidosRepository repository;

    @Autowired
    public PedidosController(PedidosRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedidos salvar(@RequestBody Pedidos pedidos){
        return repository.save(pedidos);
    }

    @GetMapping("{id}")
    public Pedidos achaPorId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository.findById(id).map(pedidos -> {
            repository.delete(pedidos);
            return TYPE;
        })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PutMapping("id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void  atualizar(@PathVariable Integer id, @RequestBody Pedidos pedidosatualizado){
        repository.findById(id).map(pedidos -> {
            pedidosatualizado.setId(pedidos.getId());
            return  repository.save(pedidosatualizado);
        })
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
