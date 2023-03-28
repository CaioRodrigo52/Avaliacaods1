/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaods1;

/**
 *
 * @author Aluno
 */
public class Main {
    
   
    public static void main(String[] args) {
        
        Juridica juridica1 = new Juridica("000.000.000/0005-00", "0000000", 3347, "Caio", "00 00000-0000", "teste@gmail.com", 
                             new Endereco("Curuzu", "99", "Apos a Ribeira", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
                
        System.out.println(juridica1.toString());
        
        Cliente cliente1 = new Cliente(000000000000, 47, Genero.FEMININO, 964445, "Lorena", "00 00000-0000", "teste@gmail.com", 
                          new Endereco("Lapa", "99", "Proximo ao shopping piedade", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(cliente1.toString());
        
        Advogado advogado1 = new Advogado("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.JURIDICO, 4500, 60, Genero.FEMININO, 54546, "Juliana", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Cajazeiras", "99", "Proximo ao bompreco", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
     
        
        System.out.println(advogado1.toString());
        
        Medico medico1 = new Medico("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.SAUDE, 4500, 35, Genero.FEMININO, 444556, "Rebeca", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Uruguai", "99", "Apos o Beco sete ", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(medico1.toString());
        
        Engenheiro engenheiro1 = new Engenheiro("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.ENGENHARIA, 4500, 64, Genero.FEMININO, 88956, "Deise", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Ribeira", "99", "Apos a penha", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(engenheiro1.toString());
        
    }
}
    

