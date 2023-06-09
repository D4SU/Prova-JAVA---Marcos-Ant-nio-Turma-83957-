
package Prova;

import java.time.LocalDate;


public class Cliente extends Fisica {
    //Inserido os atributos e especificando o tipo das variáveis
    private int protocoloAtendimento;
    
    //Construct

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
    //Getter and Setter

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
    
   
}
