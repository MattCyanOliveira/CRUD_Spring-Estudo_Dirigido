package CRUD_Spring.Estudo_Dirigido.controller;

import CRUD_Spring.Estudo_Dirigido.model.Cliente;
import CRUD_Spring.Estudo_Dirigido.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Exercício 2 – Entidade simples
    @GetMapping("/exemplo")
    public Cliente exemplo() {
        return new Cliente(1L, "Maria Silva", "maria@email.com");
    }

    // Exercício 3/4 – Lista de clientes
    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    // Exercício 5 – POST
    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Exercício 6 – GET por ID
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Exercício 7 – PUT
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteRepository.findById(id)
                .map(c -> {
                    c.setNome(cliente.getNome());
                    c.setEmail(cliente.getEmail());
                    return clienteRepository.save(c);
                }).orElse(null);
    }

    // Exercício 8 – DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}