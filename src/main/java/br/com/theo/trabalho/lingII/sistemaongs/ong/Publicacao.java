package br.com.theo.trabalho.lingII.sistemaongs.ong;

import java.time.LocalDate;

public class Publicacao {

    private String descricao;
    private final ONG ong;
    private final LocalDate dataDaAcao;
    private final LocalDate cidadeDaAcao;

    public Publicacao(String descricao, ONG ong, LocalDate dataDaAcao, LocalDate cidadeDaAcao) {
        this.descricao = descricao;
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

    public LocalDate getCidadeDaAcao() {
        return cidadeDaAcao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
