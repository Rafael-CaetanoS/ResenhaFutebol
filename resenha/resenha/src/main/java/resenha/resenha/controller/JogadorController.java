package resenha.resenha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resenha.resenha.entities.Jogador;
import resenha.resenha.repository.JogadorRepository;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
    @Autowired
    private JogadorRepository jogadorRepository;

    @PostMapping
    private Jogador inseriJogador(@Validated Jogador jogador){
        jogadorRepository.save(jogador);
        return jogador;
    }

    @GetMapping
    private Iterable<Jogador> retornaJogadores(){
      return jogadorRepository.findAll();
    }
}


