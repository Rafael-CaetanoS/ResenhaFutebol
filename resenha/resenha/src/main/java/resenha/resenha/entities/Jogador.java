package resenha.resenha.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (length = 100, nullable = false)
    private String nome;

    @Column (length = 20, nullable = false,unique = true)
    private String cpf;

    @Column (precision = 3, nullable = false)
    private int idade;

    @Column (length = 20, nullable = false)
    private String estado;

    @Column (length = 20, nullable = false)
    private String posicao;

    @OneToMany (mappedBy = "jogador")
    private List<Listas> lista;

    @ManyToMany (mappedBy = "jogadores")
    private  List<inscricoes> iscricoes;


    public Jogador() {
    }

    public Jogador(String nome, String cpf, int idade, String estado, String posicao) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.estado = estado;
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Listas> getLista() {
        return lista;
    }

    public void setLista(List<Listas> lista) {
        this.lista = lista;
    }
}
