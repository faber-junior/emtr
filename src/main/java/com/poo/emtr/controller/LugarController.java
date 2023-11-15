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

import com.poo.emtr.model.Lugar;
import com.poo.emtr.repository.LugarRepository;

@RestController
@RequestMapping("/lugares")
public class LugarController 
{
	@Autowired
	private LugarRepository lugarRepository;
	
	@GetMapping
	public List<Lugar> getAllLugares()
	{
		return lugarRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Lugar adicionarLugar(@RequestBody Lugar lugar)
	{
		return lugarRepository.save(lugar);
	}
	
	 @PutMapping("/{id}")
	    public Lugar atualizarLugar(@PathVariable Long id, @RequestBody Lugar lugarAtualizado) {
	        return lugarRepository.findById(id)
	                .map(lugar -> {
	                    lugar.setId_cliente(lugarAtualizado.getId_cliente());
	                    lugar.setId_viagem(lugarAtualizado.getId_viagem());
	                    // Adicione outros campos que você deseja atualizar
	                    return lugarRepository.save(lugar);
	                })
	                .orElseGet(() -> {
	                    lugarAtualizado.setId(id);
	                    return lugarRepository.save(lugarAtualizado);
	                });
	    }

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void excluirLugar(@PathVariable Long id) {
	        lugarRepository.deleteById(id);
	    }
}
