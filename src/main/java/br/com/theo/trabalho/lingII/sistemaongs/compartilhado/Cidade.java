package br.com.theo.trabalho.lingII.sistemaongs.compartilhado;

public class Cidade {

    private final String nome;
    private final Estado estado;

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }
}
