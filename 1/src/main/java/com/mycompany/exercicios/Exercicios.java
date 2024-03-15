/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicios;

/**
 *
 * @author fernanda.nunes
 */
import java.util.Scanner;
public class Exercicios {
    static Scanner input =new Scanner(System.in);    
    public static void main(String[] args) {
        
        System.out.println("Um número inteiro e que retorne o dobro deste número");
        int numero=input.nextInt();
        System.out.println(Exe1.CalculaDobro(numero));
        
        System.out.println("Dois números inteiros e que retorne o maior entre eles");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println(Exe1.MostraMaior(num1, num2));
                
        System.out.println("Três números reais e que retorne a média aritmética desses três números"); 
        float  vetor[]=new float [3];
        vetor[0]=input.nextFloat();
        vetor[1]=input.nextFloat(); 
        vetor[2]=input.nextFloat();
        System.out.println(Exe1.CalculaMedia(vetor));
        
        System.out.println("Um número inteiro e que retorne o valor do fatorial deste número");
        double  numFat=input.nextInt();
        System.out.println(Exe1.CalculaFatorial(numFat));
       
        System.out.println("Um número inteiro e positivo, que retorne a soma dos elementos inteiros existentes entre 1 e o número (inclusive)");
        int somaInfinita=input.nextInt();
        System.out.println(Exe1.SomaInf(somaInfinita));
       
        System.out.println("Um número inteiro e que retorne true se o número for par, e false caso contrário");
        int par=input.nextInt();
        System.out.println(Exe1.VerificaPar(par));  
        
        
    }
}
