package br.com.trabalho.linguagem.sistema.ongs.compartilhado;

public class Endereco {

    private final String rua;
    private final String numero;
    private final String complemento;
    private final Cidade cidade;

    public Endereco(String rua, String numero, String complemento, Cidade cidade) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (!getRua().equals(endereco.getRua())) return false;
        if (!getNumero().equals(endereco.getNumero())) return false;
        if (!getComplemento().equals(endereco.getComplemento())) return false;
        return getCidade().equals(endereco.getCidade());
    }

    @Override
    public int hashCode() {
        int result = getRua().hashCode();
        result = 31 * result + getNumero().hashCode();
        result = 31 * result + getComplemento().hashCode();
        result = 31 * result + getCidade().hashCode();
        return result;
    }
}
