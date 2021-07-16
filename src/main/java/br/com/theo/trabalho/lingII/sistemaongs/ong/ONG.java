package br.com.theo.trabalho.lingII.sistemaongs.ong;

import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Causa;
import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Endereco;
import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Usuario;

import java.util.List;

public class ONG implements Usuario {

    private final String nome;
    private String descricao;
    private String url;
    private final String email;
    private final Endereco endereco;
    private final Causa causa;
    private String gestorNome;
    private String telefone;
    private final List<Publicacao> publicacoes;
    private String senha;

    public ONG(String nome, String email, Endereco endereco, Causa causa, List<Publicacao> publicacoes,String senha) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.causa = causa;
        this.publicacoes = publicacoes;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Causa getCausa() {
        return causa;
    }

    public String getGestorNome() {
        return gestorNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setGestorNome(String gestorNome) {
        this.gestorNome = gestorNome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public String getLogin() {
        return this.email;
    }
}
