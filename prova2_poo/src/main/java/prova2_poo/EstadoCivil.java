/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova2_poo;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
