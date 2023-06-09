/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
    //Inserindo os atributos
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operacoes");
    
    //Tipo da variável
    protected String nome;
    
    //Construct

    private Setor(String nome) {
        this.nome = nome;
    }
    
    //Getter

    public String getNome() {
        return nome;
    }
    
    
}
