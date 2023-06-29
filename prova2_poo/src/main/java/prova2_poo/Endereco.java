/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2_poo;

/**
 *
 * @author Aluno
 */
public class Endereco {

    protected String logadouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa unidadeFederativa;

    public Endereco(String logadouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    @Override
    public String toString() {
        return "\nLogadouro=" + logadouro
                + "\nNumero=" + numero
                + "\nComplemento=" + complemento
                + "\nCep = " + cep
                + "\nCidade = " + cidade
                + "\nUnidadeFederativa=" + unidadeFederativa.getSigla();
    }

}
