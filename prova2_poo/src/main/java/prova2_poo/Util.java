/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2_poo;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public class Util {

    public static String formatarData(LocalDate Data) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formatar.format(Data);
    }

    public static String formatarMoney(double Valor) {
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(Valor);
    }
}
