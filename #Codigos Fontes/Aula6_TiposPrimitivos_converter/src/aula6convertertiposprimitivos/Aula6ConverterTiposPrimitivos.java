/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6convertertiposprimitivos;

/**
 *
 * @author luizd
 */
public class Aula6ConverterTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Formaas de converter
            inteiro para String: String.valueOf(1);
            inteiro para String: Integer.toString(texto);
        
            String para inteiro: Integer.parseInt("texto");
            
        
        */
        
        int idade = 30;
        String idade1 = String.valueOf(idade); // inteiro para String
        System.out.println("A idade é: "+idade1);
        
        int idade5 = 40;
        String idade6 = Integer.toString(idade5); // inteiro para String
        System.out.println("A idade é: "+ idade6);
        
        String idade3 = "50";
        int idade4 = Integer.parseInt(idade3); // String para inteiro
        System.out.println("A idade é: "+idade4);
        
        String idade7 = "7.0";
        double idade8 = Double.parseDouble(idade7);
        System.out.println("A idade é: "+idade7);
        
        
        
        
    }
    
}
