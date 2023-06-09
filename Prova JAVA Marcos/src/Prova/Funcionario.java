
package Prova;

import java.time.LocalDate;


public abstract class Funcionario extends Fisica {
    //Inserindo os atributos e especificando o tipo das variáveis
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;
    
    //Construct

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    //method toString()
    @Override
    public String toString() {
        return super.toString() +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n Matricula: " + matricula +
                "\n Setor: " + setor.getNome() + 
                "\n Salario: " + salario;
    }
    
    //Getter and Setter

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
}
