/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2_poo;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {

    private String carteiradeHabilitacao;

    public Motoboy(String carteiradeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    public String getCarteiradeHabilitacao() {
        return carteiradeHabilitacao;
    }

    public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;
    }

    @Override
    public String toString() {
        return "Motoboy" + super.toString()
                + "\nCarteiradeHabilitacao=" + carteiradeHabilitacao;
    }

}
