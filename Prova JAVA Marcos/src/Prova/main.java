
package Prova;

import java.time.LocalDate;
import java.time.Month;


public class main {
    public static void main(String[] args) {
        
        //Criando object motoboy3
       Motoboy motoboy3 = new Motoboy("42.456.77", "045.135.664-78", "34.555.222-1", "xen123", Setor.OPERACOES, 1740.98, LocalDate.of(1997, Month.JUNE, 12), Genero.FEMININO, "Jessica Dias", "71 98732-6972", "jessicadiias@hotmail.com", 
               new Endereco ("Rua das Rosas", "354", "Apto 308, Bloco D", "42.777-092", UnidadeFederativa.BAHIA));
                
       // Criando object medicoOrtopedista 
       Medico medicoOrtopedista = new Medico("43.342.55", "632.472.553-09", "14.222.454-6", "yen564", Setor.SAUDE, 7590.43, LocalDate.of(1976, Month.MARCH,30), Genero.MASCULINO, "Jose Felipe", "51 99876-3140", "consultoria.josefelipe@yahoo.com", 
               new Endereco("Alameda Catanea", "725", "Consultório 204, ao lado da Sorveteria Yemanjá", "44.280-000", UnidadeFederativa.SAO_PAULO));
       
       //Criando object advogadoCriminal
       Advogado advogadoCriminal = new Advogado("23.549.96", "453.761.967-02", "87.540.651-8", "Wan965", Setor.JURIDICO, 5320.60, LocalDate.of(1968, Month.JANUARY, 23), Genero.FEMININO, "Leticia Amorin", "42 93246-6578", "leticiaamorinnn123@gmail.com", 
               new Endereco("Rua da Perdicao", "435", "Bloco 15, em frente a fonte", "71.677-061", UnidadeFederativa.RIO_DE_JANEIRO));
       
       //Criando object pessoaJuridica
       Juridica pessoaJuridica = new Juridica("423.753.555-22", "inscricaoo n56-99877.1112", "Sorveteria Yemanja", "71 3497-5621", "sorvetesyemanja@uol.com.br", 
               new Endereco("Alameda Padua", "566", "Vizinho a Casa das Frutas Piedade", "87.971-007", UnidadeFederativa.BAHIA));
       
       
        //Exibindo resultados
        
        System.out.println("Os dados apresentados para o funcionario Motoboy sao: ");
        System.out.println("\n");
        System.out.println(motoboy3.toString());
        
        System.out.println("\n Os dados apresentados para o funcionario Médico sao: ");
        System.out.println("\n");
        System.out.println(medicoOrtopedista.toString());
        
        System.out.println("\n Os dados apresentados para o funcionario Advogado sao: ");
        System.out.println("\n");
        System.out.println(advogadoCriminal.toString());
        
        //Resultados para pessoaJuridica
        System.out.println("\n Os dados apresentados para a pessoa juridica sao: ");
        System.out.println("\n");
        System.out.println(pessoaJuridica.toString());
        
        
    }
    
}
