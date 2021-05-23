package com.Control;

import com.Model.Pedidos;
import com.Repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public Pedidos acharPorid(@PathVariable Integer id){
        return  repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Pedidos pedidoatualizado){
        repository
                .findById(id)
                .map(pedidos -> {
                    pedidoatualizado.setId(pedidos.getId());
                    return  repository.save(pedidoatualizado);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
