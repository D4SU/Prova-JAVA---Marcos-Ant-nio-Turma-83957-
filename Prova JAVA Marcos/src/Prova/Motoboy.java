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
public class Motoboy extends Funcionario{
    //Inserindo os atributos e especificando o tipo das variáveis
    private String cnh;
    
    //Construct

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

   

    

    
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() + 
                "\n CNH: " + cnh;
    }
    
    //Getter and Setter

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
    
}
