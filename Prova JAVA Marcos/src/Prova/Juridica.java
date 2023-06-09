/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa {
    //Inserindo os atributos e especificando o tipo das variáveis
    private String cnpj;
    private String inscricaoEstadual;
    
    //Construct

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() + 
                "\n CNPJ: " + cnpj + 
                "\n Inscricao Estadual: " + inscricaoEstadual;
    }
    
    //Getter and Setter

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
