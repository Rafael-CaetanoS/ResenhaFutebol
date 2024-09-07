package resenha.resenha.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Listas {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 50, nullable = false)
    private String local;

    @Column(precision = 3, nullable = false)
    private int quantidade;

    @ManyToOne
    private  Jogador jogador;

    @OneToMany (mappedBy ="lista" )
    private List<inscricoes> inscricoes;

    public Listas() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<resenha.resenha.entities.inscricoes> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<resenha.resenha.entities.inscricoes> inscricoes) {
        this.inscricoes = inscricoes;
    }
}
