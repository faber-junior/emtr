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

import com.poo.emtr.model.Viagem;
import com.poo.emtr.repository.ViagemRepository;

@RestController
@RequestMapping("/viagens")
public class ViagemController 
{
	@Autowired
	private ViagemRepository viagemRepository;
	
	@GetMapping
	public List<Viagem> getAllViagens()
	{
		return viagemRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Viagem adicionarViagem(@RequestBody Viagem viagem)
	{
		return viagemRepository.save(viagem);
	}
	
	@PutMapping("/{id}")
    public Viagem atualizarViagem(@PathVariable Long id, @RequestBody Viagem viagemAtualizada) {
        return viagemRepository.findById(id)
                .map(viagem -> {
                    viagem.setOrigem(viagemAtualizada.getOrigem());
                    viagem.setDestino(viagemAtualizada.getDestino());
                    // Adicione outros campos que você deseja atualizar
                    return viagemRepository.save(viagem);
                })
                .orElseGet(() -> {
                    viagemAtualizada.setId(id);
                    return viagemRepository.save(viagemAtualizada);
                });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirViagem(@PathVariable Long id) {
        viagemRepository.deleteById(id);
    }
}
