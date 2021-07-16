package br.com.theo.trabalho.lingII.sistemaongs.voluntario;

import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Causa;
import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Endereco;
import br.com.theo.trabalho.lingII.sistemaongs.compartilhado.Usuario;

import java.util.List;

public class Voluntario implements Usuario {

    private final String nome;
    private final String email;
    private final Endereco endereco;
    private final List<Causa> causasDeInteresse;
    private String telefone;
    private String senha;

    public Voluntario(String nome, String email, Endereco endereco, List<Causa> causasDeInteresse, String telefone,String senha) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.causasDeInteresse = causasDeInteresse;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Causa> getCausasDeInteresse() {
        return causasDeInteresse;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voluntario that = (Voluntario) o;

        if (!getNome().equals(that.getNome())) return false;
        return getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
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
