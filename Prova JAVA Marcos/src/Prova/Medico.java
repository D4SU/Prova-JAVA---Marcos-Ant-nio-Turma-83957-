/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
//Inserindo os atributos e especificando o tipo das variáveis
    private String crm;
    
    //Construct

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }

   
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() + 
                "/n CRM: " + crm;
    }
    
    //Getter and Setter

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    

    
}
