/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa {
    //Inserindo os atributos e especificando o tipo da variável
    protected LocalDate dataNascimento;
    protected Genero genero;
    
    //Construct

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    //method getIdade()
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n Data de Nascimento: " + dataNascimento + 
                "\n Genero: " + genero.getTexto()+
                "\n Idade: " + getIdade();
    }
    
    //Getter and Setter

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
}
