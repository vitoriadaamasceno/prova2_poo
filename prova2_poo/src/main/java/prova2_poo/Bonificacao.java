/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova2_poo;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.15),
    DIREITOR(0.25);

    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
