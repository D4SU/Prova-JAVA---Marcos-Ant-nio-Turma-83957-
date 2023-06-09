/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

/**
 *
 * @author Aluno
 */
public class Endereco {
   //Inserindo atributos e o tipo das variáveis
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected UnidadeFederativa uf;
    
    //Construct
    public Endereco(String logradouro, String numero, String complemento, String cep, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.uf = uf;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n ///INFORMACOES DO ENDERECO///" +
                "\n Logradouro: " + logradouro + 
                "\n Numero: " + numero + 
                "\n Complemento: " + complemento + 
                "\n CEP: " + cep + 
                "\n UF: " + uf.getNome() +
                "\n";
    }
    
    //Getter and Setter

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
    
}
