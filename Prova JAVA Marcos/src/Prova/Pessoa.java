/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    
    //Inserindo os atributos e tipos da váriavel
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    
    //Construct
    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n ///INFORMACOES DA PESSOA///" +
                "\n Nome: " + nome + 
                "\n Telefone: " + telefone + 
                "\n E-Mail: " + email + 
                "\n" +
                "\n Endereco: " + endereco;
    }
    
    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
