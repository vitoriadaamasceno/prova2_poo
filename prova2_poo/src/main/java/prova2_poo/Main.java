/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package prova2_poo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
       System.out.println("Funcionarios");
       Engenheiro engenheiro = new Engenheiro("1584", "Douglas", "0458.958.985-89", "15589669200", new Endereco("Rua Azul", "9", "prox ao bar", "4589698", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 2000, EstadoCivil.CASADO, LocalDate.of(1997, Month.MARCH, 2));
       Motoboy moto = new Motoboy("1588952522", "Maria", "055.859.698-98", "1558896559", new Endereco("Rua Verde", "10", "Prox a rua amarela", "45896823", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.FEMININO, 1000, EstadoCivil.CASADO, LocalDate.of(1999, Month.AUGUST, 5));
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Marcio Melo", "256.699.698-98","1558596963", new Endereco("Rua Amarela", "1", "Prox a rua", "4589996", "São Paulo", UnidadeFederativa.SAO_PAULO ), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 3000, EstadoCivil.CASADO, LocalDate.of(1985, Month.MARCH, 20));
       Direitor direitor = new Direitor(Bonificacao.DIREITOR, "Bruna", "049.998.889-86", "158892926", new Endereco("Rua Roxa", "20e", "Prox a rua azul", "45896823", "Feira de Santana", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.MASCULINO, 4000, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.FEBRUARY, 7));
        System.out.println("");
        System.out.println(direitor);
        System.out.println("");
        System.out.println(gerente);
        System.out.println("");
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println("Admissão e Demissao");
        direitor.admitir(moto);
        System.out.println("");
        direitor.demitir(moto);
        
    }
}
