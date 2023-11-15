package com.poo.emtr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.poo.emtr.model.Cliente;
import com.poo.emtr.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController 
{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> getAllClientes()
	{
		return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionarCliente(@RequestBody Cliente cliente)
	{
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
       
        	return clienteRepository.findById(id)
                    .map(cliente -> {
                        cliente.setNome(clienteAtualizado.getNome());
                        cliente.setCpf(clienteAtualizado.getCpf());
                        // Adicione outros campos que você deseja atualizar
                        return clienteRepository.save(cliente);
                    })
                    .orElseGet(() -> {
                        // Aqui, não é necessário definir o ID, pois o cliente já existe
                        return clienteRepository.save(clienteAtualizado);
                    });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
