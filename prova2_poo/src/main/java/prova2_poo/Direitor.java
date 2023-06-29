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
public class Direitor extends CargoDeConfianca implements Contratacao {

    private double PREMIO = 0.3;

    public Direitor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return salario + (salario * super.bonificacao.DIREITOR.valor) + (salario * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir Funcionario : " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir Funcionario : " + funcionario.toString());
    }

    @Override
    public String toString() {
        return  "Direitor" + super.toString() + "\nPREMIO=" + (PREMIO * 100) + '%'
                + "\nSalarioFinal = " + Util.formatarMoney(getSalarioFinal());
    }

}
