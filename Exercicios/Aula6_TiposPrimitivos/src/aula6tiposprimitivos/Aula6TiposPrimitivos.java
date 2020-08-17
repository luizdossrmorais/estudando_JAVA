/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author luizd
 */
public class Aula6TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* A linguagem Java ´é FORTEMENTE TIPADA (os tipos são importantes)
                DECLARAÇÃOxTIPO
                4-TIPOS(float,int,char,string)>>FAMILIAS
                    int > (int) > Integer (Ex: 2)
                    float > (float) > Float (Ex: 32.5)
                    char > (char) > Character (Ex:'M')
                    boolean > (boolean) > Boolean (Ex: true, False)
                    xx   > xx > String (Ex: "casa")
                    
                3 - MANEIRAS BASICAS de Declarar variaveis
                    1- SIMPLES
                    2-typecast(ESPECIFICA O TIPO)Ex:
                            int numero = 1; (aqui o 1 tambem é real,então para especificar)
                            int numero = (int)1;(assim especifico que esse é um numero inteiro)
                    3-classe(Wrapper ou INVOLUCRO)
                
        */
        String nome = "Luiz";
        float nota = 8.5f;        // Tipos Primitivos: SIMPLES [float nota - DECLARAÇÃO][= 8.5f; - ATRIBUIÇÃO]
        float nota1 = (float)8.0; // Tipos Primitivos: typecast. 
        
        System.out.print("A nota1 é:"+nota); // System.out.print (sem ln = mesma linha)
        System.out.println("A nota2 é:" + nota1); // System.out.println (com ln = outra linha)
        System.out.printf("A nota é: %f",nota); // System.out.printf (com f = formatado - variavel nota toma seu lugar)
        System.out.printf("A nota é: %.2f",nota); // System.out.printf (com %.2f = tipo float, 2 casas decimais, atribuicao da variavel toma conta)
        System.out.printf("A nota é: %.3f \n",nota); //System.out.printf(com \n = pular linha)
        System.out.printf("A nota de %s é: %.4f \n",nome,nota);//System.out.printf (con %s = String - String nome toma seu lugar)
        System.out.format("A nota de %s é: %.5f \n",nome,nota); //System.out.printf (com format = a mesma coisa de print(f) )
        

        Scanner teclado = new Scanner(System.in); //captura teclado
        System.out.print("Digite seu nome:_ ");
        String nome1 = teclado.nextLine();
        System.out.print("Digite sua nota:_ ");
        float nota3 = teclado.nextFloat();
        
        System.out.println("Ola "+nome1+" sua nota é: "+nota3);
    }
    
}
