/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
//Inserindo os atributos
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    //Tipo da variável
    protected String texto;
    protected char caractere;
    
    //Construct

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
   

   
    
}
