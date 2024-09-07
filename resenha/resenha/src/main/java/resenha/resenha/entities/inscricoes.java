package resenha.resenha.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class inscricoes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Listas lista;

    @ManyToMany
    private List<Jogador> jogadores;


    public inscricoes() {
    }

    public inscricoes(int id, Listas lista) {
        this.id = id;
        this.lista = lista;
    }

    public Listas getLista() {
        return lista;
    }

    public void setLista(Listas lista) {
        this.lista = lista;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
