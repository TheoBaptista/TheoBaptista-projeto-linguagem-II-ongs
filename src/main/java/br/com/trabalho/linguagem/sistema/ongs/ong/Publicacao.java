package br.com.trabalho.linguagem.sistema.ongs.ong;

import br.com.trabalho.linguagem.sistema.ongs.compartilhado.Cidade;

import java.time.LocalDate;

public class Publicacao {

    private String descricao;
    private final ONG ong;
    private final LocalDate dataDaAcao;
    private final LocalDate dataDeRegistro = LocalDate.now();
    private final Cidade cidadeDaAcao;

    public Publicacao(ONG ong, LocalDate dataDaAcao, Cidade cidadeDaAcao) {
        this.ong = ong;
        this.dataDaAcao = dataDaAcao;
        this.cidadeDaAcao = cidadeDaAcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public ONG getOng() {
        return ong;
    }

    public LocalDate getDataDaAcao() {
        return dataDaAcao;
    }

    public LocalDate getDataDeRegistro() {
        return dataDeRegistro;
    }

    public Cidade getCidadeDaAcao() {
        return cidadeDaAcao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
