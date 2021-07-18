package br.com.trabalho.linguagem.sistema.ongs.ong;

import br.com.trabalho.linguagem.sistema.ongs.compartilhado.Causa;
import br.com.trabalho.linguagem.sistema.ongs.compartilhado.Endereco;
import br.com.trabalho.linguagem.sistema.ongs.usuario.Perfil;
import br.com.trabalho.linguagem.sistema.ongs.usuario.Usuario;

import java.util.List;

public class ONG implements Usuario {

    private final String nome;
    private String descricao;
    private String url;
    private final String email;
    private final Endereco endereco;
    private final Causa causa;
    private String gestor;
    private String telefone;
    private final List<Publicacao> publicacoes;
    private String senha;

    public ONG(String nome, String email, Endereco endereco, Causa causa, List<Publicacao> publicacoes, String senha) {
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

    public String getGestor() {
        return gestor;
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

    public void setGestor(String gestor) {
        this.gestor = gestor;
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

    @Override
    public Perfil getPerfil() {
        return Perfil.ONG;
    }
}
